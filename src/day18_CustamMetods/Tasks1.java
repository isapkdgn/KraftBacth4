package day18_CustamMetods;

import java.util.Scanner;

public class Tasks1 {
    public static void main(String[] args) {

        calculatingTwoDigits(20,"/",6);
        calculateOfBirthyear(1984);

    }

    // a metod  that can calculate x and y numbers

    /**
     * a metod  that can calculate x and y numbers
     * @param x
     * @param operation
     * @param y
     */
    public static void calculatingTwoDigits(int x, String operation, int y){
            double result=0;
        if (operation.equals("+")){
             result=x+y;
        } else if (operation.equals("-")) {
           result=x-y;
        } else if (operation.equals("/")) {
                result=(double) x/y;
        } else if (operation.equals("*")) {
             result=x*y;
        }else{

        }
        System.out.println(result);

    }
    public static void calculateOfBirthyear(int x){

        int result=2023-x;
        System.out.println("Your age :"+result);

    }



}
