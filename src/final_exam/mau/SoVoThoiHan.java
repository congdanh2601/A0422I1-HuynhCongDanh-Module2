package final_exam.mau;

import java.util.Date;

public class SoVoThoiHan extends SoNganHan {
    public SoVoThoiHan() {
    }

    public SoVoThoiHan(int maSoSo, int maKhachHang, Date ngayMoSo, Date ngayBatDau, int soTienGui, int laiSuat) {
        super(maSoSo, maKhachHang, ngayMoSo, ngayBatDau, soTienGui, laiSuat);
    }

    @Override
    public String toString() {
        return "SoVoKyHan{" + super.toString() + "}";
    }
}
