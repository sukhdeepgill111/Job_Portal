
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.http.HttpSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		String k1 = request.getParameter("username");
		session.setAttribute("x1", k1);
		if (k1 != null) {
			try {

				String k2 = request.getParameter("passwd");

				String DB_URL = "jdbc:mysql://localhost/students";
				String USER = "root";
				String PASS = "bhatinda4";
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				String sql = "select * from employer where emp_name='" + k1 + "'";
				
				// and
																					// password='"+k2+"'";
				ResultSet rs = stmt.executeQuery(sql);
				rs.next();
				String pass = rs.getString(2);

				if (k2.equals(pass)) {
					response.sendRedirect("emp_home.jsp");
				} else {
					out.println("<script type=\"text/javascript\">");
					out.println("alert('Your ID and Password do not match.Enter a valid Login Id and Password.');");
					out.println("</script>");
				}

			} catch (Exception e) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('INVALID USER ID');");
				out.println("</script>");
			}

		}

	}

}
