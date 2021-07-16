package mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class Dao_Nguoc_Mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử:");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        inputArray(arr,scanner);
        for (int i=0;i<arr.length/2;i++){
            int temp =arr[i];
            arr[i] =arr[n-1-i];
            arr[n-1-i]=temp;
        }
        showArray(arr);
    }
    public static void inputArray(int[] a, Scanner input) {
        System.out.println("Nhap cac phan tu vao mang: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("arr[%d]: ", i);
            a[i] = input.nextInt();
        }
    }
    public static void showArray(int[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.print( b[i]+"\t");
        }
    }

}
