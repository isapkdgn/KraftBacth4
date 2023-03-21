package day07_Aritmetic_Opereators;
import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("fahrenheit: ");
        double fahrenheit= scan.nextDouble();
        double celsius=(fahrenheit-32)/1.8;
        System.out.println("celsius = " + celsius);


    }
}
