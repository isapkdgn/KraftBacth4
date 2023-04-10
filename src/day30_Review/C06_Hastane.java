package day30_Review;

public class C06_Hastane {

    public static void main(String[] args) {

        Doktor hekim1=new Doktor();
        System.out.println(hekim1.gender);
        System.out.println(hekim1.isim);
        System.out.println(hekim1.uzmanMi);
        System.out.println(hekim1.yas);
        System.out.println("--------------------");
        hekim1.isim="kaan";
        hekim1.yas=32;
        hekim1.uzmanMi=false;

        System.out.println(Doktor.fakulte); // static değisken class ismi ile erişeblilir
        System.out.println(hekim1.fakulte); //obje ile de static değişkenlere erişebilir
        Doktor.fakulte="hacettepe tıp Fakultesi";

        System.out.println(hekim1);          // reverans ismini yazdırır

        System.out.println("-------------------------------");
        Doktor hekim2=new Doktor();
        hekim2.isim="buket";
        System.out.println(hekim2.isim);
        System.out.println(Doktor.fakulte);
    }




}
