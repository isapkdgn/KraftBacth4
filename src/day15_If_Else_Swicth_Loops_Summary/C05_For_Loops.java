package day15_If_Else_Swicth_Loops_Summary;

import java.util.Scanner;

public class C05_For_Loops {

    public static void main(String[] args) {


        /*for (int i=0 ,k=5;i<3;i++,k+=5){
            System.out.println(k);
        }

         */


        //boolean a=true;
        // kullacının 3 hakkı olsun sifre girsin
        Scanner scan = new Scanner(System.in);
        System.out.println("sifre nedir 3 hakkınız var");
        int sifre = 56;
        boolean result = true;
         int i=0;
        while (result) {
            System.out.println("sifre");
            int tahmin = scan.nextInt();
            if (sifre == tahmin) {

                System.out.println("sifre doğru");
                result = false;
            } else {
                System.out.println(" sifre yanlıs");
                i++;
            }
            if (i==3){
                result=false;
            }

        }

    }
}