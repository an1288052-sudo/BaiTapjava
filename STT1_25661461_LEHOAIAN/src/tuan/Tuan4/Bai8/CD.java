/**
 * 
 */
package tuan.Tuan4.Bai8;

/**
 * Bai tap tuan 3,bai8,mssv:25661461,HoTen:Le Hoai An
 */
public class CD {
/**
* Khai bao thuoc tinh cho doi tuong
*/
	private String MaCD;
	private String TuaCD;
	private String TenCS;
    private int sobaihat;
    private double giathanh;
    /**
    * dong goi va rang buoc +get,+set 
    */
	/**
	 * @return the maCD
	 */
	public String getMaCD() {
		return MaCD;
	}
	/**
	 * @param maCD the maCD to set
	 */
	public void setMaCD(String maCD) {
		MaCD = maCD;
	}
	/**
	 * @return the tuaCD
	 */
	public String getTuaCD() {
		return TuaCD;
	}
	/**
	 * @param tuaCD the tuaCD to set
	 * @throws Exception 
	 */
	public void setTuaCD(String tuaCD) throws Exception {
		if (TuaCD != null){
			this.TuaCD = tuaCD;
		}
		else {
			this.TuaCD = "chua xac dinh";
		}
	}
	/**
	 * @return the tenCS
	 */
	public String getTenCS() {
		return TenCS;
	}
	/**
	 * @param tenCS the tenCS to set
	 */
	public void setTenCS(String tenCS) {
		if (TuaCD != null){
			this.TenCS = TenCS;
		}
		else {
			this.TenCS = "chua xac dinh";
		}
	}
	/**
	 * @return the sobaihat
	 */
	public int getSobaihat() {
		return sobaihat;
	}
	/**
	 * @param sobaihat the sobaihat to set
	 * @throws Exception 
	 */
	public void setSobaihat(int sobaihat) throws Exception {
		if (sobaihat>0) {
			this.sobaihat = sobaihat;
		} else {
			throw new Exception("So bai hat lon hon 0");
		}
		
	}
	/**
	 * @return the giathanh
	 */
	public double getGiathanh() {
		return giathanh;
	}
	/**
	 * @param giathanh the giathanh to set
	 * @throws Exception 
	 */
	public void setGiathanh(double giathanh) throws Exception {
		if (giathanh>0) {
			this.giathanh = giathanh;
		} else {
			throw new Exception("So gia thanh lon hon 0");
		}
	}
	
	/**
	 * @param maCD
	 * @param tuaCD
	 * @param tenCS
	 * @param sobaihat
	 * @param giathanh
	 */
	/**
	 * Tao ham 
	 */
	public CD(String maCD, String tuaCD, String tenCS, int sobaihat, double giathanh) {
		MaCD = maCD;
		TuaCD = tuaCD;
		TenCS = tenCS;
		this.sobaihat = sobaihat;
		this.giathanh = giathanh;
	}
	public CD() {
		
	}
	/**
	 * get Thanh Tien 
	 */
	public double getThanhTien() {
		return getSobaihat()*getGiathanh();
	}
	/**
	 * Tao tieu de in
	 */
	public static void Tieude() {
		System.out.println("In danh sach CD");
		for(int i =0;i<100;i++) {
			System.out.print("_");// in khong xuong hang
		}
		System.out.println();// in co xuong hang
		String s =String.format("|%10s|%10s|%10s|%10s|%10s|%10s|",
				"ma CDRom","Tua CDRom","Ten Ca Sy","So bai hat","Don Gia","Thanh Tien");
		for(int i =0;i<100;i++) {
			System.out.print("_");// in khong xuong hang
		}
		System.out.println();// in co xuong hang
	}
	/**
	 * toString
	 */
	@Override
	public String toString() {
		String s =String.format("|%10s|%10s|%10s|%10s|%10s|%10s|",
				getMaCD(),getTuaCD(),getTenCS(),getSobaihat(),getGiathanh(),getThanhTien());
		return s;
	}
	public static 
    
}
