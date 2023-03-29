package day23_StringClass;

import java.util.Scanner;

public class Tasks1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a message");
        String message= scan.nextLine();

        System.out.println("message.length() = " + message.length());

        System.out.println("------------------------------------");

        System.out.println("Enter name and surname");
        String nameAndSurname= scan.nextLine();

        System.out.println("nameAndSurname.length() = " + nameAndSurname.length());
        System.out.println("------------------------------------");

        System.out.println("nameAndSurname.toUpperCase() = " + nameAndSurname.toUpperCase());
        System.out.println("------------------------------------");
        System.out.println("message.indexOf(\"n\") = " + message.indexOf("p"));

        System.out.println("------------------------------------");
        for (int i=0;i<message.length();i++){
            System.out.println(message.charAt(i));

        }


    }
}
