package day09_OperatorsCont;

import java.util.Scanner;

public class C01_BoyKilo {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("boyunuzu giriniz (ornek 1.78):");
        double boy= scan.nextDouble();

        System.out.println("kilonuzu giriniz (ornek 80.5) :");
        double kilo= scan.nextDouble();


        scan.nextLine();
        System.out.println("lutfen isminizi giriniz :");
        String isim= scan.next();

        System.out.println("soyisminizi girin :");
        String soyisim=scan.nextLine();



        System.out.println(isim+" "+soyisim+" boyunuz :"+boy+"m kilonuz :"+kilo+" kg");

        // Scanner.next() ilk boşluğa olan değerleri alır
        // Scanner.nextLine() ilk entere kadar olan degerleri alır

    }
}
