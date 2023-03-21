package day08_ScannerAndOperators;

import java.util.Scanner;

public class C06_ScannerTask1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayı girin");

        int girilenSayi= scan.nextInt();
        System.out.println("Girilen sayi ="+girilenSayi) ;
        System.out.println("Girilen sayi karesi ="+girilenSayi*girilenSayi) ;

        scan.close();


    }
}
