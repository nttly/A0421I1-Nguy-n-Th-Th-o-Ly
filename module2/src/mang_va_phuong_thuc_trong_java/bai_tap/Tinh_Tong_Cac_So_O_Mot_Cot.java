package mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class Tinh_Tong_Cac_So_O_Mot_Cot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dong, cot;
        System.out.println("Nhập vào số dòng của mảng:");
        dong = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng:");
        cot = scanner.nextInt();
        int[][] arr = new int[dong][cot];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Nhập phần tử thứ[" + i + "," + j + "]:");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Nhập vào cột cần tính tổng:");
        int n=scanner.nextInt();
        tong(arr,n,dong,cot);
    }
    public static void tong(int[][] arr, int n, int dong, int cot){
        double s =0;
        for (int i=0;i<dong;i++){
            if (i== n){
                for (int j=0;j<cot;j++){
                    s = s+arr[i][j];
                }
            }
        }
        System.out.println("Tổng của cột "+n+" = "+s);


    }
}
