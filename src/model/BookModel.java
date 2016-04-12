package model;

import bean.BookBean;
import bean.ClientBean;
import common.IdProcess;
import library.Database;

public class BookModel {

	Database db = new Database();
	IdProcess id = new IdProcess();
	
	public boolean insertBook(BookBean book, ClientBean client, String idProduct){
		db.openConnection();
		
		int idClientNumber = id.getID("maKH", "KHACHHANG");
		String idClient = "KH".concat(String.valueOf(idClientNumber));
		String qr = String.format("EXEC dbo.KHDatMua "
					+"@idClient = '%s',"
					+"@name = '%s',"
					+"@address = '%s',"
					+"@phoneNumber = '%s',"
					+"@email = '%s',"
					+"@idProduct = '%s',"
					+"@idea = '%s',"
					+"@bookdate = '%s';",idClient, client.getClientName(), client.getAddress(), 
					client.getPhoneNumber(), client.getEmail(), book.getIdProduct(), book.getIdeaClient(), book.getBookDate());
		System.out.println(qr);
		db.updateData(qr);
		return true;
	}
}
