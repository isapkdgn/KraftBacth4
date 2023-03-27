package day21_Class_And_Object;

import java.util.Scanner;

public class C02_Davatiye {
    public static void main(String[] args) {
        davetiye();

    }
    /* Düğün kartı bastıran bir program yazın. Kullanıcıdan 2 adet kelime isteyen bir metodunuz olsun. Bu metot
    kullanıcıya ileteceğiniz mesajı size belirleme opsiyonu sunsun. Eğer kullanıcı cümleleri yanlışlıkla aynı
    girerse Başka bir metot çağrılsın ve kullanıcıya kelimeler farklı olmalıydı mesajı ile tekrar ondan 2 kelime
    istesin. Kelimeler farklı gelirse bir başka metot çağrılsın ve kelimeleri
    bağlayıp( concat önünü ve arkasını yıldızlarla süsleyip versin  Method Overloading*/

    public static void davetiye(){
       // boolean flag=true;

        while(true) {
            Scanner scan=new Scanner(System.in);
            System.out.print("1,kelime :");
            String kelime1= scan.nextLine();
            System.out.print("2.kelime :");
            String kelime2= scan.nextLine();

           if( kelimeKontrol(kelime1,kelime2)){
               System.out.println("kelimeler farklı olmalı");

            }else {
               davetiyeYazdır(kelime1,kelime2);
               return;
           }

        }

    }
    private static boolean kelimeKontrol(String str,String str2){
        return str.equals(str2);
    }
    private static void davetiyeYazdır(String kelime1,String kelime2){
        System.out.println("********* "+kelime1+" **** "+kelime2+" ********* ");
    }
}
