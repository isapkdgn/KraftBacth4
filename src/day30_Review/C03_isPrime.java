package day30_Review;

public class C03_isPrime {
// Write a method that takes an integer and check if the number is prime and returns a boolean
public static void main(String[] args) {
    if (isPrime(21)){
        System.out.println("Prime");
    }else{
        System.out.println("Not Prime");
    }
}

public static boolean isPrime(int num){
    boolean isPrime=false;
    int factor=0;
    for (int i = 2; i <num ; i++) {
        if (num%i==0){
            factor++;
            break;
        }
    }
    if (num<2){
        isPrime=false;
    } else if (num==2) {
        isPrime=true;
    } else if (factor==0) {
        isPrime=true;
    }else{
        isPrime=false;
    }


    return isPrime;

}

}
