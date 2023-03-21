package day08_ScannerAndOperators;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("km deger girin");
        int km= scan.nextInt();
        double mil=km*0.625;
        System.out.println(km+" km "+mil+" mil yapar ");


    }
}
