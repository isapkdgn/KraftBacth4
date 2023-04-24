package day15_If_Else_Swicth_Loops_Summary;

import java.util.Scanner;

public class TasksPiramit {
    public static void main(String[] args) {
      /*  Scanner scan=new Scanner(System.in);


        System.out.println("satır sayısını sayın");
        int satırsayısı= scan.nextInt();

        for (int satır=0;satır<satırsayısı;satır++){

            for (int bosluk=0;bosluk<satırsayısı-(satır+1);bosluk++){
                System.out.print(" ");
            }

            for (int yildiz=0;yildiz<1+(satır*2);yildiz++){
            System.out.print("*");
            }
            System.out.println();
        }

       */
        System.out.println("-------------------------------------------");
        for (int i = 5; i >0 ; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 6-i; k >0 ; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }













    }
}
