package day21_Class_And_Object;

public class Person {
  // isim cinsiyet yas fields
  //  uyu() oyunOyna()

    String isim;
    String cinsiyet;
    int yas;
    String tcNO;
    double yiksonuortalaması;
    char a;

    public void uyu(){
        System.out.println(isim+"uyuyor");
    }

    public void oyunOyna(){
        System.out.println(isim+"oyun oynuyor");
    }
    public void tumBilgileriGetir(){
        System.out.println("isim:"+isim);
        System.out.println("yas:"+yas);
        System.out.println("cinsiyet:"+cinsiyet);
        System.out.println("kimlik numarası:"+tcNO);
    }

    public static String ortalama(double x){

        if (x<50){
            return "C";
        } else if (x<75) {
            return "B";
        }else {
            return "A";
        }


    }








}
