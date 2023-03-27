package day20_CustomMethods_Overloading;

public class Tasks2_PrimeNumbers {
    public static void main(String[] args) {


        System.out.println(primeNumbers(7));


    }

    public static boolean primeNumbers(int num){
        boolean primeNumbers=true;
       if (num>1){
           for (int i=2;i<num;i++){
               if (num%i==0){
                   primeNumbers=false;
                   break;
               }else {
                   primeNumbers=true;
               }
           }
       }
       return primeNumbers;
    }


}

