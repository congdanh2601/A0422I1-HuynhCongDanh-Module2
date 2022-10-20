package final_exam.chuc_nang;

import final_exam.mau.SoDaiHan;
import final_exam.xac_minh.XacMinh;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DanhSachSoDaiHan implements ChucNangChung {
    private static List<SoDaiHan> dsSoDaiHan = new ArrayList<>();
    private static int tongSoSoDaiHan;
    static Scanner scanner = new Scanner(System.in);
    static File file = new File("longTerm.csv");

//    static {
//        dsSoDaiHan.add(new SoDaiHan(1, 1, new Date("9/1/2022"), new Date("9/2/2022"),
//                150, 12, 100, "asd"));
//        dsSoDaiHan.add(new SoDaiHan(2, 2, new Date("9/2/2022"), new Date("9/3/2022"),
//                200, 12, 100, "asd"));
//
//    }


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

        System.out.print("Nhập ưu đãi: ");
        String uuDai = scanner.nextLine();

        SoDaiHan soDaiHanMoi = new SoDaiHan(maSoSo, maKhachHang, ngayMoSo, ngayBatDau, soTienGui, laiSuat, kyHan, uuDai);
        dsSoDaiHan.add(soDaiHanMoi);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file, true))) {
            outputStream.writeObject(soDaiHanMoi);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Đã thêm sổ dài hạn mới.");
    }

    @Override
    public void xoa() {

    }

    @Override
    public void xemDanhSach() {
        System.out.println("DANH SÁCH SỔ DÀI HẠN");
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            System.out.println(objectInputStream.readObject());
        } catch (IOException|ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
