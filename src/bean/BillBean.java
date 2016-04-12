package bean;

import java.sql.Timestamp;

public class BillBean {
	private String idConTract;
	private String idProduct;
	private String idCard;
	private Timestamp datePawn; // ngay cam do
	private Timestamp dateExtension; //ngay gia han cam do
	private Timestamp datePayInterestRate; //ngay tra lai
	private String interestRateStatus; //trang thai tra lai
	private float productInterestRate; //lai suat tung san pham
	public String getIdConTract() {
		return idConTract;
	}
	public void setIdConTract(String idConTract) {
		this.idConTract = idConTract;
	}
	public String getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public Timestamp getDatePawn() {
		return datePawn;
	}
	public void setDatePawn(Timestamp datePawn) {
		this.datePawn = datePawn;
	}
	public Timestamp getDateExtension() {
		return dateExtension;
	}
	public void setDateExtension(Timestamp dateExtension) {
		this.dateExtension = dateExtension;
	}
	public Timestamp getDatePayInterestRate() {
		return datePayInterestRate;
	}
	public void setDatePayInterestRate(Timestamp datePayInterestRate) {
		this.datePayInterestRate = datePayInterestRate;
	}
	public String getInterestRateStatus() {
		return interestRateStatus;
	}
	public void setInterestRateStatus(String interestRateStatus) {
		this.interestRateStatus = interestRateStatus;
	}
	public float getProductInterestRate() {
		return productInterestRate;
	}
	public void setProductInterestRate(float productInterestRate) {
		this.productInterestRate = productInterestRate;
	}
	public BillBean(String idConTract, String idProduct, String idCard, Timestamp datePawn, Timestamp dateExtension,
			Timestamp datePayInterestRate, String interestRateStatus, float productInterestRate) {
		super();
		this.idConTract = idConTract;
		this.idProduct = idProduct;
		this.idCard = idCard;
		this.datePawn = datePawn;
		this.dateExtension = dateExtension;
		this.datePayInterestRate = datePayInterestRate;
		this.interestRateStatus = interestRateStatus;
		this.productInterestRate = productInterestRate;
	}
	
	
} 
