package Tuan2.SinhVien;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== NHẬP THÔNG TIN SINH VIÊN =====");
        System.out.println("\n--- Nhập thông tin sv1 (chính bạn) ---");
        System.out.print("Mã SV: ");
        int ma1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Họ tên: ");
        String ten1 = scanner.nextLine();
        System.out.print("Điểm LT: ");
        double lt1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Điểm TH: ");
        double th1 = Double.parseDouble(scanner.nextLine());

        SinhVien sv1 = new SinhVien(ma1, ten1, lt1, th1);
        System.out.println("\n--- Nhập thông tin sv2 (bạn thân nhất) ---");
        System.out.print("Mã SV: ");
        int ma2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Họ tên: ");
        String ten2 = scanner.nextLine();
        System.out.print("Điểm LT: ");
        double lt2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Điểm TH: ");
        double th2 = Double.parseDouble(scanner.nextLine());

        SinhVien sv2 = new SinhVien(ma2, ten2, lt2, th2);
        System.out.println("\n--- Nhập thông tin sv3 (tạo bằng constructor mặc định + setter) ---");
        SinhVien sv3 = new SinhVien();

        System.out.print("Mã SV: ");
        int ma3 = Integer.parseInt(scanner.nextLine());
        sv3.setMaSV(ma3);

        System.out.print("Họ tên: ");
        String ten3 = scanner.nextLine();
        sv3.setHoten(ten3);

        System.out.print("Điểm LT: ");
        double lt3 = Double.parseDouble(scanner.nextLine());
        sv3.setDiemLT(lt3);

        System.out.print("Điểm TH: ");
        double th3 = Double.parseDouble(scanner.nextLine());
        sv3.setDiemTH(th3);

        
        System.out.println("\n--- THAY ĐỔI CÁCH GÁN DỮ LIỆU CHO SV3: DÙNG CONSTRUCTOR ĐỦ THAM SỐ ---");
        
        sv3 = new SinhVien(ma3, ten3, lt3, th3);
        System.out.println("Đã tạo lại sv3 bằng constructor đủ tham số!");

        
        System.out.println("\n\n===== DANH SÁCH SINH VIÊN =====");
        System.out.println(SinhVien.tieuDe());
        System.out.println(SinhVien.duongKe());
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
        System.out.println(SinhVien.duongKe());

        
        System.out.println("\n===== KIỂM TRA RÀNG BUỘC DỮ LIỆU =====");
        System.out.println("Nhập dữ liệu không hợp lệ để kiểm tra setter:");

        SinhVien svTest = new SinhVien();
        System.out.print("Nhập mã SV = -5: ");
        svTest.setMaSV(-5); 

        System.out.print("Nhập họ tên rỗng: ");
        svTest.setHoten("   "); 

        System.out.print("Nhập điểm LT = 15.5: ");
        svTest.setDiemLT(15.5); 

        System.out.print("Nhập điểm TH = -3.0: ");
        svTest.setDiemTH(-3.0); 

        System.out.println("\nThông tin sinh viên sau khi nhập không hợp lệ:");
        System.out.println(SinhVien.tieuDe());
        System.out.println(SinhVien.duongKe());
        System.out.println(svTest);
        System.out.println(SinhVien.duongKe());

        scanner.close();
    }

}
