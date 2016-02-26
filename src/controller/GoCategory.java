package controller;

import dao.Product;
import java.io.IOException;
import java.util.Vector;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DbConnector;

/**
 * Servlet implementation class GoCategory
 */
@WebServlet("/GoCategory")
public class GoCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       DbConnector dbConnector;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GoCategory() {
        super();
        // object from database model class
        dbConnector = new DbConnector();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
                
                int productId=Integer.parseInt(request.getParameter("value"));
                RequestDispatcher dispatcher= request.getRequestDispatcher("Product.jsp");
                
                RequestDispatcher dispatcherAdmin= request.getRequestDispatcher("../Product.jsp");
                
                /**
                 * 
                 * @author atef
                 * this part of code is used to create a bean
                 */
                Vector<Product> products=dbConnector.getProducts(productId);
                // add the vector of products to the request paramters 
                request.setAttribute("products",products);
                
                
                dispatcher.forward(request, response);
                
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
