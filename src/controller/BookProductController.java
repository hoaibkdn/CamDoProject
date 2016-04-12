package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.BookBean;
import bean.ClientBean;
import library.RemindTask;
import model.BookModel;
import model.ProductModel;
import java.util.Timer;
import java.util.TimerTask;
import java.sql.Timestamp;
/**
 * Servlet implementation class BookProductController
 */
public class BookProductController extends HttpServlet{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idProduct = request.getParameter("idProduct");
		ProductModel pModel = new ProductModel();
		BookModel bookModel = new BookModel();
		request.setAttribute("objProduct", pModel.productById(idProduct));
		if(request.getParameter("submit")!=null){
			String nameClient = request.getParameter("nameClientTxt");
			String address = request.getParameter("addressTxt");
			String phoneNumber = request.getParameter("phoneNumberTxt");
			String email = request.getParameter("emailTxt");
			String ideaClient = request.getParameter("ideaClientTxt");
			Timestamp dateCurrent = new Timestamp(System.currentTimeMillis());
			BookBean bookBean = new BookBean();
			bookBean.setIdProduct(idProduct);
			bookBean.setIdeaClient(ideaClient);
			bookBean.setBookDate(dateCurrent);
			System.out.println("date from system: "+dateCurrent );
			System.out.println("date from system: "+bookBean.getBookDate() );
			ClientBean clientBean = new ClientBean(null, nameClient, address, phoneNumber, email);
			bookModel.insertBook(bookBean, clientBean, idProduct);
			response.sendRedirect(request.getContextPath()+"/ClientHomePage");
			
		} else{
			RequestDispatcher rd = request.getRequestDispatcher("/BookProduct.jsp");
			rd.forward(request, response);
		}
	}
}
