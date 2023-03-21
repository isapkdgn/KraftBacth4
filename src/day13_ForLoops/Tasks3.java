package day13_ForLoops;

import java.util.Scanner;

public class Tasks3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter A number Between to(0-1000)");
        int num= scan.nextInt();
        int sum=0;


        for (int i=0; i<=num; i++ ){
            sum+=i;
        }
        System.out.println("sum :"+sum);


    }
}
