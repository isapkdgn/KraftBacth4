package day24_StringClass_Cont;

public class Tasks6_isim_soyisimKısaltma {
    public static void main(String[] args) {

        System.out.println(isimSoyisimEsitleme("ali", "canlı"));
    }
    public static String  isimSoyisimEsitleme(String isim,String soyisim){
       if (isim.length()<soyisim.length()){
           String kısaltma=soyisim.substring(0,isim.length());
           String result=isim.concat(kısaltma);
          return result;
       }else {
           String kısaltma2=isim.substring(0,soyisim.length());
           String result2=soyisim.concat(kısaltma2);
           return result2;
       }

    }
}
