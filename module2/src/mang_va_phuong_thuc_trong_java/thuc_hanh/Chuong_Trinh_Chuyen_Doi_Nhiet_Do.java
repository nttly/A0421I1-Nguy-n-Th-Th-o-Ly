package mang_va_phuong_thuc_trong_java.thuc_hanh;
import java.util.Scanner;
public class Chuong_Trinh_Chuyen_Doi_Nhiet_Do {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Fahrenheit to Celsius.");
        System.out.println("2. Celsius to Fahrenhit");
        System.out.println("0.Exit");
        System.out.println("Nhập vào lựa chọn");
        int choice =scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Nhập vào giá trị độ c cần đổi:");
                double c =scanner.nextDouble();
                fahrenheitToCelsius(c);
                break;
            case 2:
                System.out.println("Nhập vào giá trị độ f cần đổi:");
                double f =scanner.nextDouble();
                celsiusToFahrenheit(f);
            case 0:
                System.exit(0);
            default:
                System.out.println("Bạn nhập sai, yêu cầu nhập lại!");

        }
    }
    public static void celsiusToFahrenheit(double fahrenhit){
        double celsius = (5.0/9)*(fahrenhit-32);
        System.out.println(fahrenhit+" f= "+celsius+" c");
    }
    public static void fahrenheitToCelsius(double celsius){
        double fahrenhit = celsius/(5.0/9)+32;
        System.out.println(celsius+"  c= "+fahrenhit+" f");
    }
}
