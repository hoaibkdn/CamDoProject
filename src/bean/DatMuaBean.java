package bean;

import net.sourceforge.jtds.jdbc.DateTime;

public class DatMuaBean {
	private String maSP;
	private String maKH;
	private String soCMND;
	private String yKienKH;
	private String phanHoiTuAdmnin;
	private DateTime ngayDatMua;
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getSoCMND() {
		return soCMND;
	}
	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}
	public String getyKienKH() {
		return yKienKH;
	}
	public void setyKienKH(String yKienKH) {
		this.yKienKH = yKienKH;
	}
	public String getPhanHoiTuAdmnin() {
		return phanHoiTuAdmnin;
	}
	public void setPhanHoiTuAdmnin(String phanHoiTuAdmnin) {
		this.phanHoiTuAdmnin = phanHoiTuAdmnin;
	}
	public DateTime getNgayDatMua() {
		return ngayDatMua;
	}
	public void setNgayDatMua(DateTime ngayDatMua) {
		this.ngayDatMua = ngayDatMua;
	}
	
}
