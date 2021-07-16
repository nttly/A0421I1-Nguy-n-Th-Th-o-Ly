package vong_lap_trong_java.baitap;

import java.util.Scanner;

public class Hien_Thi_Cac_Loai_Hinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        while (choice != 0) {
            System.out.println("Menu:");
            System.out.println("1.Vẽ hình chữ nhật");
            System.out.println("2.Vẽ hình tam giác vuông");
            System.out.println("3.Vẽ hình tam giác vuông ngược");
            System.out.println("4.Vẽ hình tam giác cân");
            System.out.println("0.Thoát");
            System.out.println("Xin nhập lựa chọn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int dai, rong;
                    System.out.println("Nhập vào chiều dài hình chữ nhật:");
                    dai = scanner.nextInt();
                    System.out.println("Nhập vào chiều rộng hình chữ nhật:");
                    rong = scanner.nextInt();
                    System.out.println("in hình chữ nhâth");
                    for (int i = 0; i < dai; i++) {
                        for (int j = 0; j < rong; j++) {
                            System.out.print("* ");
                        }
                        System.out.println(" ");
                    }
                    break;

                case 2:
                    System.out.println("Nhập vào độ dài cạnh tam giác:");
                    int n = scanner.nextInt();
                    System.out.println("Tam giác vuông:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                System.out.println("Nhập vào độ dài cạnh");
                int c = scanner.nextInt();
                for (int i = c; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.printf("*");
                    }
                    System.out.println("");
                }
                case 4:
                System.out.println("Nhập vào độ dài cạnh :");
                int c1 = scanner.nextInt();
                System.out.println("Tam giác vuông ngược:");
                for (int i = 1; i <= c1; i++) {
                    for (int k = c1; k > i; k--) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < i * 2 - 1; j++) {
                        System.out.printf("*");
                    }
                    System.out.println(" ");
                }
                case 0:
                    System.exit(0);
                default:
                    System.out.println("lựa chọn sai, xin nhập lại");

            }

        }

    }
}
