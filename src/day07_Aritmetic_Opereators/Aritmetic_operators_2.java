package day07_Aritmetic_Opereators;

import javax.lang.model.SourceVersion;

public class Aritmetic_operators_2 {
    public static void main(String[] args){

       /* int x=4;
        int y=10;
        double z=(double) x/y;
        System.out.println(z);

        int dogumYil=1990;
        int yas=2023-dogumYil;
        System.out.println("ahmet yas "+(yas-5));

        //System.out.println(Math.sqrt(49));
        double PI=3.14;
        double r=4;
        double alan=PI*r*r;
        double alan2=Math.PI*Math.pow(r,2);
        System.out.println("alan: "+alan);
        System.out.println("alan: "+alan2);

        double cevre=2*PI*r;
        System.out.println("cevre: "+cevre);



        double f=300;
        double celsius=(f-32)/1.8;
        System.out.println(f+"fahrenheit: "+"celsius:"+celsius);


        double c=32;
        double f=(c*1.8)+32;
        System.out.println(f);


        //Ali fizik dersinden 92,
         // kimya dersinden 55,
         // matematik dersinden 89 almıştır.
        //1.Ali’nin not ortalaması kaçtır?

        double f=92;
        double k=55;
        double m=89;
        double ort=(f+k+m)/3;
        System.out.println(ort);
        boolean isPas=ort>=80;
        System.out.println("ali sınıfı gecti mi: "+isPas);



        Örnek: Toplantı salonunda 15 adet sıra ve her sırada 12 adet koltuk vardır. Toplantıya 113 katılmıştır.
        1.Toplantı salonun toplam kapasitesi nedir? 2.Kaç adet boş koltuk vardır ?
                3.Kaç adet sırada oturulmaktadır ?
        4. Kaç sıra tamamen boş kalmıştır.
        5.Oturulan sıralarda kaç adet boş koltuk vardır?
        */

        int sira=15;
        int koltukSayisi=12;
        int katilanKisi=113;
        //1.Toplantı salonun toplam kapasitesi nedir?
        int kapasite=sira*koltukSayisi;
        System.out.println("kapasite = " + kapasite);
        //2.Kaç adet boş koltuk vardır
        int boskoltuksayısı=kapasite-katilanKisi;
        System.out.println("boskoltuksayısı = " + boskoltuksayısı);
        //3.Kaç adet sırada oturulmaktadır
        int oturulansiraAdeti=113/12+1;
        System.out.println("oturulansiraAdeti = " + oturulansiraAdeti);
        //4. Kaç sıra tamamen boş kalmıştır
        int bossiraAdeti=sira-oturulansiraAdeti;
        System.out.println("bossiraAdeti = " + bossiraAdeti);
        //5.Oturulan sıralarda kaç adet boş koltuk vardır?

        int oturusiraadeti=koltukSayisi-(katilanKisi%12);
        System.out.println("oturusiraBoskoltukadeti = " + oturusiraadeti);


    }
}
