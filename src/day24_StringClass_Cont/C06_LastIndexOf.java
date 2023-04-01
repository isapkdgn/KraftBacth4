package day24_StringClass_Cont;

public class C06_LastIndexOf {
    public static void main(String[] args) {
        // indexOf() ilk bulunan indexsini getiriyor
        // lastIndexOf son bulunan indexi getirriyor

        String str="Merhaba";
        System.out.println("str.indexOf(\"a\") = " + str.indexOf("a"));
        System.out.println("str.lastIndexOf(\"a\") = " + str.lastIndexOf("a"));
        System.out.println("-------------------------------");
        int length=str.length();
        System.out.println(length);

       int lengthFinal= str.replace("a","").length();
        System.out.println("str.length() = " + str.length());
        System.out.println(str+" icerisinde a "+(length-lengthFinal)+"adet mevcuttur");


    }
}
