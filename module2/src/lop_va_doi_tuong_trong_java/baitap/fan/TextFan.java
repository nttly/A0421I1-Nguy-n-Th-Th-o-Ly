package lop_va_doi_tuong_trong_java.baitap.fan;
import java.util.Scanner;
public class TextFan {
    public static void main(String[] args) {
        Fan fan = new Fan(Fan.FAST, true, 10, "yellow");
        Fan fan1 = new Fan(Fan.MEDIUM, false, 5, "blue");
        System.out.println(fan.getToString());
        System.out.println(fan1.getToString());
    }
}
