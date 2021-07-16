package introduction_to_java.thuchanh;

import java.util.Scanner;

public class Tinh_chi_so_can_nang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Nhập vào chiều cao:");
        height = scanner.nextDouble();
        System.out.println("Nhập vào cân nặng :");
        weight = scanner.nextDouble();
        bmi =  weight /Math.pow(height, 2);
        if (bmi < 18.5) {
            System.out.println("underweight");
        } else if (bmi < 25.0) {
            System.out.println("nomal");
        } else if (bmi < 30.0) {
            System.out.println("overweight");
        } else
            System.out.println("obese");
    }

}

