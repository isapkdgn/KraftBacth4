package day11_ControlFlowStatemenrs_IF;

import java.util.Scanner;

public class C05_IF_ELSE_Example {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

       /* System.out.println("hava sıcaklıgını girin :");
        double c= scan.nextDouble();
        if(c>=20){
            System.out.println("hava sıcak");
        }else{
            System.out.println("hava soguk");
        }

        */

        System.out.println("bir tam sayı girin");
        int num= scan.nextInt();
        if(num%2==0){
            System.out.println("sayı cift");
        }else{
            System.out.println("sayı tek");
        }
    }
}
