package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DbConnector;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		  author:donia
		 function get data from textfeild then check if one text field is empty stil in signup page
		 else insert data in database then go to in first page
		 */
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String date=request.getParameter("date");
		String pass=request.getParameter("pass");
		String job=request.getParameter("job");
		String e_mail=request.getParameter("e_mail");
		String credit_Limit=request.getParameter("credit_Limit");
		String address=request.getParameter("address");
		String interest=request.getParameter("interest");
		
		DbConnector obj=new DbConnector();
		if( !name.equals("")&& !date.equals("") & !pass.equals("") & !job.equals("") & !e_mail.equals("") & !credit_Limit.equals("") & !address.equals("") & !interest.equals("") & ! obj.checkDublicateUserInSignUp(e_mail)){
                    
                    
                       
                        obj.insertInDB(name,date,pass,job,e_mail,credit_Limit,address,interest);
                        response.sendRedirect("index.jsp");
                    
		}else{
			response.sendRedirect("SignUp.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
