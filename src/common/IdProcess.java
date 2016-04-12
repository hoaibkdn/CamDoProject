package common;

import java.sql.ResultSet;
import java.sql.SQLException;

import library.Database;

public class IdProcess{

	Database db = new Database();
	
	//xu ly cat 3 so cuoi cua ID o vi tri cuoi cung trong Bang
	public int getID(String id, String tenBang){
		int idInt = 0;
		db.openConnection();
		//cat so tu id
		String qr = "SELECT MAX(cast(SUBSTRING("+id+",3,3)as int)) as iD "
				+ "FROM  "+tenBang+" ";
		
		ResultSet rs = db.getResultSet(qr);
		try {
			if(rs.next()){
				idInt = rs.getInt("iD");
				System.out.println("cat chuoi: "+idInt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			db.openConnection();
		}
		return idInt+1;
	}
}
