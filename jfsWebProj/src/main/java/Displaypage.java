

import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.product;
import view.finalcall;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Servlet implementation class Displaypage
 */
public class Displaypage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Displaypage() {
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
		String productid=request.getParameter("productid");
		String productname=request.getParameter("product_name");
		product p=new product(productid,productname,"20",20000);
		System.out.println(p);
		finalcall fincall=new finalcall();
		try {
			fincall.display();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
//		if(productid=="11")
//		{
//			response.sendRedirect("NewFile.jsp");
//		}
//		else {
//			response.sendRedirect("NewFile.jsp");
//	}
	}

}
