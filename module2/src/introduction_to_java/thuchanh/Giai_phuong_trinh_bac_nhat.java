package introduction_to_java.thuchanh;

import java.util.Scanner;

public class Giai_phuong_trinh_bac_nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b, c, x;
        System.out.println("Nhập vào hệ số a:");
        a = scanner.nextFloat();
        System.out.println("Nhập vào hệ số b");
        b = scanner.nextFloat();
        System.out.println("Nhập vào hệ số c");
        c = scanner.nextFloat();
        System.out.println("Phương trình sẽ có dạng: " + a + "x+ " + b + " = " + c);
        if (a != 0) {
            x = (c - b) / a;
            System.out.println("Vậy nghiệm của phương trình là: x = " + x);

        } else {
            if (b == c) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }


    }
}
