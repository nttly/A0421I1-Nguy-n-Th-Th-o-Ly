package introduction_to_java.baitap;
import java.util.Scanner;
public class Hien_thi_loi_chao {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String name;
        System.out.println("Nhập vào tên:");
        name = scanner.nextLine();
        System.out.println("Hello:"+name);
    }
}
