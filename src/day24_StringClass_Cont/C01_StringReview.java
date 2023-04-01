package day24_StringClass_Cont;

import java.util.Scanner;

public class C01_StringReview {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim= scan.nextLine();
        //0123456789101112
        // yavuz selim
        // ismin son harfini al
        //length(), charA()
        int uzunluk=isim.length();
        char sonHarf=isim.charAt(uzunluk-1);
        System.out.println(sonHarf);

        //equals()
        System.out.println(isim ==" yavuz selim ");
        System.out.println(isim.equals(" yavuz selim "));
        System.out.println(isim.equalsIgnoreCase(" Yavuz SELİM "));
        // toUpperCase toLowerCase

        System.out.println(isim.toUpperCase());
        System.out.println(isim.toLowerCase());
        System.out.println(isim);

        //trim()

        System.out.println(isim.trim());
        System.out.println(isim);

        // indexOf

        System.out.println(isim.indexOf("s"));
        System.out.println(isim.indexOf("selim"));
        System.out.println(isim.indexOf(" "));
        System.out.println(isim.lastIndexOf(" "));

        int ilkIndeks=isim.indexOf(" ");
        int lastIndeks=isim.lastIndexOf(" ");
        if (ilkIndeks==lastIndeks){
            System.out.println("y harfi stringde uniqetir");
        }else{
            System.out.println(" unique degildir");

        }


        //replace()

        System.out.println(isim.replace(" ", ""));
        System.out.println(isim.replace("vuz", "giz"));

        String message="Merhaba";
        String message1="Merhaba";
        String message2= new String("Merhaba");
        System.out.println(message==message1);
        System.out.println(message==message2);
        System.out.println(message);
        System.out.println(message.replace("a", "e"));
        System.out.println(message.replaceFirst("a", "e"));


    }
}
