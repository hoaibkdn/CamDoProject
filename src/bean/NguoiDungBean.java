package bean;

import java.sql.Timestamp;

import net.sourceforge.jtds.jdbc.DateTime;

public class NguoiDungBean {

	public NguoiDungBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String soCMND;
	private String matkhau;
	private String tenNguoiDung;
	private String diaChi;
	private String soDienThoai;
	private String ngaySinh;
	private String email;
	private String anhDaiDien;
	private String trangThai;
	private int phanQuyen;
	private String gioiTinh;
	private Timestamp ngayCap;
	private Timestamp thoiGianDangNhapGanNhat;
	
	public String getSoCMND() {
		return soCMND;
	}
	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public String getTenNguoiDung() {
		return tenNguoiDung;
	}
	public void setTenNguoiDung(String tenNguoiDung) {
		this.tenNguoiDung = tenNguoiDung;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAnhDaiDien() {
		return anhDaiDien;
	}
	public void setAnhDaiDien(String anhDaiDien) {
		this.anhDaiDien = anhDaiDien;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public int getPhanQuyen() {
		return phanQuyen;
	}
	public void setPhanQuyen(int phanQuyen) {
		this.phanQuyen = phanQuyen;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public NguoiDungBean(String soCMND, String matkhau, String tenNguoiDung, String diaChi, String soDienThoai,
			String ngaySinh, String email, String anhDaiDien, String trangThai, int phanQuyen, String gioiTinh,
			Timestamp ngayCap, Timestamp thoiGianDangNhapGanNhat) {
		super();
		this.soCMND = soCMND;
		this.matkhau = matkhau;
		this.tenNguoiDung = tenNguoiDung;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.ngaySinh = ngaySinh;
		this.email = email;
		this.anhDaiDien = anhDaiDien;
		this.trangThai = trangThai;
		this.phanQuyen = phanQuyen;
		this.gioiTinh = gioiTinh;
		this.ngayCap = ngayCap;
		this.thoiGianDangNhapGanNhat = thoiGianDangNhapGanNhat;
	}
	public Timestamp getNgayCap() {
		return ngayCap;
	}
	public void setNgayCap(Timestamp ngayCap) {
		this.ngayCap = ngayCap;
	}
	public Timestamp getThoiGianDangNhapGanNhat() {
		return thoiGianDangNhapGanNhat;
	}
	public void setThoiGianDangNhapGanNhat(Timestamp thoiGianDangNhapGanNhat) {
		this.thoiGianDangNhapGanNhat = thoiGianDangNhapGanNhat;
	}

	
}
