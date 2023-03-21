package day10_UnaryLogicalOperAndReview;

import java.util.Scanner;

public class C03_SwapVariables {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println(" a sayısı için bir tam sayı giriniz: ");
        int a= scan.nextInt();  //30

        System.out.println("b sayısı için bir tam sayı giriniz: ");
        int b= scan.nextInt();  //20

        System.out.println("a = " + a); // a 30
        System.out.println("b = " + b); // b 20



        int temp=a; //temp 30
        a=b;    //a=20
        b=temp;     //b=30
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
