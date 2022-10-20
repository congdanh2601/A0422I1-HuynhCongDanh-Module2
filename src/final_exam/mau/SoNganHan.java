package final_exam.mau;

import java.util.Date;

public abstract class SoNganHan extends SoTietKiem {
    public SoNganHan() {
    }

    public SoNganHan(int maSoSo, int maKhachHang, Date ngayMoSo, Date ngayBatDau, int soTienGui, int laiSuat) {
        super(maSoSo, maKhachHang, ngayMoSo, ngayBatDau, soTienGui, laiSuat);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
