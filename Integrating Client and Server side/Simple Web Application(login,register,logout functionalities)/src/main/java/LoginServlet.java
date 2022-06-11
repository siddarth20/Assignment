
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname = request.getParameter("firstname");
        String password = request.getParameter("password");
        boolean status=false;
        try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        try (java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql:///employee", "root", "");

            java.sql.PreparedStatement preparedStatement = connection.prepareStatement("select * from employee_details where FirstName = ? and Password = ? ")) {
            preparedStatement.setString(1, firstname);
            preparedStatement.setString(2,password);

            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            status = rs.next();

        } catch (SQLException e) {
            System.out.println(e);
        }
        if (status) {
            response.sendRedirect("loginSuccess.jsp");
        } else {
        	 request.setAttribute("data", "Please enter correct details");
        	 RequestDispatcher rd = request.getRequestDispatcher("login.jsp"); 
             rd.forward(request, response);
        
        }
        
    }
	}


