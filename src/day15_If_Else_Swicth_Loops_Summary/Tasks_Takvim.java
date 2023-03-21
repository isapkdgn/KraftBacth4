package day15_If_Else_Swicth_Loops_Summary;

import java.util.Scanner;

public class Tasks_Takvim {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        /*
        int number_Of_DaysInMonth=0;
        String mothOfName="";
        System.out.println("Input a month number");
        int month= scan.nextInt();
        System.out.println("Input a year");
        int year= scan.nextInt();
        switch (month){

            case 1:
                mothOfName="january";
                number_Of_DaysInMonth=31;
                break;
            case 2:
                mothOfName="february";
                if ((year%400==0)||((year%4==0&&year%100!=0))){
                    number_Of_DaysInMonth=29;
                }  else {
                    number_Of_DaysInMonth=28;
                }
                break;
            case 3:
                mothOfName="march";
                number_Of_DaysInMonth=31;

                break;
            case 4:

                mothOfName="april";
                number_Of_DaysInMonth=30;

                break;

            case 5:
                mothOfName="may";
                number_Of_DaysInMonth=31;

                break;
            case 6:
                mothOfName="june";
                number_Of_DaysInMonth=30;

                break;
            case 7:
                mothOfName="july";
                number_Of_DaysInMonth=31;

                break;
            case 8:
                mothOfName="august";
                number_Of_DaysInMonth=31;

                break;
            case 9:
                mothOfName="september";
                number_Of_DaysInMonth=30;

                break;
            case 10:
                mothOfName="october";
                number_Of_DaysInMonth=31;

                break;
            case 11:
                mothOfName="november";
                number_Of_DaysInMonth=30;

                break;
            case 12:
                mothOfName="december";

                number_Of_DaysInMonth=31;

                break;

        }
        System.out.print(mothOfName+" "+year+" has "+number_Of_DaysInMonth+"days\n");


        int i,n=0,s=0;
        double avg;
        {
            System.out.println("bes sayı girin");

            for (i = 0; i < 5; i++) {
                 n = scan.nextInt();
                s += n;

            }
            avg = s / 5;
            System.out.println("bes sayının toplamı "+s+"\n ortalaması " +avg);
        }

         */
        System.out.println("sayı girin");
        int n= scan.nextInt();
        for (int j=1;j<n;j++){
            System.out.println("sayı "+j+ "küpü "+(j*j*j));
        }








    }
}
