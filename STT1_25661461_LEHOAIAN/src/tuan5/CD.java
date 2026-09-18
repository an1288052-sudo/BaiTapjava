package tuan5;

public class CD {
    private int maCD;
    private String tuaCD;
    private int soBaiHat;
    private double giaThanh;

    public CD() {
    }

    public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
        setMaCD(maCD);
        setTuaCD(tuaCD);
        setSoBaiHat(soBaiHat);
        setGiaThanh(giaThanh);
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        if (maCD <= 0) {
            throw new IllegalArgumentException("Mã CD phải lớn hơn 0!");
        }
        this.maCD = maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        if (tuaCD == null || tuaCD.trim().isEmpty()) {
            throw new IllegalArgumentException("Tựa CD không được để trống!");
        }
        this.tuaCD = tuaCD;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        if (soBaiHat <= 0) {
            throw new IllegalArgumentException("Số bài hát phải lớn hơn 0!");
        }
        this.soBaiHat = soBaiHat;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        if (giaThanh <= 0) {
            throw new IllegalArgumentException("Giá thành phải lớn hơn 0!");
        }
        this.giaThanh = giaThanh;
    }

    @Override
    public String toString() {
        return String.format("| %-10d | %-25s | %-12d | %-12.2f |", maCD, tuaCD, soBaiHat, giaThanh);
    }
}

