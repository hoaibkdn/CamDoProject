package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import bean.ProductBean;
import library.Database;

public class ProductModel {
	
	Database db = new Database();
	
	public ArrayList<ProductBean> productNew(){
		ArrayList<ProductBean> productLst = new ArrayList<ProductBean>();
		db.openConnection();
		ProductBean product = null;
		String qr = "Select top 2 sp.tenSP, bl.ngayBatDauGiaHan"
						+" From SANPHAM sp inner join BIENLAICAMDO bl"
							+" on sp.maSP = bl.maSP"
								+" where sp.trangThai = 'rao ban'"
									+" order by  bl.ngayBatDauGiaHan desc";
		
		System.out.println(qr);
		ResultSet rs = db.getResultSet(qr);
		try {
			while(rs.next()){
				product = new ProductBean("","",rs.getString("tenSP"),"","","","");
				productLst.add(product);
				System.out.println("sp 1 "+ product.getNameProduct());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			db.closeConnection();
		}
		return productLst;
	}
	
	//timKiemSanPham(String x): ArrayList<SANPHAM>
	public ArrayList<ProductBean> searchProducts(String productName){
		db.openConnection();
		ProductBean products = null;
		ArrayList<ProductBean> productLst = new ArrayList<>();
		String qr = "select tenSP" 
				+" from SANPHAM "
				+" where tenSP like N'%"+productName+"%'";
		System.out.println(qr);
		ResultSet rs = db.getResultSet(qr);
		try {
			while(rs.next()){
				products = new ProductBean();
				products.setNameProduct(rs.getString("tenSP"));
				productLst.add(products);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			db.closeConnection();
		}
		return productLst;
	}
	
	//get Product from product choosed
	public ArrayList<ProductBean> getProductFollowType(String productType){
		ArrayList<ProductBean> productFollowTypeLst = new ArrayList<>();
		ProductBean productBean = null;
		db.openConnection();
		String qr = String.format("Select * from SANPHAM where maLoaiSP = '%s'", productType);
		System.out.println(qr);
		ResultSet rs = db.getResultSet(qr);
		try {
			while(rs.next()){
				productBean = new ProductBean(rs.getString("maSP"), rs.getString("maLoaiSP"), 
						rs.getString("tenSP"), rs.getString("trangThai"), rs.getString("gia"), 
						rs.getString("hinhAnh"), rs.getString("moTa"));
				productFollowTypeLst.add(productBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			db.closeConnection();
		}
		return productFollowTypeLst;
	}
	
	//get product from id
	public ProductBean productById(String idProduct) {
		db.openConnection();
		ProductBean product = null;
		String qr=String.format("Select * from SANPHAM where maSP = '%s'", idProduct);
		ResultSet rs = db.getResultSet(qr);
		try {
			if(rs.next()){
				product= new ProductBean(rs.getString(1), rs.getString(2), rs.getString(3), 
						rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return product;
		
	}
	
}
