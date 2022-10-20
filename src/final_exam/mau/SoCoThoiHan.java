package final_exam.mau;

import java.util.Date;

public class SoCoThoiHan extends SoNganHan {
    private double kyHan;

    public SoCoThoiHan() {
    }

    public SoCoThoiHan (int maSoSo, int maKhachHang, Date ngayMoSo, Date ngayBatDau, int soTienGui, int laiSuat, int kyHan) {
        super(maSoSo, maKhachHang, ngayMoSo, ngayBatDau, soTienGui, laiSuat);
        this.kyHan = kyHan;
    }

    public double getKyHan() {
        return kyHan;
    }

    public void setKyHan(double kyHan) {
        this.kyHan = kyHan;
    }

    @Override
    public String toString() {
        return "SoCoThoiHan{" + super.toString() +
                "kyHan=" + kyHan +
                '}';
    }
}
