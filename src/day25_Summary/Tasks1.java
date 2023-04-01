package day25_Summary;

import java.util.Scanner;

public class Tasks1 {
    public static void main(String[] args) {
       /* Bir
        method yazın dönüş tipi olsun kullanıcıdan 2 string istesin ve
        eğer stringlerin length i eşitse girdiğiniz kelimelerin karekter
        sayısı eşit mesajı döndürsün eğer aynı stringler gönderildiyse, bu
        kelimeler aynı mesajı döndürsün Kelimeler her anlamda farklı
        ise kullanıcıyı aynı sürece sokun ..(

        */

        Scanner scan=new Scanner(System.in);
        boolean flag=true;
        while (flag){
            System.out.println("1. kelime");
            String str5= scan.nextLine();
            System.out.println("2. kelime");
            String str6= scan.nextLine();
            flag=!soru5(str5,str6);




        }


    }
    public static boolean soru5(String a,String b){
        if (a.equalsIgnoreCase(b)){
            System.out.println( "kelimeler aynı");
            return true;
        }

      if (a.length()==b.length()) {
          System.out.println( "girdiğiniz kelimelerin karekter sayısı eşit");
          return true;
      }
        System.out.println("kelimeler aynı değil ve uzunlukları aynı değil" );
      return false;
    }




}
