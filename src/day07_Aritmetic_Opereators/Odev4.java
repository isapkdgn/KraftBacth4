package day07_Aritmetic_Opereators;

import java.util.Scanner;

public class Odev4 {

    public static void main(String[] args) {






        Scanner scan=new Scanner(System.in);
        // 1 saat 60 dk 1 dk 60 saniye
        System.out.print("girilenSaniyeDeger: ");
        int girilenSaniyeDeger=scan.nextInt();
        int saat=girilenSaniyeDeger/3600;
        int dakika=girilenSaniyeDeger%3600/60;
        int saniye=girilenSaniyeDeger%60;
        System.out.print(+saat+" saat "+dakika+" dakika "+saniye+" saniye ");
    }
}