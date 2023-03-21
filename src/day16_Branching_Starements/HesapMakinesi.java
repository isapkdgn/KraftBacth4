package day16_Branching_Starements;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        //Nested loop kullanarak kullanıcıdan hangi işlemi yapmak
// istediğini sorun. 1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış
// kullanıcının isteğine göre işlem yapın. Kullanıcının seçimine göre Girilen ekrandan
// 2 sayı alın ve işlemin sonucunu ekrana yazın çıkmak sonuç 0  devam etmek için 1 girmesini isteyin.


        // 1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış
        // çıkarma menüsüne hoş geldiniz
        // x:
        // y:
        // result;
        // menüden çıkmak için 0 işlemlere devam etmek için 1 giriniz

        Scanner scan=new Scanner(System.in);

    outerLoop:    while (true){
        System.out.println("hesap menüsüne hoş geldiniz:\n1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış");

        int tercih= scan.nextInt();

        if (tercih==1){
            while (true){
                System.out.print("1. sayı:");
                int x= scan.nextInt();
                System.out.print("2. sayı:");
                int y= scan.nextInt();
                System.out.println("işlem sonucu :"+(x+y));
                System.out.println("bir üst menü için 0 işleme devam etmek için 1 basınız ");
                int tercih2= scan.nextInt();
                if (tercih2==0){
                    break;
                } else if (tercih2==1){
                    continue;
                }else {
                    System.out.println("hatalı işlem nedeniyle cıkıs yapılıyor");
                    break outerLoop;
                }
            }

        }
        if (tercih==2){
            while (true){
                System.out.print("1. sayı:");
                int x= scan.nextInt();
                System.out.print("2. sayı:");
                int y= scan.nextInt();
                System.out.println("işlem sonucu :"+(x-y));
                System.out.println("bir üst menü için 0 işleme devam etmek için 1 basınız ");
                int tercih2= scan.nextInt();
                if (tercih2==0){
                    break;
                } else if (tercih2==1){
                    continue;
                }else {
                    System.out.println("hatalı işlem nedeniyle cıkıs yapılıyor");
                    break outerLoop;
                }
            }

        }if (tercih==3){
            while (true){
                System.out.print("1. sayı:");
                int x= scan.nextInt();
                System.out.print("2. sayı:");
                int y= scan.nextInt();
                System.out.println("işlem sonucu :"+(x*y));
                System.out.println("bir üst menü için 0 işleme devam etmek için 1 basınız ");
                int tercih2= scan.nextInt();
                if (tercih2==0){
                    break;
                } else if (tercih2==1){
                    continue;
                }else {
                    System.out.println("hatalı işlem nedeniyle cıkıs yapılıyor");
                    break outerLoop;
                }
            }

        }
        if (tercih==4){
            while (true){
                System.out.print("1. sayı:");
                int x= scan.nextInt();
                System.out.print("2. sayı:");
                int y= scan.nextInt();
                System.out.println("işlem sonucu :"+((double)x/y));
                System.out.println("bir üst menü için 0 işleme devam etmek için 1 basınız ");
                int tercih2= scan.nextInt();
                if (tercih2==0){
                    break;
                } else if (tercih2==1){
                    continue;
                }else {
                    System.out.println("hatalı işlem nedeniyle cıkıs yapılıyor");
                    break outerLoop;
                }
            }
        }
        if (tercih==5){
            break outerLoop;
        }

        }

    }
}
