package day13_ForLoops;

import java.util.Scanner;

public class C04_NameOfMonth {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number between (1-12) :");
        int n= scan.nextInt();
        String result="";

        if (n>=1&& n<=12){
            if(n==1){
                result="january";

            } else if (n==2) {
                result="february";
            } else if (n==3) {
                result="march";
            } else if (n==4) {
                result="april";
            } else if (n==5) {
               result="may";
            } else if (n==6) {
                result="june";
            } else if (n==7) {
               result="july";
            } else if (n==8) {
                result="august";
            } else if (n==9) {
                result="september";
            } else if (n==10) {
                result="october";
            } else if (n==11) {
                result="november";
            } else if (n==12) {
                result="december";
            }

        }else{
           result="Invalid Number";
        }

        System.out.println(result);
        System.out.println("---------------------------------------------");
        String nameOfMonth=(n>=1 && n<=12)? (n==1)?"january":(n==2)?"february":(n==3)?"march":(n==3)?"march":
                (n==4)?"april":(n==5)?"may":(n==6)?"june":(n==7)?"july":(n==8)?"august":(n==9)?"septemper":
                        (n==10)?"october":(n==11)?"november":"december":"ınvalid number";
        System.out.println(nameOfMonth);



    }
}
