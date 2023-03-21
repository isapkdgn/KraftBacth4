package day07_Aritmetic_Opereators;

public class Aritmetic_Operators_3 {
    public static void main(String[] args) {

        //4500 dk kac saatir

       /* int dk=4500;
        int saat=4500/60;
        System.out.println("saat = " + saat);
        //4321 dk saat dk saniye cevrildikten sonra saniyeyi ekrana yazınız

        System.out.println(4321%60);

        //31502 saniye kaç saat kaç dakika kaç saniyedir? (1 saat 60 dakika 1 dakika 60 sn)

        double saniye=31502;
        double dk=31502/60;
        double saat=dk/60;

        System.out.println("dk = " + dk);
        System.out.println("saat = " + saat);

        */
        int toplamsaniye=31502;
        //60*60sn=1 saat

        int saat=toplamsaniye/3600;
        System.out.println("saat = " + saat);

       // int dakika=(toplamsaniye-saat*3600)/60;
        //System.out.println("dakika = " + dakika);

        int dakika=toplamsaniye%3600/60;
        System.out.println("dakika = " + dakika);
        int saniye=toplamsaniye%60;

        System.out.println(saat+"saat "+dakika+"dakika "+saniye+"saniye");


    }
}
