package mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class Tim_Phan_Tu_Lon_Nhat_Trong_Mang_2_Chieu {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int dong, cot;
        System.out.println("Nhập vào số dòng của mảng:");
        dong =scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng:");
        cot =scanner.nextInt();
        int[][] arr = new int[dong][cot];
        for (int i=0;i<dong;i++){
            for (int j=0;j<cot;j++){
                System.out.print("Nhập phần tử thứ["+i+","+j+"]:");
                arr[i][j]=scanner.nextInt();
            }
        }
        int max =arr[0][0];
        for (int i =0;i<dong;i++){
           for (int j=0;j<cot;j++){
               if (max<arr[i][j]){
                   max =arr[i][j];
               }
           }
        }
        System.out.println("Phần tử lớn nhất trong mảng là:"+max);

    }
}
