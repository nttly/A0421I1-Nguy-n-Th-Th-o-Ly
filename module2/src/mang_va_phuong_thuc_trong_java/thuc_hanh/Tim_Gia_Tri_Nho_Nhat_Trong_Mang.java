package mang_va_phuong_thuc_trong_java.thuc_hanh;
import java.util.Scanner;
public class Tim_Gia_Tri_Nho_Nhat_Trong_Mang {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng:");
        int n =scanner.nextInt();
        int[] arr = new int[n];
        inputArray(arr,scanner);
        minValue(arr);

    }
    public static void inputArray(int[] a, Scanner input) {
        System.out.println("Nhap cac phan tu vao mang: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("arr[%d]: ", i);
            a[i] = input.nextInt();
        }
    }
    public static void minValue(int[] arr){
        int min = arr[0];
        for (int i =0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất của mảng là:"+min);

    }

}
