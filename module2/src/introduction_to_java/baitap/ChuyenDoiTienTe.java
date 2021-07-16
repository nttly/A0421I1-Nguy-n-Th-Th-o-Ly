package introduction_to_java.baitap;
import java.util.Scanner;
public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double usd ;
        System.out.println("Nhập vào số tiền cần đổi:");
        usd = scanner.nextDouble();
        double money = usd*23000;
        System.out.println(usd+"USD = "+money+" VND");
    }
}
