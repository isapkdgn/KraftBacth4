package day11_ControlFlowStatemenrs_IF;

import java.util.Scanner;

public class Tasks2 {
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);

        System.out.println("num1 giriniz");
        int num1= Scan.nextInt();
        System.out.println("num2 giriniz");
        int num2= Scan.nextInt();
        System.out.println("num3 giriniz");
        int num3= Scan.nextInt();

        if(Math.max(num1,num2)==num1&&Math.max(num1,num3)==num1){
            System.out.println("big number: "+num1);
        }else if(Math.max(num2,num3)==num2&&Math.max(num2,num1)==num2){
            System.out.println("big number: "+num2);
        }else{
            System.out.println("big number: "+num3);
        }



    }
}
