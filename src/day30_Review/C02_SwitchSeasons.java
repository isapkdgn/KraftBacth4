package day30_Review;

import java.util.Scanner;

public class C02_SwitchSeasons {

    // Write a method that takes the month number from the user and returns the season.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the month number as an integer(1-12)");
        int month= scan.nextInt();
        System.out.println("whichSeason("+month+") = " + whichSeason(month));
    }

    public static String whichSeason(int month){
       String season="";

        switch (month){

            case 12,1,2:
                season="winter";
                break;
            case 3,4,5:
                season="spring";
                break;
            case 6,7,8:
                season="summer";
                break;
            case 9,10,11:
                season="fall";
                break;
            default:
                season="invalid month number";
        }

      return season;
    }

}
