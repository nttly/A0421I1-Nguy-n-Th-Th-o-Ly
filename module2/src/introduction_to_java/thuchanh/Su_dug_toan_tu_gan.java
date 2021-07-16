package introduction_to_java.thuchanh;

import java.util.Scanner;

public class Su_dug_toan_tu_gan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float width, height, area;
        System.out.println("Nhập vào chiều dài hình chữ nhật:");
        height = scanner.nextFloat();
        System.out.println("Nhập vào chiều rộng hình chữ nhật:");
        width = scanner.nextFloat();
        area = width * height;
        System.out.println("Diện tích hình chữ nhật là" + area);


    }

}
