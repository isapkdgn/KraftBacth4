package day08_ScannerAndOperators;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("deger1: ");
        int number1= scan.nextInt();
        System.out.print("deger2: ");
        int number2= scan.nextInt();
        System.out.print("deger3. ");
        int number3= scan.nextInt();
        int sum=+number1+number2+number3;

        System.out.println(" "+number1+"+"+number2+"+"+number3+"="+sum);

    }
}
