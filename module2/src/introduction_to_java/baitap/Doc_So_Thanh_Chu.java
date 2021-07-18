package introduction_to_java.baitap;
import java.util.Scanner;
public class Doc_So_Thanh_Chu {
    final static String[] ones = {" ","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    final static String[] tens = { " "," ","twenty","thirty","forty","fifty","sixty","seven","eighty","ninety"};
    public static void numberToWord(int num,String value){
        System.out.print(num>19? tens[num/10]+" "+ones[num%10]:ones[num]);
        System.out.print(num>0?value:"");
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("please input number:");
        int number = scanner.nextInt();
        numberToWord(number/100,"hundred");
        numberToWord(number%100,"");

    }
}
