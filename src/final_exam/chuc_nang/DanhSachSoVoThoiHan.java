package final_exam.chuc_nang;

import final_exam.mau.SoNganHan;
import final_exam.mau.SoVoThoiHan;
import final_exam.xac_minh.XacMinh;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DanhSachSoVoThoiHan implements ChucNangChung {
    private static List<SoVoThoiHan> dsSoVoThoiHan = new ArrayList<>();
    private static int tongSoSoVoThoiHan;
    static Scanner scanner = new Scanner(System.in);
    static File file = new File("shortTerm.csv");

    @Override
    public void themMoi() {
        System.out.print("Nhập mã số tiết kiệm: ");
        int maSoSo = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập mã khách hàng: ");
        int maKhachHang = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập ngày mở sổ: ");
        String ngayNhap1 = scanner.nextLine();
        Date ngayMoSo = XacMinh.xacMinhNgay(ngayNhap1);

        System.out.print("Nhập ngày bắt đầu gửi: ");
        String ngayNhap2 = scanner.nextLine();
        Date ngayBatDau = XacMinh.xacMinhNgay(ngayNhap2);

        System.out.print("Nhập số tiền gửi: ");
        int soTienGui = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập lãi suất (%): ");
        int laiSuat = Integer.parseInt(scanner.nextLine());

        SoVoThoiHan soVoThoiHanMoi = new SoVoThoiHan(maSoSo, maKhachHang, ngayMoSo, ngayBatDau, soTienGui, laiSuat);
        dsSoVoThoiHan.add(soVoThoiHanMoi);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file, true))) {
            outputStream.writeObject(soVoThoiHanMoi);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Đã thêm sổ vô thời hạn mới.");
    }

    @Override
    public void xoa() {

    }

    @Override
    public void xemDanhSach() {
        System.out.println("DANH SÁCH SỔ VÔ THỜI HẠN");
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            SoNganHan soVoThoiHan;
            if ((soVoThoiHan = (SoNganHan) objectInputStream.readObject()) instanceof SoVoThoiHan) {
                System.out.println(soVoThoiHan);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
