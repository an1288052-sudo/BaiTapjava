/**
 * 
 */
package Tuan2.SinhVien;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * 
 */
public class SinhVien {
	//thuoc tinh
	private int maSV;
	private String Hoten;
	private double diemLT;
	private double diemTH;
	//Hang so gia tri mac dinh
	private static final int MA = 1;
    private static final String TEN = "Chưa có tên";
    private static final double DIEM = 0.0;
    //Constructor mac dinh
    public SinhVien() {
		this.maSV = MA;
		this.Hoten = TEN;
		this.diemLT = DIEM;
		this.diemTH = DIEM;
	}
    public SinhVien(int maSV, String Hoten, double diemLT, double diemTH) {
		setMaSV(maSV);
		setHoten(Hoten);
		setDiemLT(diemLT);
		setDiemTH(diemTH);
	}
    
	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		if (maSV>0) {
			this.maSV = maSV;
		} else {
			System.out.println("Ma Sinh Vien phai >0 .Gan gia tri mac dinh: "+MA);
			this.maSV= MA;

		}
		
	}

	public String getHoten() {
		return Hoten;
	}

	public void setHoten(String Hoten) {
		if(Hoten != null && !Hoten.trim().isEmpty()) {
			this.Hoten= Hoten.trim();
		}else {
			System.out.println("Họ tên không được rỗng. Gán giá trị mặc định: " + TEN);
            this.Hoten = TEN;
		}
		
	}

	
	public double getDiemLT() {
		return diemLT;
	}

	
	public void setDiemLT(double diemLT) {
		if (diemLT >= 0.0 && diemLT <= 10.0) {
            this.diemLT = diemLT;
        } else {
            System.out.println("Điểm LT phải trong [0.0, 10.0]. Gán giá trị mặc định: " + DIEM);
            this.diemLT = DIEM;
        }
	}


	public double getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(double diemTH) {
		if (diemTH >= 0.0 && diemTH <= 10.0) {
            this.diemTH = diemTH;
        } else {
            System.out.println("Điểm TH phải trong [0.0, 10.0]. Gán giá trị mặc định: " + DIEM);
            this.diemTH = DIEM;
        }
	}
	//Tinh diem trung binh
	public double diemTB() {
		return (diemLT+diemTH)/2;
	}
	

	//toString
	 @Override 
	    public String toString() {
	        DecimalFormat df = new DecimalFormat("0.00");
	        return String.format("%-8d | %-20s | %-8s | %-8s | %-8s",
	                maSV,
	                Hoten,
	                df.format(diemLT),
	                df.format(diemTH),
	                df.format(diemTB()));
	    }

	    public static String tieuDe() {
	        return "Mã SV   | Họ tên               | Điểm LT  | Điểm TH  | Điểm TB";
	    }

	    public static String duongKe() {
	        return "-------------------------------------------------------------------";
	    }
	    

}
