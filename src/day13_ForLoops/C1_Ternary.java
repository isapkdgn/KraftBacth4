package day13_ForLoops;

import java.util.Scanner;

public class C1_Ternary {
    public static void main(String[] args) {
       /*
         kullanicidan pozitif bir tamsayi alin
         sayi cift ise "sayi cift"
         degilse "tek sayi" yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen pozitif bir sayı girin ");
        int num= scan.nextInt();

        if (num%2==0){
            System.out.println("sayı çift");
        }else{
            System.out.println("sayı tektır");
        }

        System.out.println("---------------------------------------");



        System.out.println(num%2==0? "cift sayı":"tek sayı");
        //(condition) ? (return if true) : (return if false);
        String result=(num%2==0) ? "cift sayı":"tek sayı";
        System.out.println("result = " + result);

    }
}
