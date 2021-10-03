package thiCuoiModule.dichVu.chucNang;

import thiCuoiModule.dichVu.ChucNang;
import thiCuoiModule.module.SanPhamXuatKhau;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ChucNangXuatKhau implements ChucNang {
    private static List<SanPhamXuatKhau> sanPhamXuatKhaus = new LinkedList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void themMoi() {

        System.out.println("Nhập id sản phẩm:");
        int idSanPham = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mã sản phẩm:");
        String maSanPham = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm:");
        String tenSanPham = scanner.nextLine();
        System.out.println("Nhập giá bán:");
        double gia = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng:");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập nhà sản xuất:");
        String nhaSanXuat = scanner.nextLine();
        System.out.println("Giá xuat khẩu:");
        double giaXuatKhau = Double.parseDouble(scanner.nextLine());
        System.out.println("Quốc gia nhập khẩu:");
        String quocGiaNhapSanPham = scanner.nextLine();
        SanPhamXuatKhau sanPhamXuatKhau = new SanPhamXuatKhau(idSanPham, maSanPham, tenSanPham, gia, soLuong, nhaSanXuat, giaXuatKhau, quocGiaNhapSanPham);
        sanPhamXuatKhaus.add(sanPhamXuatKhau);

    }

    @Override
    public void xoa() {

    }

    @Override
    public void xemDanhSach() {
        for (SanPhamXuatKhau sanPhamXuatKhau : sanPhamXuatKhaus) {
            System.out.println(sanPhamXuatKhau.toString());
        }

    }

    @Override
    public void timKiem() {

    }
}
