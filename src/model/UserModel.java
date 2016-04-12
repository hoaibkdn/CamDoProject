package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.naming.spi.DirStateFactory.Result;

import bean.UserBean;
import library.Database;

public class UserModel {
	Database db = new Database();
	
	public UserBean login(UserBean user){
		db.openConnection();
		String qr = String.format("Select * from NGUOIDUNG " +
				"where soCMND = '%s' and matKhau = '%s'", user.getIdCard(), user.getPassword());
		System.out.println(qr);
		ResultSet rs = null;
		
		rs = db.getResultSet(qr);
		try {
			if(rs.next()){
				user.setDecentralization(rs.getInt("phanQuyen"));
				//System.out.println("ten nguoi dung"+rs.g);
				user.setUsername(rs.getString("tenNguoiDung"));
				updateTime(user);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally{
			db.closeConnection();
		}
		return user;
	}
	
	private boolean updateTime(UserBean time){
		System.out.println("time login recently: "+time.getRencentLoginDate());
		String sql = String.format("update NGUOIDUNG set thoiGianDangNhapGanNhat='%s'" +
				" where soCMND='%s'", time.getRencentLoginDate(),time.getIdCard());
		return db.updateData(sql);
	}
	
}
