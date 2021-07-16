package mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class Xoa_Phan_Tu_Khoi_Mang {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int n= scanner.nextInt();
        int[] arr = new int[n];
        inputArray(arr,scanner);
        System.out.println("Nhập vào phần tử cần xóa:");
        int s=scanner.nextInt();

        for (int i=0;i<arr.length;i++){
            boolean isExit =false;
            if (s==arr[i]){
                arr[i]=arr[i+1];
                arr[arr.length-1]=0;
                isExit =true;
                break;
            }else if (isExit= false){
                System.out.println("Phần tử không có trong mảng!");

            }
        }
        System.out.println("Mảng sau khi xóa là:");
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
