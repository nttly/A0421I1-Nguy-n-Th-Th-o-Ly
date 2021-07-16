package vong_lap_trong_java.baitap;
import java.util.Scanner;
public class Hien_Thi_SNT_Nho_hon_100 {
    public static void main(String[] args) {

        for (int i = 2;i<100;i++){
            if (checkSNT(i)){
                System.out.println(" "+i);
            }
        }
    }
    public static boolean checkSNT(int n){
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
