package day06_Type_Casting;

public class Example {
    public static void main(String[] args) {

       /* double toplamSoruAdedi=60;
        double oran=10;
        int yanlisAdet=20;

        //  60-20 +20/4 doğrularım gitti

        double net=toplamSoruAdedi-yanlisAdet-yanlisAdet/oran;
        System.out.println(net);
        //Ali sınıfta 7-7 halı saha maçı planlamak ve
        // oynanan maçta hakem olmak istiyor,
        // sınıfta 18 kişi var ise kaç kişi oyun dışı kalacaktır.



        int sinifmevcudu = 19;
        int hakem=1;
        int oyuncuSayisi=16;
        int kalan=sinifmevcudu-oyuncuSayisi-hakem;
        System.out.println(kalan);

        //Ali oynanan maçta 1 hakem olacak şekilde
        // okulda  7-7 halı saha maçıları planlamak istiyor
        // okul mevcudu 189 ise kaç kişi dışarıda kalır.

        int okulMevcudu = 188;
        int hakem =1;
        int oyuncuSayisi =7;
        int kalan = okulMevcudu % (oyuncuSayisi * 2+ hakem);

        System.out.println(kalan);*/

        //Bir musluğu A musluğu tek başına 12 saatte, B musluğu 30 saatte dolduruyor,
        // c musluğu ise dolu havuzu 9 saatte boşaltıyor.
        //Buna göre bu 3 musluk birlikte açıldığında boş havuz kaç saatte dolar.

        double saat=1.0;
        double a=saat/12.0;
        double b=saat/30.0;
        double c=saat/9.0;
        double t=saat/(a+b-c);
        System.out.println(t);








    }
}
