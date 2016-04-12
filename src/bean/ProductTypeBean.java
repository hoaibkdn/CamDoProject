package bean;

public class ProductTypeBean {
	private String idProductType;
	private String nameProductType;
	private float interestRate; // lai suat quy dinh
	public String getIdProductType() {
		return idProductType;
	}
	public void setIdProductType(String idProductType) {
		this.idProductType = idProductType;
	}
	public String getNameProductType() {
		return nameProductType;
	}
	public void setNameProductType(String nameProductType) {
		this.nameProductType = nameProductType;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public ProductTypeBean(String idProductType, String nameProductType, float interestRate) {
		super();
		this.idProductType = idProductType;
		this.nameProductType = nameProductType;
		this.interestRate = interestRate;
	}
	
		
}
