package day15_If_Else_Swicth_Loops_Summary;

import java.util.Scanner;

public class C01_If_Else {

    public static void main(String[] args) {

        //kullanıcının  girdiğiğ sayı tek mi cift mi

       /* int x=9;
        if (x%2==0){
            System.out.println("cift");
        }else {
            System.out.println("tek");
        }

        //kullanıcının  girdiğiğ sayı pozitif/negativ/ veya 0 esitse yazın

        int y=0;

        if (y>0){
            System.out.println("pozitif");
        } else if (y<0) {
            System.out.println("negative");
        }else {
            System.out.println("sıfır");
        }*/
       /* int x=35;


        if (!(x%2==0)){
            System.out.println("sayı pozitif");
        }

        */

        int x=25;
        int y=78;
        int z=87;

        if (x>=y&&x>=z){
            System.out.println(x);
        } else if (y>=x&&y>=z) {
            System.out.println(y);
        }else {
            System.out.println(z);
        }
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
        double a= scan.nextDouble();
        System.out.println("enter a number");
        double b= scan.nextDouble();

        a=Math.round(a*1000);
        a=a/1000;
        b=Math.round(b*1000);
        b=b/1000;

        if (a==b){
            System.out.println("they are the sama to three decimal places");
        }else {}
        System.out.println("they are different");


    }
}
