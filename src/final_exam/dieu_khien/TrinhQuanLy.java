package final_exam.dieu_khien;

import final_exam.chuc_nang.DanhSachSoCoThoiHan;
import final_exam.chuc_nang.DanhSachSoDaiHan;
import final_exam.chuc_nang.DanhSachSoVoThoiHan;
import final_exam.xac_minh.XacMinh;

import java.util.Scanner;

public class TrinhQuanLy {
    static Scanner scanner = new Scanner(System.in);
    static DanhSachSoVoThoiHan danhSachSoVoThoiHan = new DanhSachSoVoThoiHan();
    static DanhSachSoDaiHan danhSachSoDaiHan = new DanhSachSoDaiHan();
    static DanhSachSoCoThoiHan danhSachSoCoThoiHan = new DanhSachSoCoThoiHan();

    public static void main(String[] args) {
        chuongTrinhQuanLy();
    }

    public static void chuongTrinhQuanLy() {
        while (true) {
            System.out.println("--- *** CHƯƠNG TRÌNH QUẢN LÝ SỔ TIẾT KIỆM *** ---");
            System.out.println("Chọn chức năng theo số (để tiếp tục): ");
            System.out.println("1. Thêm mới sổ tiết kiệm");
            System.out.println("2. Xóa sổ tiết kiệm");
            System.out.println("3. Xem danh sách sổ tiết kiệm");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            byte luaChon = XacMinh.xacMinhLuaChon();
            switch (luaChon) {
                case 1:
                    themMoiSoTietKiem();
                    break;
                case 2:

                    break;
                case 3:
                    danhSachSoCoThoiHan.xemDanhSach();
                    danhSachSoDaiHan.xemDanhSach();
                    danhSachSoVoThoiHan.xemDanhSach();
                    break;
            }
            if (luaChon == 4) System.exit(0);
        }
    }

    public static void themMoiSoTietKiem() {
        while (true) {
            System.out.println("Chọn chức năng tiếp theo: ");
            System.out.println("1. Số tiết kiệm dài hạn");
            System.out.println("2. Số tiết kiệm ngắn hạn");
            System.out.println("3. Quay lại");
            System.out.print("Chọn chức năng: ");
            byte luaChon = XacMinh.xacMinhLuaChon();
            switch (luaChon) {
                case 1:
                    danhSachSoDaiHan.themMoi();
                    break;
                case 2:
                    themSoNganHan();
                    break;
            }
            if (luaChon == 3) break;
        }
    }

    public static void themSoNganHan() {
        while (true) {
            System.out.println("Chọn chức năng tiếp theo: ");
            System.out.println("1. Số tiết kiệm vô thời hạn");
            System.out.println("2. Số tiết kiệm có thời hạn");
            System.out.println("3. Quay lại");
            System.out.print("Chọn chức năng: ");
            byte luaChon = XacMinh.xacMinhLuaChon();
            switch (luaChon) {
                case 1:
                    danhSachSoVoThoiHan.themMoi();
                    break;
                case 2:
                    danhSachSoCoThoiHan.themMoi();
                    break;
            }
            if (luaChon == 3) break;
        }
    }




}
