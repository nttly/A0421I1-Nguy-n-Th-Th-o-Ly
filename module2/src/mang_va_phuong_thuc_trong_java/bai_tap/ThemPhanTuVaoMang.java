package mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int n = scanner.nextInt();
        int arr[]= new int[n];
        inputArray(arr,scanner);
        System.out.println("Nhập phần tử cần them:");
        int s = scanner.nextInt();
        System.out.println("Nhập vị cần thêm:");
        int k = scanner.nextInt();
        them(arr,s,k);

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
    public static void them(int[] arr, int soCanThem, int vitri) {
        if (vitri <1 && vitri>arr.length-1){
            System.out.println("Vị trí không đúng");
            return;
        }
        else {
            int[] newArr = new int[arr.length+1];
            for (int i=0;i<newArr.length;i++){
                if (i<vitri){
                    newArr[i] = arr[i];
                } else if (i>vitri){
                    newArr[i] = arr [i -1];
                } else {
                    newArr[vitri]= vitri;
                }

            }
            System.out.println("Mảng sau khi thêm là:");
            showArray(newArr);
        }


    }
}
