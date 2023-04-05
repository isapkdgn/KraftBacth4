package day26_String_Lab;

public class Tasks_Day26_Odev {
    public static void main(String[] args) {

         System.out.println(soru8("ekin ", "Kin"));
        System.out.println(soru11("salsalasa"));
        // System.out.println(soru10("ali", '.'));
        System.out.println(soru9("ali", "mehmet"));
        System.out.println(soru16("merhaba"));
        System.out.println("------------------");
        System.out.println(soru17("merhaba"));


    }
     /*Soru 8
    Kullanıcıdan bir kelime alın ve kin kelimesi başından veya ilk karakterden sonra
    gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün;
    Kinlenmek true
    Kin tutmak true
    Ekin ektim true
    Keskin ilçesinden geçiyorum false
    Neden kin tutuyorsun false

     */

    public static boolean soru8(String str,String str1) {
        return str.substring(0, 4).contains(str1);
    }
    /* Soru 11
     Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2 harfi sonunda yer alıyorsa true
     almıyorsa false yazdırın.
     Ankara false
     Kafka true
     Salsa true
     Saksı false

     */
    public static boolean soru11(String str) {
        String x = str.substring(0, 2);
        String y = str.substring(str.length() - 2, str.length());

        if (x.equals(y)) {
            return true;
        } else {
            return false;
        }
    }
   /* Soru 10
    Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın. 5 karakterin
    altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.
    Sabun Sabun
    Merhaba Merha
    Ali Ali..
    Hey Hey..
    Pi Pi...

    */
   /* public static String soru10(String str,char c){
        String result="";
        String x=c+"";
        String str1=str.substring(0,5);

        for (int i = str1.length(); i <5 ; i++) {
             result+=str.concat(x);
        }
        return result;
    }
    */


    // soru 9
    //  Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa uzun kelimeyi ortada 30
    //  defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.

    public static String soru9(String str,String str1){
        String result="";
        if (str.length()>str1.length()) {
            for (int i = 0; i < 2; i++) {
                result += str1;
            }
            for (int j = 0; j < 30; j++) {
                result += str;
            }
            for (int i = 0; i < 2; i++) {
                result += str1;
            }
        } else if (str1.length()>str.length()) {
            for (int i = 0; i < 2; i++) {
                result += str;
            }
            for (int j = 0; j < 30; j++) {
                result += str1;
            }
            for (int i = 0; i < 2; i++) {
                result += str;
            }

        }
        return result;

    }
    // soru 13
    //Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden
  //  çıkartarak sonuç döndüren metodu yazınız. (Büyük küçük duyarlı)
  //   Merhaba Merhab
  //  Ananas Anas

  /* public static String sou13(String  str){
       String result="";

       for (int i = 0; i <str.length() ; i++) {
           char c=str.charAt(i);
       }
    }

   */
  /*

  Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin ilk 3
    harfini kelimeden keserek sonuna ekleyin
    Merhaba habaMer
    Ali Ali

   */

public static String soru16(String str){
   String a= str.substring(0,3);
   String b=str.substring(3,str.length());

   return b.concat(a);
}
   /* Soru 17
    Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin son 3
    harfini kelimeden keserek kelimenin başına ekleyin.
    Merhaba abaMerh

    */
public static String soru17(String str){

    String a=str.substring(str.length()-3,str.length());
    String b=str.substring(0,str.length()-3);
    return a.concat(b);
}






}