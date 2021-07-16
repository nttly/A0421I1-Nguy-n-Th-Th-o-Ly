package vong_lap_trong_java.thuchanh;
import java.util.Scanner;
public class Ung_dung_tinh_tien_lai_cho_vay {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double tien =1.0;
        int thang=1;
        double lai = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi:");
        tien=input.nextDouble();
        System.out.println("Nhập số tháng gửi:");
        thang=input.nextInt();
        System.out.println("Nhập lãi suất:");
        lai=input.nextDouble();
        double tienlai=0;
        for (int i=0;i<thang;i++){
            tienlai += tien*(lai/100)/12*thang;
        }
        System.out.println("Tiền lãi nhận lại được là :"+tienlai);

    }
}
