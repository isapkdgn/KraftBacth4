package day31_Arrays_1;

import java.util.Scanner;

public class C01_Question_21 {

// Soru 21
    // Kullanıcıdan 1 ila 4 harf olacak şekilde 2 kelime alın,
    // 1. veya 2. kelimeyi girdiğinde hatalı giriş yaparsa uyarı verin ve kullanıcıya düzeltme imkanı verin.
    // Her kelime için 3 kere hatalı giriş yaparsa programı sonlandırın.
    // Kullanıcı doğru giriş yaparsa 2 kelimeyi arada boşluk olacak şekilde sadece concat() metodu ile birleştirerek yazdırın.
    // Slm
    // Ali

    // Slm Ali
    public static void main(String[] args) {
        System.out.println(kelimeKontrol());
       // System.out.println(kelimeKontrol().length());

    }

public static String kelimeKontrol(){
    Scanner scan=new Scanner(System.in);
    String kelime1="";
    String kelime2="";
    System.out.println("lütfen 1 ile 4 karaterden olusan 2 kelime girin");
    int i=0;
    while (true){
        System.out.println("1.kelime :");
         kelime1= scan.nextLine();
        if (kelime1.length()>0&&kelime1.length()<5){
        break;
        }
            System.out.println("hatalı giriş lütfen tekrar deneyin");
            i++;
            if (i==3) return null;

    }
     i=0;
    while (true){
        System.out.println("2.kelime :");
         kelime2= scan.nextLine();
        if (kelime2.length()>0&&kelime2.length()<5){
            break;
        }
        System.out.println("hatalı giriş lütfen tekrar deneyin");
        i++;
        if (i==3) return null;

    }

return kelime1.concat(" ").concat(kelime2);

}


}
