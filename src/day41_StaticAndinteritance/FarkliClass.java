package day41_StaticAndinteritance;

public class FarkliClass {
    public static void main(String[] args) {
        BankaMusteri harun=new BankaMusteri(1000);
        harun.setAdSoyad("harun tester");
      //  System.out.println(harun.getHesapNo());

        BankaMusteri mehmet=new BankaMusteri();
        mehmet.setAdSoyad("mehmet arslan");
        mehmet.getHesapNo();

        //System.out.println(harun.getBakiye());
        harun.paraEkle(500);
        harun.paraCek(800);
        harun.paraCek(200);
        harun.paraEkle(5000);
        harun.paraCek(10000);

        mehmet.paraCek(100);
        mehmet.paraEkle(500);
        mehmet.paraCek(100);

        //System.out.println("harun.getBakiye() = " + harun.getBakiye());
       // System.out.println("mehmet.getBakiye() = " + mehmet.getBakiye());
        System.out.println("mehmet.getHesapNo() = " + mehmet.getHesapNo());
        mehmet.setHesapNo(BankaMusteri.hesapNoOlustur(),"safak");
        System.out.println("mehmet.getHesapNo() = " + mehmet.getHesapNo());



    }


}
