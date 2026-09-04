package Tuan3;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.UUID;
public class HangThucPham {
	UUID id = UUID.randomUUID();
	private String TenH;
	private double dongia;
	private LocalDate NgaySX;
	private LocalDate NgayHH;
	
	
	public String getTenH() {
		return TenH;
	}



	public void setTenH(String tenH) {
		if (TenH.isEmpty()){
			this.TenH = "Khác";
		}
		else {
			this.TenH = tenH.trim();
		}
	}



	public double getDongia() {
		return dongia;
	}



	public void setDongia(double dongia) {
		if(dongia<0) {
			this.dongia=0;
		}
		else {
			this.dongia = dongia;
		}
	}



	public LocalDate getNgaySX() {
		return NgaySX;
	}



	public void setNgaySX(LocalDate ngaySX) {
		NgaySX = ngaySX;
	}



	public LocalDate getNgayHH() {
		return NgayHH;
	}



	public void setNgayHH(LocalDate ngayHH) {
		NgayHH = ngayHH;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
