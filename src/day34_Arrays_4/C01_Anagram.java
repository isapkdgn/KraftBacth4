package day34_Arrays_4;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Anagram {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("kelime giriniz");
        String str1= scan.nextLine();
        String str2= scan.nextLine();
       if( isAnagram(str1,str2)){
           System.out.println(str1+" ile "+str2+" anagramdır");
       }else {
           System.out.println(str1+" ile "+str2+" anagramdır değildir");
       }
    }

    // write a method that can check if str1 & str2 are build out same characters ANAGRAM
    // kil ilk adam dama
    public static boolean isAnagram(String str1,String str2){

        char[]  ch1=str1.toCharArray();
        char[]  ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

    return   Arrays.equals(ch1,ch2);





    }
}
