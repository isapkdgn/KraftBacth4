package day13_ForLoops;

import java.util.Scanner;

public class Tasks2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter  A Word");
        String word= scan.nextLine();
        System.out.println("How Many Times To Write A Word");
        int w= scan.nextInt();

        for (int i=1 ;i<=w ;i++){
            System.out.println(word);
        }
    }
}
