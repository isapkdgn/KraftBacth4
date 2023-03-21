package day13_ForLoops;

import java.util.*;

public class Tasks5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("taban sayısı girin");
        int t= scan.nextInt();
        System.out.println("kuvvet sayısı girin");
        int k= scan.nextInt();

       for (int i=(int)Math.pow(t,k);;){
           System.out.println(t +" üzeri "+k+" = "+i);
           break;
       }













    }
}
