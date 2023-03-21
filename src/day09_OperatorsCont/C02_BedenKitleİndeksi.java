package day09_OperatorsCont;

import java.util.Scanner;

public class C02_BedenKitleİndeksi {
    public static void main(String[] args) {

        /*
        Kullanıcıdan aldığınız boy ve kilo değerlerine göre kullanıcının beden kitle indeksini bulun.
        Beden Kitle İndeksi : Kilo / (Boy(m) * Boy(m))
        */

        Scanner scan=new Scanner(System.in);
        System.out.print("Kilonuzu giriniz : ");
        int kilo= scan.nextInt();

        System.out.print("boyunuzu giriniz (or :1,80) : ");
        double boy= scan.nextDouble();

        double bki=kilo/(boy*boy);


        System.out.println("kilonuz :"+kilo);
        System.out.println("Boyunuz :"+boy);
        System.out.println(" Beden Kitle Indeksiniz :"+bki);

    }
}
