package day07_Aritmetic_Opereators;

import java.util.Scanner;
public class Odev1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("yaricap");
        double yaricap= scan.nextDouble();
        double alan=Math.PI*(yaricap*yaricap);
        System.out.println("alan = " + alan);
        double cevre=2*Math.PI*yaricap;
        System.out.println("cevre = " + cevre);


    }
}
