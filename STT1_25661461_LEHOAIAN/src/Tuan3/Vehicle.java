package Tuan3;

import java.util.Scanner;

public class Vehicle {
    private String chuXe;
    private String loaiXe;
    private double triGia;
    private int dungTich;

    // Constructor mặc định
    public Vehicle() {
    }

    // Constructor có tham số
    public Vehicle(String chuXe, String loaiXe, int dungTich, double triGia) {
        setChuXe(chuXe);
        setLoaiXe(loaiXe);
        setDungTich(dungTich);
        setTriGia(triGia);
    }

    // Getters và Setters có kiểm tra ràng buộc
    public String getChuXe() {
        return chuXe;
    }

    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        if (triGia >= 0) {
            this.triGia = triGia;
        } else {
            this.triGia = 0;
        }
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        if (dungTich >= 0) {
            this.dungTich = dungTich;
        } else {
            this.dungTich = 0;
        }
    }

    // Phương thức tính thuế trước bạ
    public double tinhTienThuoc() {
        if (dungTich < 100) {
            return triGia * 0.01;
        } else if (dungTich <= 200) {
            return triGia * 0.03;
        } else {
            return triGia * 0.05;
        }
    }

    // Phương thức xuất thông tin
    @Override
    public String toString() {
        return String.format("%-20s | %-15s | %-10d | %15.2f | %12.2f", 
                chuXe, loaiXe, dungTich ,triGia , tinhTienThuoc());
    }
}