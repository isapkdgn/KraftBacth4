package day12_SwitchCase;

import java.util.Scanner;

public class Tasks02 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("enter first number for operation");
        int num1= scan.nextInt();
        System.out.println("select the action : (+,-,/,*) ");
        String action= scan.next();
        System.out.println("enter second number for operation");
        int num2= scan.nextInt();
        switch (action){
            case "+":
                System.out.println(num1+num2);
                break;
            case"-":
                System.out.println(num1-num2);
                break;
            case"/":
                System.out.println((double) num1/num2);
                break;
            case"*":
                System.out.println(num1*num2);
                break;
            default:
                System.out.println("incorrect entry");









        }











    }
}
