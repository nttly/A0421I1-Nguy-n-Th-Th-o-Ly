package introduction_to_java.thuchanh;
import java.util.Scanner;
public class Tinh_so_ngay_trong_thang {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int month;
        System.out.println("Nhập vào tháng cần tìm:");
        month =scanner.nextInt();
        switch (month){
            case 2:
                System.out.println("Tháng"+month+" có 28 hoặc 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng"+month+" có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng "+month+" có 30 ngày");
                break;
            default:
                System.out.println("Bạn nhập tháng không hợp lệ , yeu cầu nhập lại");
        }

    }
}
