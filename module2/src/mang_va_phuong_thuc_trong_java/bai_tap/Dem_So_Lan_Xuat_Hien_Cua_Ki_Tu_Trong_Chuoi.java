package mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class Dem_So_Lan_Xuat_Hien_Cua_Ki_Tu_Trong_Chuoi {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập chuổi :");
        String str = scanner.nextLine();
        System.out.println("Nhập kí tự cần đếm:");
        char k = scanner.next().charAt(0);
        System.out.println("số kí tự "+k+" trong chuổi = "+dem(str,k));
    }
    public static int dem( String str, char k){
        int s=0;
        for (int i=0;i<str.length();i++){
            if (k==str.charAt(i)){
                s = s+1;
            }
        }
        return s;
    }
}
