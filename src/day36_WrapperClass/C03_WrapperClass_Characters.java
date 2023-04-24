package day36_WrapperClass;

public class C03_WrapperClass_Characters {
    public static void main(String[] args) {
        // Character.isLetter() harf olup olmadığını
        //Character.isDigit()  sayı/rakam  olup
        //Character.isAlphabetic() harfi olup olmadığını

       /* System.out.println(Character.isAlphabetic('Δ'));
        System.out.println(Character.isAlphabetic('Δ'));
        System.out.println(Character.isLetterOrDigit('-'));
        String str="--------j";
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))){
                result+=str.charAt(i);
            }
        }
        System.out.println(result);

        */


        String str2="|''11'*>>///M++>,,_//*e%%&/'-~~&&r//%<>/)h*>%//'9a+%^^^((b*><###a678* +%&&/))<+J>>>" +
                ">**56a##v**||;;;~~a~>>> 4500001||<<İ**##n**--//+%^^s>><<|*478a12%%n*" +
                "*-<<|||>>012345679--a**//##++34r``~~((ı[234]+||";

        String result="";

        for (int i = 0; i < str2.length(); i++) {
            if (Character.isLetter(str2.charAt(i))||str2.charAt(i)==' '){
                result+=str2.charAt(i);
            }
        }
        System.out.println(result);


        String str3="|''11'*>>///M++>,,_//*e%%&/'-~~&&r//%<>/)h*>%//'9a+%^^^((b*><###a678* +%&&/))<+J>>>" +
                ">**56a##v**||;;;~~a~>>> 4500001||<<İ**##n**--//+%^^s>><<|*478a12%%n*" +
                "*-<<|||>>012345679--a**//##++34r``~~((ı[234]+||";


        String harf="";
        String sayilar="";
        String karakter="";
        for (int i = 0; i < str3.length(); i++) {
            if (Character.isLetter(str3.charAt(i))){

                harf+=str3.charAt(i);
            } else if (Character.isDigit(str3.charAt(i))) {
                sayilar+=str3.charAt(i);
            }else {
                karakter+=str3.charAt(i);
            }
        }
        System.out.println("harf = " + harf);
        System.out.println("sayilar = " + sayilar);
        System.out.println("karakter = " + karakter);
    }



}
