package day17_Methods;

import java.util.Random;
import java.util.Scanner;

public class C02_Tahmin_Oyunu {
    public static void main(String[] args) {


        // bilgisayarın tuttuğu 0 dahil-50 arası
        //sayısıyı 5 hamlede bulma
        //tuttuğu sayı düsük ise bir tahmin yaparsak yukarı
        // tuttuğu sayı yüksek ise bir tahmin yaparsak aşaği


        Random random=new Random();

        int sayi= random.nextInt(50);


        Scanner scan=new Scanner(System.in);
        int i=1;
        while (i<=5){
            System.out.println(i+".Tahmin: ");
            int tahmin= scan.nextInt();
            if (tahmin>sayi&& i!=5){
                System.out.println("Aşağı");
            } else if (tahmin<sayi&&i!=5) {
                System.out.println("Yukarı");
            }else if(tahmin==sayi){
                System.out.println("Tebrikler");
                break;
            }
            i++;
            if (i == 6) {
                System.out.println("malasef iemedin tutuğum sayı:"+sayi);
            }

            }








        }



    }

