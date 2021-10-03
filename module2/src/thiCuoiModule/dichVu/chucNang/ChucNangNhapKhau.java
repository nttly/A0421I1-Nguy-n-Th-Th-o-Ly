package thiCuoiModule.dichVu.chucNang;

import thiCuoiModule.dichVu.ChucNang;
import thiCuoiModule.module.SanPhamNhapKhau;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ChucNangNhapKhau implements ChucNang {
    private static List<SanPhamNhapKhau> sanPhamNhapKhaus = new LinkedList<>();
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
        System.out.println("Giá nhập khẩu:");
        double giaNhapKhau = Double.parseDouble(scanner.nextLine());
        System.out.println("Tỉnh thành nhập:");
        String tinhNhap = scanner.nextLine();
        System.out.println("Thuế nhập khẩu:");
        double thueNhap = Double.parseDouble(scanner.nextLine());
        SanPhamNhapKhau sanPhamNhapKhau = new SanPhamNhapKhau(idSanPham, maSanPham, tenSanPham, gia, soLuong, nhaSanXuat, giaNhapKhau, tinhNhap, thueNhap);
        sanPhamNhapKhaus.add(sanPhamNhapKhau);

    }

    @Override
    public void xoa() {
        scanner.nextLine();
        System.out.println("Nhập id cần tìm: ");
        int idSanPham = scanner.nextInt();
        for (SanPhamNhapKhau sanPhamNhapKhau : sanPhamNhapKhaus) {
            if (sanPhamNhapKhau.getIdSanPham() == idSanPham) {


            }
        }
    }

    @Override
    public void xemDanhSach() {
        for (SanPhamNhapKhau sanPhamNhapKhau : sanPhamNhapKhaus) {
            System.out.println(sanPhamNhapKhau.toString());
        }

    }

    @Override
    public void timKiem() {
        scanner.nextLine();
        System.out.println("Nhập id cần tìm: ");
        int idSanPham = scanner.nextInt();
        for (SanPhamNhapKhau sanPhamNhapKhau : sanPhamNhapKhaus) {
            if (sanPhamNhapKhau.getIdSanPham() == idSanPham) {

            }
        }
    }
}
