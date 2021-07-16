package mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Arrays;
import java.util.Scanner;
public class Gop_mang {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng 1");
        int n1 =scanner.nextInt();
        int[] arr1 =new int[n1];
        inputArray(arr1,scanner);
        System.out.println("Nhập số phần tử của mảng 2");
        int n2 =scanner.nextInt();
        int[] arr2 =new int[n2];
        inputArray(arr2,scanner);
        int n3=n1+n2;
        int x =0;
        int[] arr3 = new int[n3];
        for (int i :arr1){
            arr3[x]=i;
            x++;
        }
        for (int i : arr2){
            arr3[x]=i;
            x++;
        }
        System.out.println("Mảng sau khi gộp là: "+Arrays.toString(arr3));
    }
    public static void inputArray(int[] a, Scanner input) {
        System.out.println("Nhap cac phan tu vao mang: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("arr[%d]: ", i);
            a[i] = input.nextInt();
        }
    }
}
