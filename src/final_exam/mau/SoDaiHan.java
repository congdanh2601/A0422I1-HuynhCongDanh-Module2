package final_exam.mau;

import java.util.Date;

public class SoDaiHan extends SoTietKiem  {
    private double kyHan;
    private String uuDai;

    public SoDaiHan() {
    }

    public SoDaiHan (int maSoSo, int maKhachHang, Date ngayMoSo, Date ngayBatDau, int soTienGui, int laiSuat, int kyHan, String uuDai) {
        super(maSoSo, maKhachHang, ngayMoSo, ngayBatDau, soTienGui, laiSuat);
        this.kyHan = kyHan;
        this.uuDai = uuDai;
    }

    public double getKyHan() {
        return kyHan;
    }

    public void setKyHan(double kyHan) {
        this.kyHan = kyHan;
    }

    public String getUuDai() {
        return uuDai;
    }

    public void setUuDai(String uuDai) {
        this.uuDai = uuDai;
    }

    @Override
    public String toString() {
        return "SoDaiHan{" + super.toString() +
                "kyHan=" + kyHan +
                ", uuDai='" + uuDai + '\'' +
                '}';
    }
}
