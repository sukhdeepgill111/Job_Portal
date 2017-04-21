

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Emp_reg
 */
@WebServlet("/Emp_reg")
public class Emp_reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Emp_reg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("username");
		String s2 = request.getParameter("passwd");
		String s3 = request.getParameter("web");

		if (s1 != null && s2 != null && s3 != null) {
			try {
				out.println("success");
				String DB_URL = "jdbc:mysql://localhost/students";
				String USER = "root";
				String PASS = "bhatinda4";
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				String sql = "insert into employer values('" + s1 + "','" + s2 + "','" + s3 + "')";
				stmt.execute(sql);

			} catch (Exception e) {
				out.println(e);
			}
		}
	}

}
