package day41_StaticAndinteritance;

import java.util.Scanner;

public class Car {
    String marka;
    int modelYil;
  private   int beygir;
 private    String saseNo;
    boolean isSuv;
    boolean isManuel;
    private final String sifre="harun";

    public static int  tekerlekSayisi=4;

    public String getSaseNo(){
        return saseNo;
    }
    public int getBeygir(){
        return this.beygir;
    }

    public void setBeygir(int beygir) {
        if (beygir<100&&isSuv==true){
            return;
        }

        this.beygir = beygir;
    }

    public void setSaseNo(String yeniSaseNo) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sifre:");
        String sifre= scan.nextLine();

        if (sifre.equals(this.sifre)) {
            saseNo = yeniSaseNo;
            System.out.println("işlem başarılı");
            return;
        }
        System.out.println("hatalı sifre nedeniyle şifre değiştirelemedi");
    }

    public Car(){
       System.out.println("mehaba objenız basarılı");
   }
   public Car(String marka){
       this();
      this.marka=marka;
   }
   public Car(String marka,int modelYil){
       this(marka);
       this.modelYil=modelYil;
   }
    public Car(String marka,int modelYil,int beygir){
        this.marka=marka;
        this.modelYil=modelYil;
        this.beygir=beygir;
    }
   public Car(String marka,int modelYil,int beygir,String saseNo){}
   public Car(String marka,int modelYil,int beygir,String saseNo,boolean isSuv){}
   public Car(String marka,int modelYil,int beygir,String saseNo,boolean isSuv,boolean isManuel){
       this.marka=marka;
       this.modelYil=modelYil;
       this.beygir=beygir;
       this.saseNo=saseNo;
       this.isSuv=isSuv;
       this.isManuel=isManuel;
   }
   public int getTekerlekSayisi(){
        return tekerlekSayisi;
   }


    public void hizlan(){
        System.out.println("Arac hizlaniyor");
    }
    public String beygirKarsilastir(){
        if (beygir>100){
            return "Güclü arac";
        }
        return "Zayıf arac";
    }

}
