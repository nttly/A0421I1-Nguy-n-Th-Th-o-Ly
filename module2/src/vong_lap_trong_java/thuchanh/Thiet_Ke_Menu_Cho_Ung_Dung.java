package vong_lap_trong_java.thuchanh;

import java.util.Scanner;

public class Thiet_Ke_Menu_Cho_Ung_Dung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice=1;
        while (choice != 0){
        System.out.println("Menu:");
        System.out.println("1.Vẽ hình tam giác");
        System.out.println("2.Vẽ hình vuông");
        System.out.println("3.Vẽ hình chữ nhật");
        System.out.println("0.Thoát");
        System.out.println("Xin nhập lựa chọn");
        choice =scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Vẽ hình tam giác");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Vẽ hình vuông");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 3:
                System.out.println("Vẽ hình chữ nhật");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("lựa chọn sai");
        }

    }
    }
}
