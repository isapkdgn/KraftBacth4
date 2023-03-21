package day12_SwitchCase;

import java.util.Scanner;

public class C05_Example {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       /* System.out.println("öğrenci not ortalamsı girin");
        double ort= scan.nextDouble();
        if(ort<50) {
            System.out.println("zayıf");
        }else if(ort>=50&&ort<70){
            System.out.println("orta");
        }else if(ort>=70&&ort<85) {
            System.out.println("iyi");
        }else{
            System.out.println("pekiyi");
        }*/
        System.out.println("öğrenci not ortalamsı girin");
        double ort= scan.nextDouble();
        if(ort<50) {
            System.out.println("zayıf");
        }else if(ort<70){
            System.out.println("orta");
        }else if(ort<85) {
            System.out.println("iyi");
        }else {
            System.out.println("pekiyi");
            if(ort>=95){
                System.out.println("basrı belgesi alsın");
            }
        }






    }
}
