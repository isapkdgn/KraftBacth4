package day43_InheritanceAndKeywords;

public class Main {

    public static void main(String[] args) {
        System.out.println(Sekiller.a);

//        Parent harun = new Parent();
//        Child aslan = new Child("harun");
//        System.out.println(aslan.parentName);

        Vehicle vehicle=new Vehicle();
        Automobile automobile=new Automobile();
        Motorcycle motorcycle=new Motorcycle();
        vehicle.start();
        motorcycle.start();
        System.out.println("----------------------------");
        Daire daire=new Daire();
        System.out.println(daire.degisken);

        Sekiller sekiller=new Sekiller();
        sekiller.alanHesapla();
       // Daire daire=new Daire();
        daire.yaricap=2;
        System.out.println(daire.alanHesapla());
        Kare kare=new Kare();
        kare.kenarUzunlugu=5;
        System.out.println(kare.alanHesapla());
        Motorcycle motorcycle1=Motorcycle.motorsikletOlustur();


    }
}
