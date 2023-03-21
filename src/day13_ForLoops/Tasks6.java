package day13_ForLoops;

import java.util.Scanner;

public class Tasks6 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("taban sayısı");
        int taban= scan.nextInt();
        System.out.println("kuvvet sayısı");
        int kuvvet= scan.nextInt();
        int total=taban;

        for (int i=2; i<=kuvvet; i++){
            total*=taban;
        }
        System.out.println(taban+" üzeri "+kuvvet+" = "+total);
    }
}
