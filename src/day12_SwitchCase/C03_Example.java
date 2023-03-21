package day12_SwitchCase;

import java.util.Scanner;

public class C03_Example {
    public static void main(String[] args) {
        //+,-,,/
        // 4 işlem yapacak şekilde bir hesap makinesi yapın
        // kullanıcıdan 2 sayı alın
        //yapmak istediği işlemi seçsin +,-,,/
        //hatalı işlem girişlerinde kullanıcıya uyarı verin
        //ekrana sonuç döndüren programı yazınız.

        Scanner scan=new Scanner(System.in);
        /*System.out.println("num1 enter");
        int num1= scan.nextInt();
        System.out.println("num2 enter");
        int num2= scan.nextInt();
        System.out.println("islemi secin");
        System.out.println("1. toplama");
        System.out.println("2. cıkarma");
        System.out.println("3. bölme");
        System.out.println("4. carpma");
        System.out.println("secimi girin");
        int secim= scan.nextInt();
        if(secim==1){
            System.out.println("toplama sonuc : "+(num1+num2));
        } else if (secim==2) {
            System.out.println("cıkarma sonuc :"+(num1-num2));
        } else if (secim==3) {
            System.out.println("bölme sonuc :"+(double)num1/num2);
        } else if (secim==4) {
            System.out.println("carpma sonuc :"+(num1*num2));
        }else{
            System.out.println("hatalı işlem yaptınız");
        }*/
        System.out.println("sayi1: ");
        double x= scan.nextDouble();
        System.out.println("sayi2: ");
        double y= scan.nextDouble();
        System.out.println("lütfen işlem secin (+,-,*,/): ");
        String islem=scan.next();

        double sonuc=0;


         if(islem.equals("+")){
             System.out.println(x+y);
         } else if (islem.equals("-")) {
             System.out.println(x-y);
         }else if (islem.equals("*")) {
             System.out.println(x * y);
         } else if (islem.equals("/")) {
             System.out.println(x / y);
         }else{
             System.out.println("hatalı islem");
         }
    }
}
