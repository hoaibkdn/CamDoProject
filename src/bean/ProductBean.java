package bean;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ProductBean {
	private String idProduct;
	private String idProductType;
	private String nameProduct;
	private String status;
	private String price;
	private String image;
	private String description;
	public String getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}
	public String getIdProductType() {
		return idProductType;
	}
	public void setIdProductType(String idProductType) {
		this.idProductType = idProductType;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ProductBean(String idProduct, String idProductType, String nameProduct, String status, String price,
			String image, String description) {
		super();
		this.idProduct = idProduct;
		this.idProductType = idProductType;
		this.nameProduct = nameProduct;
		this.status = status;
		this.price = price;
		this.image = image;
		this.description = description;
	}
	
	public ProductBean(){}
	
	
	
}
