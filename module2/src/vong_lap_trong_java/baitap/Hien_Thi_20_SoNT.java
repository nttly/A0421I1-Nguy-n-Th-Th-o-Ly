package vong_lap_trong_java.baitap;
public class Hien_Thi_20_SoNT {
    public static void main(String[] args) {
        int dem = 0;
        for (int i = 2; i <= 1000; i++) {

            if (checkSNT(i)) {
                System.out.println("" + i);
                dem = dem + 1;
            }
            if (dem == 20) {
                break;
            }
        }
    }

    public static boolean checkSNT(int n) {
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
