package mang_va_phuong_thuc_trong_java.thuc_hanh;
import java.util.Scanner;
public class UD_Dem_So_Luong_Sinh_Vien_Thi_Do {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = 0;
        System.out.println("Nhập số lượng sinh viên:");
        do {

            n = scanner.nextInt();
            if (n > 30) {
                System.out.println("Số lượng sinh viên không được vượt quá 30 ");
            }
        }while (n>30);
        double[] arr = new double[n];
        inputArray(arr,scanner);
        demSoLuong(arr);
    }
    public static void inputArray(double[] a, Scanner input) {
        System.out.println("Nhap cac phan tu vao mang: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("sinh viên[%d]: ", i);
            a[i] = input.nextDouble();
        }
    }
    public static void demSoLuong(double[] arr){
        int dem =0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>=5 && arr[i]<=10){
                dem=dem+1;
            }
        }
        System.out.println("Lớp học đó có :"+dem+" sinh viên thi đỗ");
    }
}
