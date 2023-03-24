package day19_CustomMethods_Return;

public class Tasks7_Fibonacci {
    public static void main(String[] args) {
    fibonacci(8);
    }
    public static void fibonacci(int x){
        int a=0;
        int b=1;
        int c;
        System.out.print(a+" "+b);
        for (int i = 0; i <x ; i++) {
            c=a+b;
            a=b;
            b=c;

            System.out.print(" "+c);
        }


    }
}
