package lop_va_doi_tuong_trong_java.baitap.quadrationEquation;
import java.util.Scanner;
public class TextQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập vào hệ số a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập vào hệ số b:");
        double b = scanner.nextDouble();
        System.out.println("Nhập vào hệ số c:");
        double c = scanner.nextDouble();
        System.out.println("Phương trình có dạng: "+a+"x^2+ "+b+"x+ "+c+" = 0");
        QuadraticEquation quadraticEquation =new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant()>0){
            System.out.println("Phương trình có hai nghiệm là: x1 = "+quadraticEquation.getRoot1()+" ; x2 = "+quadraticEquation.getRoot2());

        } else if (quadraticEquation.getDiscriminant()==0){
            System.out.println("Phương trình có một nghiệm duy nhất là x = "+quadraticEquation.getRoot());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
