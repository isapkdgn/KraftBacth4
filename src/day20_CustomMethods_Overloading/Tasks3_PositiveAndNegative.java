package day20_CustomMethods_Overloading;

public class Tasks3_PositiveAndNegative {
    public static void main(String[] args) {
    positiveAndNegative(25);
    }
    public static void positiveAndNegative(int num){

        if (num<0){
            num=num*(-1);
            System.out.println("number is a positive :"+num);
        } else if (num>0) {
            System.out.println("number is a positive :"+num);
        }


    }
}
