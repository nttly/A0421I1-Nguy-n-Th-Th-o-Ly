package mang_va_phuong_thuc_trong_java.thuc_hanh;
import java.util.Scanner;
public class Tim_Gia_Tri_Lon_Nhat_Trong_Mang {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập số lượng phần tử của mảng:");
        int n= scanner.nextInt();
        double[] arr= new double[n];
        inputArray(arr,scanner);
        double max = arr[0];
        for (int i=0;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Giá tri lớn nhất của mảng là:"+max);
    }
    public static void inputArray(double[] a, Scanner input) {
        System.out.println("Nhap cac phan tu vao mang: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("arr[%d]: ", i);
            a[i] = input.nextInt();
        }
    }
}
