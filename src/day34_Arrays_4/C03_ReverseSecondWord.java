package day34_Arrays_4;

import day24_StringClass_Cont.C07_ReverseString;

import java.util.Arrays;

public class C03_ReverseSecondWord {
    public static void main(String[] args) {
        System.out.println(reverseSecondWord("I Love Java"));

        String str="merhaba java insanları bugün nasılsınız";

        System.out.println(reverseArray(str));
    }

    /*
    Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";
            output:
                I evoL Java
 */

    public static String reverseSecondWord(String str){
        String result="";
        String[] words = str.split(" ");
        //words[1].
        String reversed="";
        for (int i = words[1].length()-1;0<=i; i--) {
            reversed+=words[1].charAt(i);
        }
        words[1]=reversed;

        for (String word : words) {
            result+=word+" ";
        }



        return result;
    }

    //merhaba java insanları bugün nasılsınız» gibi bir cümlenin ikinci kelimesinin
   // harflerinden bir döndüren method yazın.

    public static String reverseArray(String str){
        String result="";
        String reverse="";

        String[] words = str.split(" ");

        for (int i = 0; i < words[1].length(); i++) {
            reverse+=words[1].charAt(i);
        }
        words[1]=reverse;

        result= Arrays.toString(words[1].toCharArray());

        return result;
    }

}
