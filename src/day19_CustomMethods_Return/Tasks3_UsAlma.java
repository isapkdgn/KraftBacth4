package day19_CustomMethods_Return;

public class Tasks3_UsAlma {
    public static void main(String[] args) {
        System.out.println(exponentiation(5,10));
    }
    public static double exponentiation(double x,double y){
        double result=Math.pow(x,y);
        return result;

    }

}
