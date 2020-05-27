package controller;

import java.io.IOException;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.ConnectionManager;



@WebServlet(urlPatterns= {"/signup"})
public class SignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SignUpController() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Sign up Controller");
		// Fill your code here
		Connection con=null;
		ConnectionManager connectionManager=new ConnectionManager();
		
		try {
			con=connectionManager.getConnection();
			
			if(con!=null) {
				System.out.println("Connection Established");
			}else {
				System.out.println("Check your Connection");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/signupView.jsp");
		rd.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request,response);
		
	}

}
