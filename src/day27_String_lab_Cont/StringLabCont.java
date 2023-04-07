package day27_String_lab_Cont;

public class StringLabCont {

    public static void main(String[] args) {
        String  kelime="eKinlenmek";
        String kontrol="kinlenmek";
        System.out.println(ilkKelimeKontrol(kelime, kontrol));
        System.out.println(cokluYazdız("Ahmet", "Ali", 2, 5,3));
        System.out.println(karaktereTamamla("Ali", 5, '.'));
        System.out.println(ilkİkiHarf("A"));
        System.out.println(ilkİkiHarf2("Ankarank", -9));
        System.out.println(soyİsim("  isa ali pekdoğan   "));
        System.out.println(sonKelimeBul("   ali isa pekdoğan   "));
        System.out.println(yinelenHarfCıkart("Ananas"));
        System.out.println(yinelenenKelimeCıkart("araba"));
        System.out.println(sesliharfler("Ankara"));



    }
    /*
   Kullanıcıdan bir kelime alın ve kin kelimesi başından veya
   ilk karakterden sonra gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün;
   Kinlenmek true
   Kin tutmak true
   Ekin ektim true
   Keskin ilçesinden geçiyorum false
    Neden kin tutuyorsun false */
    public static boolean ilkKelimeKontrol(String  str,String target){
        if (target==null) return false;
        str=str.toLowerCase();
        target=target.toLowerCase();
        return str.startsWith(target) ||str.substring(1).startsWith(target);

    }
    public static boolean ilkKelimeKontrol2(String  str,String target){
        return str.substring(0,target.length()+1).contains(target);

    }
    //Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa, uzun
    // kelimeyi ortada 30 defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.
    //Mehmet
    //Ali AliAliMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe hmet
    // MehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe hmetMehmetMehmetMehmet
    // MehmetMehmetMehmetMehmetMehmetMehmetMe hmetMehmetMehmetMehmetMehmetMehmetMehmet
    // MehmetMehmetMehmetMe hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
    // hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetAliAli

    public static String cokluYazdız(String str1,String str2,int ilkDongu,int ortaDongu,int sonDongu){
        String result="";
        if (str1.length()<str2.length()) {
            for (int i = 0; i < ilkDongu; i++) {
                result+=str1;
            }
            for (int i = 0; i <ortaDongu ; i++) {
                result+=str2;
            }
            for (int i = 0; i < sonDongu; i++) {
                result+=str1;
            }
        }else {
            for (int i = 0; i < ilkDongu; i++) {
                result+=str2;
            }
            for (int i = 0; i <ortaDongu ; i++) {
                result+=str1;
            }
            for (int i = 0; i < sonDongu; i++) {
                result+=str2;
            }

        }
        return result;
    }
    //Kullanıcıdan bir kelime veya söz alın ve ilk 5
    // karakterini yazdırın. 5 karakterin altında bir kelime girdiği taktirde
    // 5 karaktere nokta ile tamamlayın.
    //Sabun Sabun Merhaba Merha Ali Ali..
    //Hey Hey..
    //Pi Pi...
    // Merhaba        5             .
    // 0123456 7
    public static String karaktereTamamla(String str,int number,char karakter){
        if (str.length()>=number){
            return str.substring(0,number);
        }
        //  Ali  5-3=2 Ali..
        int count=number-str.length();
        for (int i = 0; i < count; i++) {
            str+=karakter;
        }
        return str;

    }
    //Kullanıcıdan bir kelime alın ve
// bu kelimenin ilk 2 harfi sonunda
// yer alıyorsa true almıyorsa false yazdırın.

    public static boolean ilkİkiHarf(String str){
        if (str==null||str.length()<2){ return false;}
        return str.substring(0,2).equalsIgnoreCase(str.substring(str.length()-2));
    }
    public static boolean ilkİkiHarf2(String str,int karakterSayisi){
        if (str==null||str.length()<karakterSayisi||karakterSayisi<1){ return false;}
        return str.substring(0,karakterSayisi).equalsIgnoreCase(str.substring(str.length()-karakterSayisi));
    }
    //Kullanıcının  ad ve soyad bilgilerini
    //  Ekrana "Soy isminiz ..(soyad)" Yazan metodu yazınız.

    //İnput: "Harun Özsoy "
    //Output: "Soy isminiz Özsoy dır."
    //İnput:" Harun Kenan Özsoy " Output: "Soy isminiz Özsoy"
    //İnput: "Harun Kenan Can Özsoy " Output: "Soy isminiz Özsoy"
    //İnput:" Harun Kenan Can Sami Özsoy" Output: "Soy isminiz Özsoy"
    //Kullanıcı başına ve sonuna dilediği kadar boşluk girebilir lütfen
    // bu durumu dikkate alın. Output’u dikkatli inceleyin.


    public  static String soyİsim(String str){
        int end=0;
        String soyis=str.trim();
        for (int i = soyis.length()-1;i>=0; i--) {
            if (soyis.charAt(i)==' '){
                end=i;
                break;
            }
        }
        return soyis.substring(end+1);
    }
    public static String sonKelimeBul(String str){
        if (str==null){
            return null;
        }
        str=str.trim();
        return str.substring(str.lastIndexOf(" ")+1);
    }

//Kullanıcıdan bir dize sözcük alın ve yinelenen
// her karakteri kelimenizden çıkartarak sonuç
// döndüren metodu yazınız. (Büyük küçük duyarlı)

    //Merhaba Merhab Ananas Anas

    public static String yinelenHarfCıkart(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.substring(i,i+1))){
                result+=str.substring(i,i+1);
            }
        }
        return result;

    }
    public static String yinelenenKelimeCıkart(String str){
        String str1=str.replace(" ","");
        String result="";
        while (!str1.isEmpty()){
            if(str1.substring(1).contains(str1.substring(0,1))){
                result+=str1.substring(0,1);
            }
            str1=str1.replace(str1.substring(0,1),"");
        }
        return result;


    }

    public static String sesliharfler(String str){
        String result="";

        for (int i = 0; i <str.length() ; i++) {
            char c=str.charAt(i);
            if (c=='a'||c=='A'||c=='ı'||c=='i'||c=='o'||c=='ö'||c=='u'||c=='ü'){
                result+=c;
            }
        }
        return result;

    }





}

