package day10_UnaryLogicalOperAndReview;

import java.util.Scanner;

public class C01_PossitiveOrNegative {
    public static void main(String[] args) {

       // 1. Create a class called C01_PositiveAndNegative, and  write a
        // program that can identify if the user entered number is
        //positive, or negative or zero.
       // Ex:
        //number = 200


        Scanner sacn=new Scanner(System.in);

        System.out.println("Enter number :");
        int number= sacn.nextInt();
        boolean isPositive=number>0;
        boolean isNegative=number<=0;
        boolean isZero=number==0;

        System.out.println(number+" is positive :"+isPositive);
        System.out.println(number+" is negative :"+isNegative);
        System.out.println(number+" is zero :"+isZero);







    }

}
