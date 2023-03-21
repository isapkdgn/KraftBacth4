package day09_OperatorsCont;

import java.util.Scanner;

public class Tasks01_FlightTicket {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        System.out.print("Please Enter Departure Point ");
        String from= scan.nextLine();

        System.out.print("please Enter Arrival Point");
        String to= scan.nextLine();

        System.out.print("Ticket Price");
        int ticketprice= scan.nextInt();

        System.out.println("From "+from+" to "+to+" is "+ticketprice+"TL");




    }

}
