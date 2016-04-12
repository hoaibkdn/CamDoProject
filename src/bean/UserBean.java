package bean;

import java.sql.Timestamp;

import net.sourceforge.jtds.jdbc.DateTime;

public class UserBean {

	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String idCard;
	private String password;
	private String username;
	private String address;
	private String phoneNumber;
	private Timestamp dateOfBirth;
	private String email;
	private String profileImg;
	private String status;
	private int decentralization;
	private String gender;
	private Timestamp dateReleaseIdCard;
	private Timestamp rencentLoginDate;
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public Timestamp getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Timestamp dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProfileImg() {
		return profileImg;
	}
	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getDecentralization() {
		return decentralization;
	}
	public void setDecentralization(int decentralization) {
		this.decentralization = decentralization;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Timestamp getDateReleaseIdCard() {
		return dateReleaseIdCard;
	}
	public void setDateReleaseIdCard(Timestamp dateReleaseIdCard) {
		this.dateReleaseIdCard = dateReleaseIdCard;
	}
	public Timestamp getRencentLoginDate() {
		return rencentLoginDate;
	}
	public void setRencentLoginDate(Timestamp rencentLoginDate) {
		this.rencentLoginDate = rencentLoginDate;
	}
	public UserBean(String idCard, String password, String username, String address, String phoneNumber,
			Timestamp dateOfBirth, String email, String profileImg, String status, int decentralization, String gender,
			Timestamp dateReleaseIdCard, Timestamp rencentLoginDate) {
		super();
		this.idCard = idCard;
		this.password = password;
		this.username = username;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.profileImg = profileImg;
		this.status = status;
		this.decentralization = decentralization;
		this.gender = gender;
		this.dateReleaseIdCard = dateReleaseIdCard;
		this.rencentLoginDate = rencentLoginDate;
	}
	
	
	
}
