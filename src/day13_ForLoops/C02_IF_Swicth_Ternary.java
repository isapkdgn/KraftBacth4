package day13_ForLoops;

import java.util.Scanner;

public class C02_IF_Swicth_Ternary {
    public static void main(String[] args) {
        /* Kullanicidan bir harf isteyin
         o harfle baslayan gun ismi varsa yazdirin
         yoksa "gecersiz harf" yazdirin*/

       // String name="isa";
        // System.out.println(name);
        //System.out.println(name.charAt(0));

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char harf=scan.next().charAt(0); // scanner sınıfı ile harf alamıyoruz scan.next() string aldık
                                        // charAt(0) yazarak aldığımız kelimenin ilk harfini almiş olduk
        if (harf=='p'||harf=='P'){
            System.out.println("Pazar,Pazartesi,Perşembe");
        } else if (harf=='s'||harf=='S') {
            System.out.println("Salı");

        } else if (harf=='c'||harf=='C') {
            System.out.println("Carsamba, Cuma, Cumartesi");

        }else{
            System.out.println("gecersiz harf");
        }
        System.out.println("---------------------------------");

        switch (harf){
            case'p','P':
                System.out.println("Pazar,Pazartesi,Perşembe");
                break;
            case 's','S':
                System.out.println("Salı");
                break;
            case 'c':
            case 'C':
                System.out.println("Carsamba, Cuma, Cumartesi");
                break;

            default:
                System.out.println("gecersiz harf");


        }
        System.out.println("---------------------------------");
        String result=(harf=='p'||harf=='P')?  "Pazar,Pazartesi,Perşembe" : (harf=='c'||harf=='C')? "Carsamba, Cuma, Cumartesi" :
                (harf=='c'||harf=='C')?("Carsamba, Cuma, Cumartesi"):"gecersiz harf";

        System.out.println("result = " + result);
    }
}
