package mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class Mang2Chieu_TinhTongCacSoOCADuongCheoChinhCuaMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Nhập vào size của ma trận vuông:");
        size = scanner.nextInt();

        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhập phần tử thứ[" + i + "," + j + "]:");
                arr[i][j] = scanner.nextInt();
            }
        }
        int s = tongDuongCheochinh(arr, size) + tongDuongCheoPhu(arr, size);
        System.out.println("Tổng hai đường chéo chính cua ma trận là:" + s);
    }

    public static int tongDuongCheochinh(int[][] arr, int size) {
        int s1 = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    s1 += arr[i][j];
                }

            }
        }
        return s1;
    }

    public static int tongDuongCheoPhu(int[][] arr, int size) {
        int s2 = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            s2 += arr[i][arr.length - 1 - i];
        }
        return s2;
    }
}
