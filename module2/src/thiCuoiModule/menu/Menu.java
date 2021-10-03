package thiCuoiModule.menu;

import thiCuoiModule.dichVu.chucNang.ChucNangNhapKhau;
import thiCuoiModule.dichVu.chucNang.ChucNangXuatKhau;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        quanLySanPham();
    }

    public static void quanLySanPham() {
        ChucNangNhapKhau chucNangNhapKhau = new ChucNangNhapKhau();
        ChucNangXuatKhau chucNangXuatKhau = new ChucNangXuatKhau();
        boolean check = true;
        while (check) {
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách các sản phẩm");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    chucNangNhapKhau.themMoi();
                        break;


                }
                case 2: {
                    break;

                }
                case 3: {

                    chucNangNhapKhau.xemDanhSach();
                }
                case 4: {

                }
                case 5: {
                    System.exit(0);
                }
                default:
                    System.out.println("Bạn đã nhập sai , yêu cầu nhập lại!");

            }
        }
    }

}
