package day19_CustomMethods_Return;

public class Tasks2_Basamak {
    public static void main(String[] args) {
        System.out.println("digitsOfNumber() = " + digitsOfNumber(752036));

    }
    public static int digitsOfNumber(int num){
       int digits=0;
       while (num>0){
        num/=10;
        digits++;
       }
       return digits;
    }
}
