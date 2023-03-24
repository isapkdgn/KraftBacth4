package day20_CustomMethods_Overloading;

public class Tasks1_LastDigit {
    public static void main(String[] args) {
        System.out.println("lastDigit(17,36) = " + lastDigit(17, 36));
    }
    public static boolean lastDigit(int num1,int num2){
        boolean lastDigit;

        if (num1%10==num2%10){
            lastDigit=true;
        }else {
            lastDigit=false;
        }
        return lastDigit;

    }


}
