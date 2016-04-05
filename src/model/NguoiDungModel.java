package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.naming.spi.DirStateFactory.Result;

import bean.NguoiDungBean;
import library.Database;

public class NguoiDungModel {
	Database db = new Database();
	
	public NguoiDungBean login(NguoiDungBean user){
		db.openConnection();
		String qr = String.format("Select soCMND, matKhau, phanQuyen from NGUOIDUNG " +
				"where soCMND = '%s' and matKhau = '%s'", user.getSoCMND(), user.getMatkhau());
		System.out.println(qr);
		ResultSet rs = null;
		
		rs = db.getResultSet(qr);
		try {
			if(rs.next()){
				user.setPhanQuyen(rs.getInt("phanQuyen"));
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
	
	private boolean updateTime(NguoiDungBean time){
		System.out.println("time login recently: "+time.getThoiGianDangNhapGanNhat());
		String sql = String.format("update NGUOIDUNG set thoiGianDangNhapGanNhat='%s'" +
				" where soCMND='%s'", time.getThoiGianDangNhapGanNhat(),time.getSoCMND());
		return db.updateData(sql);
	}
}
