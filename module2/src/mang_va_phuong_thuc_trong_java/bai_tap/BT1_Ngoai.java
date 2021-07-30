package mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class BT1_Ngoai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, scanner);
        System.out.println("Nhập lựa chọn");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
            System.out.println("Tổng số phần tử lẻ");
            System.out.println(tongLe(arr));
            break;
            case 2:
            System.out.println("Nhập số cần tìm vị trí:");
            int k = scanner.nextInt();
            if (viTri(arr, k) == -1) {
                System.out.println(k + " Không tồn tại trong mảng!");
            } else {
                System.out.println(viTri(arr, k));
            }
            break;
            case 3:
            System.out.println("Mảng sau khi xếp là");
            sapXep(arr);
            xuatMang(arr);
            break;
        }
    }
    // a. Nhập một mảng a gồm n phần tử kiểu nguyên int
    public static void nhapMang(int[] a, Scanner input) {
        System.out.println("Nhap cac phan tu vao mang: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("arr[%d]: ", i);
            a[i] = input.nextInt();
        }
    }
    public static void xuatMang(int a[]){
        for (int i=0;i<a.length;i++)
            System.out.print(a[i] + " ");
        System.out.println(""); //dùng để xuống hàng
    }

    // b. Tính tổng số dương lẻ của mảng:
    public static int tongLe(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                sum += a[i];
            }
        }
        return sum;
    }

    //c . Nhập Nhập vào phần tử k, tìm xem k có xuất hiện trong mảng a không. Nếu có chỉ ra các vị trí của k trong mảng.
    public static int viTri(int[] a, int k) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                return i;
            }
        }
        return -1;
    }
    //d .Sắp xếp mảng a theo thứ tự tăng dần:
    public static void sapXep(int[] a){
        for (int i =0;i<a.length-1;i++){
            for (int j=i+1;j< a.length;j++){
                if (a[i]>a[j]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;

                }
            }
        }

}
    }

