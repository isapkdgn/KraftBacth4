package day27_String_Example;

public class day26_27_PdfSoruları {
    public static void main(String[] args) {
        System.out.print(tekrarEdenHarfler("aabcccseeeeefff"));
        System.out.println();
        System.out.println(kelimeninTersdenOkunusu("kabak"));
        System.out.println(tekrarEdenKelime("Sevmek veya sevmemek", "sev"));
        System.out.println(kelimeSayısıAynıMı("Ankara ile Bursa arası ve Bursa bir baska", "Ankara", "Bursa"));
        System.out.println(kelimeSayısıAynıMı("Ankara ile Bursa arası ", "ankara", "bursa"));
        System.out.println(soru16("merhaba"));
        System.out.println("------------------");
        System.out.println(soru17("merhaba"));
        System.out.println("----------------------");
        System.out.println(ilkBenzerSizHarfiBul("Merhaba"));
        System.out.println(ilkBenzerSizHarfiBul("Araba"));
        System.out.println(ilkBenzerSizHarfiBul("Karkas rotasi"));
        System.out.println("---------------------------");
        System.out.println(harfSayilariniBaslarinaYaz("Merhaba"));
        System.out.println(harfSayilariniBaslarinaYaz("Seni seviyorum"));
        System.out.println("--------------------------------");
        System.out.println(enCokOlanHarfiDondur("Merhaba"));
        System.out.println(enCokOlanHarfiDondur("aaaaaaabbccc"));
        System.out.println(enCokOlanHarfiDondur("eeemmmsssssssssshhhhhhhhhsss"));
    }



    public static String tekrarEdenHarfler(String str) {

        String result = "";
        while (str.length()>1){

            if (str.substring(0,1).equals(str.substring(1,2))){
                result+=str.substring(0,1);
            }
            str=str.replace(str.substring(0,1),"");

        }
        return result;
    }
    public static boolean kelimeninTersdenOkunusu(String str){
        String  reverse="";
        boolean bl=false;
        for (int i = str.length()-1; 0<=i ; i--) {
            reverse=reverse+str.charAt(i);

        }
        if (str.equals(reverse)){
            bl=true;
        }
        return bl;
    }


    public static int tekrarEdenKelime(String  str, String kelime) {
        str = str.toLowerCase();
        kelime = kelime.toLowerCase();
        int num = 0;
        while (str.contains(kelime)) {

            str = str.replaceFirst(kelime, "");
            num++;
        }

        return num;
    }

    public static boolean kelimeSayısıAynıMı(String cümle,String str1,String str2) {
        cümle = cümle.toLowerCase();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        int num = 0;
        int num1 = 0;
        boolean bl = false;
        while (cümle.contains(str1)) {
            cümle = cümle.replaceFirst(str1, "");
            num++;
            while (cümle.contains(str2)) {
                cümle = cümle.replaceFirst(str2, "");
                num1++;
            }
            if (num == num1 && num != 0) {
                bl = true;
            }
        }

        return bl;

    }

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
    public static String ilkBenzerSizHarfiBul(String str){
        str=str.toLowerCase().trim().replace(" ","");
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            if (str.indexOf(str.substring(i,i+1))==str.lastIndexOf(str.substring(i,i+1))){
                result=str.substring(i,i+1);
                break;
            }
        }return result;
    }

    public static String harfSayilariniBaslarinaYaz(String str) {
        str=str.toLowerCase().replace(" ","");
        String result = "";
        int count;
        for (int i = 0; i < str.length(); i++) {
            String harf = str.substring(i, i + 1);
            count = str.length() - (str.replace(harf, "").length());
            if (!result.contains(harf)) {
                result += count + harf;
            }

        }
        return result;
    }
    public static String enCokOlanHarfiDondur(String str) {
        str=str.toLowerCase().replace(" ","");
        String result = "";
        int count;
        int sayi=0;
        for (int i = 0; i < str.length(); i++) {
            String harf = str.substring(i, i + 1);
            count = str.length() - (str.replace(harf, "").length());

            if (count>sayi  && !result.contains(harf)){
                result= harf;
                sayi=count;
            }

        }
        return result;
    }

}