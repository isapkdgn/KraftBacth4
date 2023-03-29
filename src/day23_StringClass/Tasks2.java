package day23_StringClass;

import java.util.Scanner;

public class Tasks2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter first word");
        String str1= scan.nextLine();
        System.out.println("enter second word");
        String str2= scan.nextLine();
        System.out.println("enter third word ");
        String str3= scan.nextLine();

        if (str1.length()>str2.length()&&str1.length()>str3.length()){
            if (str2.length()>str3.length()){
                System.out.println(str1.concat(str3));
            }else {
                System.out.println(str1.concat(str2));
            }
        } else if (str2.length()>str1.length()&&str2.length()>str3.length()) {
            if (str1.length()>str3.length()){
                System.out.println(str2.concat(str3));
            }else {
                System.out.println(str2.concat(str1));
            }
        }else {
            if (str1.length()>str2.length()){
                System.out.println(str3.concat(str2));
            }else {
                System.out.println(str3.concat(str1));
            }
        }
    }
}
