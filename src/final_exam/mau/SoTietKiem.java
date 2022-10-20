package final_exam.mau;

import java.io.Serializable;
import java.util.Date;

public abstract class SoTietKiem implements Comparable<SoTietKiem>, Serializable {
    private int maSoSo;
    private int maKhachHang;
    private Date ngayMoSo;
    private Date ngayBatDau;
    private int soTienGui;
    private int laiSuat;

    public SoTietKiem() {
    }

    public SoTietKiem(int maSoSo, int maKhachHang, Date ngayMoSo, Date ngayBatDau, int soTienGui, int laiSuat) {
        this.maSoSo = maSoSo;
        this.maKhachHang = maKhachHang;
        this.ngayMoSo = ngayMoSo;
        this.ngayBatDau = ngayBatDau;
        this.soTienGui = soTienGui;
        this.laiSuat = laiSuat;
    }

    public int getMaSoSo() {
        return maSoSo;
    }

    public void setMaSoSo(int maSoSo) {
        this.maSoSo = maSoSo;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public Date getNgayMoSo() {
        return ngayMoSo;
    }

    public void setNgayMoSo(Date ngayMoSo) {
        this.ngayMoSo = ngayMoSo;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public double getSoTienGui() {
        return soTienGui;
    }

    public void setSoTienGui(int soTienGui) {
        this.soTienGui = soTienGui;
    }

    public int getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(byte laiSuat) {
        this.laiSuat = laiSuat;
    }

    public int compareTo(SoTietKiem soTietKiem) {
        return 1;
    }

    @Override
    public String toString() {
        return "maSoSo=" + maSoSo +
                ", maKhachHang=" + maKhachHang +
                ", ngayMoSo=" + ngayMoSo +
                ", ngayBatDau=" + ngayBatDau +
                ", soTienGui=" + soTienGui +
                ", laiSuat=" + laiSuat;
    }
}
