package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ProductBean;
import model.ProductModel;

public class ClientHomePageController extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductModel productModel = new ProductModel();
		ArrayList<ProductBean> productLst = new ArrayList<ProductBean>();
		ArrayList<ProductBean> productLstSearch = new ArrayList<ProductBean>();
		productLst = productModel.productNew();
		request.setAttribute("productLst", productLst);
		
		if(request.getParameter("searchBtn")!= null){
			System.out.println("tim kiem");
			String searchText = request.getParameter("searchText");
			if(searchText != null || !"".equals(searchText)){
				productLstSearch = productModel.searchProducts(searchText);
				request.setAttribute("productLst", productLstSearch);
				if(productLstSearch.isEmpty()){
					System.out.println("list null");
				}
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher("/ClientHomePage.jsp");
		rd.forward(request, response);
	}
}
