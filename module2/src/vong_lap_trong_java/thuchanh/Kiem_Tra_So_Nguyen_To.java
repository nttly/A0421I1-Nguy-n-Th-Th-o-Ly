package vong_lap_trong_java.thuchanh;
import java.util.Scanner;
public class Kiem_Tra_So_Nguyen_To {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra: ");
        int n = scanner.nextInt();
        if (n < 2) {
            System.out.println(n + " không phải là số nguyên tố");
        } else {
            int i = 2;
            boolean check = true;
            while (i < n) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(n + " là số nguyên tố");
            } else {
                System.out.println(n + " không là số nguyên tố");
            }

        }
    }
}
