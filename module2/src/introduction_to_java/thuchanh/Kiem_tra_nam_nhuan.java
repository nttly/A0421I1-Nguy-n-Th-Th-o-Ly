package introduction_to_java.thuchanh;
import java.util.Scanner;
public class Kiem_tra_nam_nhuan {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập vào năm cần kiểm tra : ");
        double year = scanner.nextDouble();
        if (year %4 == 0){
            if (year %100 ==0){
                if (year %400 ==0){
                    System.out.println(year+" là năm nhuận");
                } else {
                    System.out.println(year +" không là năm nhuận");

                }
            }else {
                System.out.println(year + " là năm nhuận");
            }
        }else {
            System.out.println(year +" không là năm nhuận");
        }
    }
}
