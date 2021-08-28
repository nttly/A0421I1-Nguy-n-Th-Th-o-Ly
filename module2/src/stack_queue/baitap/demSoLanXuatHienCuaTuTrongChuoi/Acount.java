package stack_queue.baitap.demSoLanXuatHienCuaTuTrongChuoi;

import java.util.*;

public class Acount{
    public static void main(String[] args) {
        String str = "hello";
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        char[] arr = str.toCharArray();

        for (char value: arr) {

            if (Character.isAlphabetic(value)) {
                if (charMap.containsKey(value)) {
                    charMap.put(value, charMap.get(value) + 1);

                } else {
                    charMap.put(value, 1);
                }
            }
        }

        System.out.println(charMap);
    }
}