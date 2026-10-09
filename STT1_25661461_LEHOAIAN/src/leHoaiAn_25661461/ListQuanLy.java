package leHoaiAn_25661461;
import java.util.*;
import java.util.stream.*;
public class ListQuanLy implements QuanLyKH<KhachHang>{
	private List<KhachHang> ds = new ArrayList<>();
	@Override
	public void them(KhachHang KH) {
		if (timKiemTheoMa(KH.getMaKH())!=null) {
			System.out.println("Ma da ton tai!");
			return;
		}
		ds.add(KH);
	}
	@Override
	public boolean xoa(String ma) {
		return ds.removeIf(KH -> KH.getMaKH().equalsIgnoreCase(ma));
	}
	@Override
	public boolean sua(String ma,KhachHang KHmoi) {
		for(int i=0;i<ds.size();i++) {
			if (ds.get(1).getMaKH().equalsIgnoreCase(ma)) {
				ds.set(1, KHmoi);
				return true;
			}
		}
		return false;
	}
	@Override
	public List<KhachHang> timKiemTheoten(String ten){
		String key = ten.toLowerCase();
		return ds.stream().filter(KH -> KH.getHoTen().toLowerCase().contains(key)).collect(Collectors.toList());
	}
	@Override
	public List<KhachHang> timKiemTheoMa(String prefix) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<KhachHang> sapXepTheoLuong() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<KhachHang> sapXepTheoTen() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Map<String, Double> thongKeTheoLoai() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Map<String, Double> groupByLoai() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Map<String, Double> groupByPhongBan() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<KhachHang> locLuongTren(double mucLuong) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<KhachHang> timTheoChucVu() {
		// TODO Auto-generated method stub
		return null;
	}
}
