package controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.UserBean;
import model.UserModel;

public class LoginController extends HttpServlet {

	public LoginController() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		if (req.getParameter("submit") != null) {
			System.out.println("submit");
			HttpSession session = req.getSession();
			UserModel userModel = new UserModel();
			String idCard = req.getParameter("idCardTxt");
			String password = req.getParameter("passwordTxt");
			Timestamp rencentLoginDate = new Timestamp(System.currentTimeMillis());
			//NguoiDungBean userBean = new NguoiDungBean(soCMND, matkhau, "", "", "", "", "", "", "", -1, "", date, date);
			UserBean userBean = new UserBean();
			userBean.setIdCard(idCard);
			userBean.setPassword(password);
			userBean.setRencentLoginDate(rencentLoginDate);
			System.out.println(rencentLoginDate);
			if(userModel.login(userBean) != null){
				session.setAttribute("SessionUser", userBean);
				System.out.println("phan quyen: "+userBean.getDecentralization());
				System.out.println("name of user: "+userBean.getUsername());
				resp.sendRedirect(req.getContextPath() + "/ClientHomePage");
			}
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("/Login.jsp");
			rd.forward(req, resp);
		}
	}
}
