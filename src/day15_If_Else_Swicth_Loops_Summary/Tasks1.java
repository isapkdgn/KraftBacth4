package day15_If_Else_Swicth_Loops_Summary;

import java.util.Scanner;

public class Tasks1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println(" enter a number");
        int num= scan.nextInt();
        /*int sum=0;
        do {
            sum+=num%10;
            num/=10;

        }while (num>0);
        System.out.println(sum);

         */
            int mul=1;
        do{
            mul*=num%10;
            num/=10;
        }while (num>0);
        System.out.println(mul);












    }
}
