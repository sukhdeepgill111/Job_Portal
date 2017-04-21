

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Signup
 */
@WebServlet("/Signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signup() {
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
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
	 	String s5 = request.getParameter("userName");
	 	String s1 = request.getParameter("firstName");
	 	String s2 = request.getParameter("lastName");
	 	String s3 = request.getParameter("gender");
	 	String s6 = request.getParameter("passwd");
	 	String s7 = request.getParameter("email");
	 	if (s5 != null && s1 != null && s2 != null && s3 != null && s6 != null && s7 != null) {
	 		try {
	 			out.println("success");
	 			
				String DB_URL = "jdbc:mysql://localhost/students";
				String USER = "root";
				String PASS = "bhatinda4";
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				String sql = "insert into applicant values('" + s1 + "','" + s2 + "','" + s3 + "','" + s5 + "','"
	 					+ s6 + "','" + s7 + "')";
				stmt.execute(sql);

	 		} catch (Exception e) {
	 			out.println(e);
	 		}
	 	}
	}

}
