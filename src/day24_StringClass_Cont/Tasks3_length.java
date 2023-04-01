package day24_StringClass_Cont;

import java.util.Scanner;

public class Tasks3_length {
    public static void main(String[] args) {
        System.out.println(checkword("isa", "ali"));

    }
    public static String checkword(String str,String str1) {

        String result = "";

        while (true) {
            if (str.length() == str1.length()) {
                System.out.println("karakter sayısı eşit");
            }
                if (str.equals(str1)) {
                    System.out.println("bu kelimeler aynı");
                    break;}

            else {
                System.out.println("kelimeler farklı");
                break;
            }
        }
        return result;
    }
}

