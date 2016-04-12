package bean;

public class ClientBean {
	private String idClient;
	private String clientName;
	private String address;
	private String phoneNumber;
	private String email;
	public String getIdClient() {
		return idClient;
	}
	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ClientBean(String idClient, String clientName, String address, String phoneNumber, String email) {
		super();
		this.idClient = idClient;
		this.clientName = clientName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	
	
}
