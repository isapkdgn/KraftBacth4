package day08_ScannerAndOperators;

import java.util.Scanner;

public class C07_ScannerTask2 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim=scan.nextLine();

        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim=scan.nextLine();

        System.out.println("Lütfen yasinizi giriniz");
        int yas=scan.nextInt();
        scan.nextLine();    // ilkel data tipinde veri alıp String bir veri gireceğimiz zaman o nextline veri girişi
                            // konsala gelmez bunun için*** scan.nextLine(); ilkel data girişinden sonra yazmamız lazım



        System.out.println("Dogum yerinizi giriniz");
        String dogumYeri=scan.nextLine();


        System.out.println("Isminiz :"+isim);
        System.out.println("Soyisim :"+soyisim);
        System.out.println("Yasınız :"+yas);
        System.out.println("Dogum yerinizi :"+dogumYeri);
        System.out.println("Kaydınız basarıyla tamamlanmıstır");


        //kullanıcını istediğimiz veri türünde deger girişi yapmazsa
        //kodumuzda hata olur execution durur
        //hatalı inputlara karşı nasıl tedbirler alacağımızı görececeğiz

        System.out.println("Isminiz :"+isim+
                          "\nSoyisim :"+soyisim+
                          "\nYasınız :"+yas+
                          "\nDogum yerinizi :"+dogumYeri+
                          "\nKaydınız basarıyla tamamlanmıstır"
        );



    }
}
