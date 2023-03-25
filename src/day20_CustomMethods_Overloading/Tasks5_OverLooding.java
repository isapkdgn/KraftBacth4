package day20_CustomMethods_Overloading;

public class Tasks5_OverLooding {
    public static void main(String[] args) {
        multipleOfThree(5,10);
    }
    public static void multipleOfThree(int num1,int num2) {

        if (num2 % 3 == 0) {
            System.out.println(num1+num2);
        } else if (num2 % 3 != 0) {
            multipleOfThree(num2);
        }

    }
    public static void multipleOfThree(int num2){
        System.out.println(num2*3);
    }








}
