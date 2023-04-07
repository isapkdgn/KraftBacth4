package day29_FullReview;

import java.util.Scanner;

public class C02_CustomMethodsReturn {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();
        System.out.println("isEven(5) = " + isEven(5));
        if (isEven(num)){
            System.out.println(num+" is an even number");
        }
        System.out.println("----------------------------");
        System.out.println(ageOfPerson(1984));
        System.out.println("----------------------------");
        System.out.println("printNumber(10,20) = " + printNumber(10, 20));
    }



    public static boolean isEven(int num){
        if (num%2==0){
            return true;
        }
        return false;

        //return num%2==0? true:false;
    }
    public static int ageOfPerson(int birthYear){
        return 2023-birthYear;
    }
    public static String printNumber(int x,int y){
        String result="";
        for (int i=x+1;i<y;i++){
            result+=i+" ";
        }
        return result;
    }







}
