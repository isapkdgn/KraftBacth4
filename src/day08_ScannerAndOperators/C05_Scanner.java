package day08_ScannerAndOperators;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");

        String name=scan.nextLine();
        System.out.println("Girilen isim :"+name);

        scan.close();


    }
}
