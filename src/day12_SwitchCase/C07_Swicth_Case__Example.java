package day12_SwitchCase;

import java.util.Scanner;

public class C07_Swicth_Case__Example {
    public static void main(String[] args) {
        //+,-,,/
        // 4 işlem yapacak şekilde bir hesap makinesi yapın
        // kullanıcıdan 2 sayı alın
        //yapmak istediği işlemi seçsin +,-,,/
        //hatalı işlem girişlerinde kullanıcıya uyarı verin
        //ekrana sonuç döndüren programı yazınız.
       /* Scanner scan=new Scanner(System.in);
        System.out.println("num1 enter");
        double num1= scan.nextDouble();
        System.out.println("num2 enter");
        double num2= scan.nextDouble();
        System.out.println("lütfen islem secin(+,-,/,*):");
        String islem= scan.next();

        switch (islem){
            case"+":
                System.out.println(num1-num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case"/":
                System.out.println(num1/num2);
                break;
            case"*":
                System.out.println(num1*num2);
                break;
            default:
                System.out.println("islem hatalı");
        }*/

        // haftanın gününü alın ve ekrana yazdırın

        int sayi=5;

        switch (sayi){
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persenbe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("hatalı giriş 1 ile 7 arasında olmayan sayı girişi");

        }

        int beden=50;
        switch (beden){
            case 38,40,42:
                System.out.println("small");
                break;
            case 44,46,48:
                System.out.println("medium");
                break;
            case 50,52,54:
                System.out.println("large");
                break;
            default:
                System.out.println("elimizde beden kalmadı");

        }

    }
}
