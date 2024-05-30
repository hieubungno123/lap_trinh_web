package model;

public class Movie {
	private String maPhim;
	private String tenPhim;
	private String thoiLuong;
	private String linkPhim;
	private String moTa;
	private String nhaSanXuat;
	private String theLoai;
	
	public String getMaPhim() {
		return maPhim;
	}
	public void setMaPhim(String maPhim) {
		this.maPhim = maPhim;
	}
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	
	public String getLinkPhim() {
		return linkPhim;
	}
	public void setLinkPhim(String linkPhim) {
		this.linkPhim = linkPhim;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}
	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}
	public String getTheLoai() {
		return theLoai;
	}
	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}
	
	public String getThoiLuong() {
		return thoiLuong;
	}
	public void setThoiLuong(String thoiLuong) {
		this.thoiLuong = thoiLuong;
	}
	public Movie(String maPhim, String tenPhim, String thoiLuong, String linkPhim, String moTa, String nhaSanXuat,
			String theLoai) {
		this.maPhim = maPhim;
		this.tenPhim = tenPhim;
		this.thoiLuong = thoiLuong;
		this.linkPhim = linkPhim;
		this.moTa = moTa;
		this.nhaSanXuat = nhaSanXuat;
		this.theLoai = theLoai;
	}
	public Movie() {
	}
	
	
	
	
	

}
