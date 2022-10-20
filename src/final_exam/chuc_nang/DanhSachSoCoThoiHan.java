package final_exam.chuc_nang;

import final_exam.mau.SoCoThoiHan;
import final_exam.mau.SoNganHan;
import final_exam.mau.SoVoThoiHan;
import final_exam.xac_minh.XacMinh;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DanhSachSoCoThoiHan implements ChucNangChung {
    private static List<SoCoThoiHan> dsSoCoThoiHan = new ArrayList<>();
    private static int tongSoSoCoThoiHan;
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

        System.out.print("Nhập kỳ hạn: ");
        int kyHan = Integer.parseInt(scanner.nextLine());

        SoCoThoiHan soCoThoiHanMoi = new SoCoThoiHan(maSoSo, maKhachHang, ngayMoSo, ngayBatDau, soTienGui, laiSuat, kyHan);
        dsSoCoThoiHan.add(soCoThoiHanMoi);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file, true))) {
            outputStream.writeObject(soCoThoiHanMoi);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Đã thêm sổ có thời hạn mới.");
    }

    @Override
    public void xoa() {

    }

    @Override
    public void xemDanhSach() {
        System.out.println("DANH SÁCH SỔ CÓ THỜI HẠN");
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            SoNganHan soCoThoiHan;
            if ((soCoThoiHan = (SoNganHan) objectInputStream.readObject()) instanceof SoCoThoiHan) {
                System.out.println(soCoThoiHan);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
