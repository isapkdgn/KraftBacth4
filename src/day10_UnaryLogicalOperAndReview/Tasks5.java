package day10_UnaryLogicalOperAndReview;

import java.util.Scanner;

public class Tasks5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("enter name");
        String name= scan.nextLine();

        System.out.println("enter age");
        short age= scan.nextShort();

        boolean isEligible=age<=21;
        System.out.println(name+" is eilgible to buy cigarettes :"+isEligible);

    }
}
