package lop_va_doi_tuong_trong_java.baitap.stopWatch;
import java.util.Scanner;
import java.util.Arrays;
public class TextStopWatch {
    public static void main(String[] args) {
        int[] numbers = new int[100000];
        for (int i =0;i<numbers.length;i++){
            numbers[i]=(int)(Math.random()*100000);
        }
        StopWatch stopWatch =new StopWatch();
        Arrays.sort(numbers);
        stopWatch.getStop();
        System.out.println("milisecond :"+stopWatch.getElapsedTime());
        stopWatch.getStart();
        System.out.println("1");
        stopWatch.getStop();
        System.out.println("milisecond: "+stopWatch.getElapsedTime());
    }
}
