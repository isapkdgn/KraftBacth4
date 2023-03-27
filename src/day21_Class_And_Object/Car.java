package day21_Class_And_Object;

public class Car {

    String marka;
    int modelYil;
    int beygir;
    String saseNo;
    boolean isSuv;
    boolean isManuel;

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
