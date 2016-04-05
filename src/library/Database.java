package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * DataBase.java
 * 
 * Version 1.0
 * 
 * Date: August 13, 2015
 * 
 * Copyright
 * 
 * Modification Logs: DATE AUTHOR DESCRIPTION
 * -----------------------------------------------------------------------
 *November 7, 2015 Nhom2SVTT Create
 */

public class Database {

//	/*
//	 * databaseName : ten database
//	 */
	String databaseName = "CamDoIT";
	String UserName = "sa";
	String PassWord = "12345678";
	Connection con;
	Statement stm;
	ResultSet rs;

	/*
	 * ket noi toi database
	 */
	public void openConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(
					"jdbc:sqlserver://localhost:1433;databaseName=CamDoIT",
					"sa", "12345678");
			System.out.println("Ket Noi Thanh Cong Toi CSDL");
		} catch (ClassNotFoundException e) {
			System.out.println("ket noi loi");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("loi ket noi SQL");
		}
		try {
			stm = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * dong ket noi toi database
	 */
	public void closeConnection() {
		try {
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	/*
	 * thuc hien cau lenh select 
	 * du lieu tra ve kieu ResultSet neu that bai tra
	 * ve null
	 */
	public ResultSet getResultSet(String sql) {
		try {
			return stm.executeQuery(sql);
		} catch (SQLException e) {
			System.out.println("Loi truy van");
			return null;
		}
	}

	/*
	 * thuc hien cau lenh insert,update,delete 
	 * neu thanh cong ket qua tra ve la true 
	 * neu that bai ket qua tra ve la false
	 */
	public boolean updateData(String sql) {
		openConnection();
		Boolean temp = true;
		try {
			stm.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			temp = false;
		} finally {
			closeConnection();
		}
		return temp;
	}
}
