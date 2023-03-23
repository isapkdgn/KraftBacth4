package day18_CustamMetods;

public class C02_CustomMethodsPractise {
    public static void main(String[] args) {
       helloWords5Times();
        System.out.println("-------------------------------");
        countdownTenToZero();
        System.out.println("-------------------------------");
        evenNumbers();
    }

    /**
     * a function that can print hello world 5 times ==> helloWorld5Times()
     */
    public static void helloWords5Times(){
        for (int i=1;i<=5;i++)
            System.out.println("Hello World!");
    }
    public static void countdownTenToZero(){
        for (int i=10;0<=i;i--){
            System.out.print(i+" ");
        }
    }
    public static void evenNumbers (){
        for (int i=2;i<=100;i+=2)
            System.out.print(i+" ");
    }

    //     a function that can print hello world 5 times ==> helloWorld5Times()
    //     a function that print Ten to Zero  ==> countdownTenToZero()
    //     a function that can print all the even numbers from 1 ~ 100 ==> evenNumbers







}
