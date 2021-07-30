package lop_va_doi_tuong_trong_java.baitap.lop_hinh_chu_nhat;
import java.util.Scanner;
public class Text_Hinh_Chu_Nhat {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập vào chiều rộng:");
        double width = scanner.nextDouble();
        System.out.println("Nhập vào chiều dài:");
        double height =scanner.nextDouble();
        Lop_hinh_Chu_Nhat hinhChuNhat = new Lop_hinh_Chu_Nhat(width,height);
        System.out.println("hình chữ nhật là: \n"+ hinhChuNhat.display());
        System.out.println("chu vi hình chữ nhật là: "+ hinhChuNhat.getPerimeter());
        System.out.println(" diện tích hình chữ nhật là: "+ hinhChuNhat.getArea());
    }
}
