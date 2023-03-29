package day21_Class_And_Object;

public class Main {

    public static void main(String[] args) {

        Daire daire1=new Daire();
        daire1.r=5;
        Daire daire2=new Daire();
        daire2.r=20;
        Daire daire3=new Daire();
        daire3.r=15;

        daire1.alanHesapla();
        daire2.alanHesapla();
        daire3.alanHesapla();
        daire1.cevreHesapla();

        Person cemile=new Person();
        cemile.yas=35;
        cemile.isim="cemile";
        cemile.cinsiyet="bayan";
        cemile.tcNO="123456789";
        cemile.yiksonuortalaması=45;




        Person cavit=new Person();
        cavit.yas=40;
        cavit.isim="cavit";
        cavit.cinsiyet="bay";
        cavit.tcNO="321456789";
        cavit.yiksonuortalaması=80;

        System.out.println(cemile.isim);
        cemile.uyu();
        cavit.uyu();

        cemile.tumBilgileriGetir();
        cavit.tumBilgileriGetir();
        System.out.println(Person.ortalama(cavit.yiksonuortalaması));
        System.out.println(Person.ortalama(cemile.yiksonuortalaması));


        System.out.println(cavit.a);


    }
}
