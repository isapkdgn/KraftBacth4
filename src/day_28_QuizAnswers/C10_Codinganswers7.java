package day_28_QuizAnswers;

import java.util.stream.Stream;

public class C10_Codinganswers7 {

    public static void main(String[] args) {
        System.out.println("equalsIgnorCase(\"Ahmet\",\"AHmet\") = " + equalsIgnorCase("Ahmet", "AHmet"));
    }
    public static boolean equalsIgnorCase(String str1, String str2){
     return    str1.toLowerCase().equals(str2.toLowerCase());

    }
}
