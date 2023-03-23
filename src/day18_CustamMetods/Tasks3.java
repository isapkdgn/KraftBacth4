package day18_CustamMetods;

import java.util.Scanner;

public class Tasks3 {
    public static void main(String[] args) {
        calculator();

    }public static void calculator(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        double x= scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter operation");
        String operation= scan.nextLine();
        System.out.println(" Enter a number");
        double y= scan.nextDouble();
        double result=0;
        if (operation.equals("+")){
            result=x+y;
        } else if (operation.equals("-")) {
            result=x-y;
        } else if (operation.equals("/")) {
            result= x/y;
        } else if (operation.equals("*")) {
            result=x*y;
        }
        System.out.println(result);

    }


}
