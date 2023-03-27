package day20_CustomMethods_Overloading;

public class Tasks5_OverLooding1 {
    public static void main(String[] args) {
        System.out.println(multipleOfThree(5, 9));
        System.out.println(multipleOfThree(5, 10));

    }
    public static int multipleOfThree(int num1,int num2) {
        int result=0;
        if (num2 % 3 == 0) {
            result=num1+num2;
        } else if (num2 % 3 != 0) {
            result=multipleOfThree(num2);
        }
        return result;
    }
    public static int  multipleOfThree(int num2){
         return num2*3;
    }

}
