package eduhelp.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class firstdbserv
 */
@WebServlet("/firstdbserv")
public class firstdbserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public firstdbserv() {
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
		// TODO Auto-generated method stub
		doGet(request, response);
		
		PrintWriter out = response.getWriter();
        String custIC = request.getParameter("custIC");
        String custName = request.getParameter("custName");
        String custUname = request.getParameter("custUname");
        String custPassword = request.getParameter("custPassword");
        String custEmail = request.getParameter("custEmail");
        String custPhoneNum = request.getParameter("custPhoneNum"); 
        String custAddress = request.getParameter("custAddress"); 
        //String fileLicense = request.getParameter("fileLicense"); 
        try {

            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test5","root","");

            Statement st = conn.createStatement();

            String sql = "insert into customer (custIC,custName,custUname,custPassword,custEmail,custPhoneNum,custAddress) values('"+custIC+"','"+custName+"','"+custUname+"','"+custPassword+"','"+custEmail+"','"+custPhoneNum+"','"+custAddress+"')";

            st.executeUpdate(sql);
            out.println("Data is Successfully Inserted into customer Table");
               }catch (ClassNotFoundException e) {

              e.printStackTrace();

        } catch (SQLException e) {

              e.printStackTrace();

         }
	}

}
