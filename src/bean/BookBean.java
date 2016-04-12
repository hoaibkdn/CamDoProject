package bean;

import java.sql.Timestamp;
import net.sourceforge.jtds.jdbc.DateTime;

public class BookBean {
	private String idProduct;
	private String idClient;
	private String idCard;
	private String ideaClient;
	private String responseAdmin;
	private Timestamp bookDate;
	public String getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}
	public String getIdClient() {
		return idClient;
	}
	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getIdeaClient() {
		return ideaClient;
	}
	public void setIdeaClient(String ideaClient) {
		this.ideaClient = ideaClient;
	}
	public String getResponseAdmin() {
		return responseAdmin;
	}
	public void setResponseAdmin(String responseAdmin) {
		this.responseAdmin = responseAdmin;
	}
	public Timestamp getBookDate() {
		return bookDate;
	}
	public void setBookDate(Timestamp bookDate) {
		this.bookDate = bookDate;
	}
	public BookBean(String idProduct, String idClient, String idCard, String ideaClient, String responseAdmin,
			Timestamp bookDate) {
		super();
		this.idProduct = idProduct;
		this.idClient = idClient;
		this.idCard = idCard;
		this.ideaClient = ideaClient;
		this.responseAdmin = responseAdmin;
		this.bookDate = bookDate;
	}
	public BookBean() {
		super();
	}
	
	
	
}
