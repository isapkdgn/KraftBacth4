package day25_Summary;

public class String_Example {

    //length()
    // girilen String bir ifadenin uzunlugunu methodu yazınız

    public static void main(String[] args) {
        String cumle = "  Merhaba  ";
        String cumle1="Dünya";
        String cumle2="r";
        System.out.println(uzunluk(cumle));
        System.out.println("-------------------");
        System.out.println(harflerikucult(cumle));
        System.out.println("-------------------");
        System.out.println(harfleribuyut(cumle));
        System.out.println("-------------------");
        System.out.println(karakterGetir(cumle, 4));
        System.out.println("-------------------");
        System.out.println(birlestir(cumle, cumle1));
        System.out.println("-------------------");
        System.out.println(birlestir2(cumle, cumle1));
        System.out.println("-------------------");
        System.out.println(iceriyormu(cumle, cumle2));
        System.out.println("-------------------");
        System.out.println(bosluklarisil(cumle));
        System.out.println("-------------------");
        System.out.println(kelimeDegistir(cumle1, "Dün", "har"));

        String Str5="Merhaba";
        System.out.println(ilkindexNogetir(Str5, 'a'));

        String str5="Merhaba";
        String str6="ErMan";
      if  (ikinciKelimedevarmi(str5,str6)>=0){
          System.out.println("icinde var ve 2.kelimenin "+ikinciKelimedevarmi(str5,str6)+"indesinde yer alıyor");
      }else{
          System.out.println("2. kelimenin icinde yer almıyor");
      }

        System.out.println(sonindexNogetir(str5, "a"));
        System.out.println(esitmi(str5, str6));
        System.out.println("-------------------");
        String str7=" ";
        System.out.println(bosMU(str7));
        System.out.println("-------------------");
        String str8="Merhaba";
        String str9="Merhaba";
        System.out.println(baslıyormu(str8, "Mer"));
        System.out.println("-------------------");
        System.out.println(ındekstenitibarenYaz(str8, 3));
        System.out.println(ındekstenitibarenYaz(str8, 3, 6));


    }

    public static int uzunluk(String str) {
        return str.length();
    }

    //toLowerCase
    public static String harflerikucult(String str) {
        return str.toLowerCase();
    }
   // toUpperCase
    public static String harfleribuyut(String str) {
        return str.toUpperCase();

    }
    //charAt()
    public static char karakterGetir(String str, int index){

        return str.charAt(index);
    }
    // concat()
    public static String birlestir(String a,String b){
        return a.concat(b);
    }
    public static String birlestir2(String a,String b){
        return a+b;
    }
    //contains()
    public static boolean iceriyormu(String str,String control){
        return str.contains(control);
    }
    public static boolean iceriyormu2(String str,String control){
        if (str.indexOf(control)<0){
            return false;
        }
        return true;
    }

    //trim()
    public static String bosluklarisil(String str){
        return str.trim();
    }
    //replace() benim verdiğim deger ile değistir

    public static String kelimeDegistir(String str,String eskikelime,String yenikelime){
        return str.replace(eskikelime,yenikelime);
    }
    public static int ilkindexNogetir(String str,char kelime){
        return str.indexOf(kelime);
    }
    public static int ilkindexNogetir(String str,String kelime){
        return str.indexOf(kelime);
    }
    public static int ikinciKelimedevarmi(String str1,String str2){
     return str2.indexOf( str1.trim().charAt(5));

    }
    //lastindexof()
    public static int sonindexNogetir(String str,String kelime){
        return str.lastIndexOf(kelime);
    }

    public static boolean esitmi(String a,String b){
        return a.equals(b);
    }
    //isEmpty
    public static boolean bosMU(String str){
        return str.isEmpty();
    }

    //starsWith()
    public static boolean baslıyormu(String kelime,String kontrolEdilecekkelime){
        return kelime.startsWith(kontrolEdilecekkelime);

    }
    //subsring
    public static String ındekstenitibarenYaz(String str,int index){
        return str.substring(index);
    }
    public static String ındekstenitibarenYaz(String str,int starindex,int lastindex) {
        return str.substring(starindex,lastindex);
    }




}