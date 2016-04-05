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

import bean.NguoiDungBean;
import model.NguoiDungModel;

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
		/*
		 * String nambtn = req.getParameter("dangNhapBtn");
		 * System.out.println(nambtn); NguoiDungModel userModel = new
		 * NguoiDungModel(); NguoiDungBean userBean = new NguoiDungBean();
		 * if(req.getParameter("dangNhapBtn") != null){ String userId =
		 * req.getParameter("cmndTxt"); String password =
		 * req.getParameter("matKhauTxt"); userBean.setSoCMND(userId);
		 * userBean.setMatkhau(password); System.out.println("Dang nhap 2");
		 * 
		 * }
		 */
		if (req.getParameter("submit") != null) {
			System.out.println("submit");
			HttpSession session = req.getSession();
			NguoiDungModel userModel = new NguoiDungModel();
			String soCMND = req.getParameter("cmndTxt");
			String matkhau = req.getParameter("matKhauTxt");
			Timestamp date = new Timestamp(System.currentTimeMillis());
			//NguoiDungBean userBean = new NguoiDungBean(soCMND, matkhau, "", "", "", "", "", "", "", -1, "", date, date);
			NguoiDungBean userBean = new NguoiDungBean();
			userBean.setSoCMND(soCMND);
			userBean.setMatkhau(matkhau);
			userBean.setThoiGianDangNhapGanNhat(date);
			if(userModel.login(userBean) != null){
				session.setAttribute("SessionUser", userBean);
				System.out.println("phan quyen: "+userBean.getPhanQuyen());
				resp.sendRedirect(req.getContextPath() + "/ClientHomePage");
			}
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("/Login.jsp");
			rd.forward(req, resp);
		}
	}
}
