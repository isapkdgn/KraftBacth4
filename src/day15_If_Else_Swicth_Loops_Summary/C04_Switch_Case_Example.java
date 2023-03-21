package day15_If_Else_Swicth_Loops_Summary;

import java.util.Scanner;

public class C04_Switch_Case_Example {
    public static void main(String[] args) {
            //SWICTH CASE de: byte short int char Sting değerlerini karşılaştırma yapılır
      /*  int x=5;

        switch (x){

            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                break;
            case 5:
                System.out.println("E");
                break;
            default:
                System.out.println("F");


        }*/

        // et menü sebxe menü cocuk menu(1-2-3)
        // et menü pirzola 50 tavuk 30
        // sebze menü enginar 30  roka salata 40
        // cocuk menu patates kızarması 10 makarna 5tl

        Scanner scan=new Scanner(System.in);
        System.out.println("et menü sebxe menü cocuk menu(1-2-3)");
        int tercih_1= scan.nextInt();

        switch (tercih_1){

            case 1:
                System.out.println("pirzola (1) tavuk (2)");
                int tercih_2= scan.nextInt();
                switch (tercih_2){
                    case 1:
                        System.out.println("pirzola 50 tl");
                        break;
                    case 2:
                        System.out.println("tavuk 30 tl");
                        break;
                    default:
                        System.out.println("hatalı giriş");

                }

           break;
            case 2:
                System.out.println("enginar (1) roka (2)");
                int tercih_3= scan.nextInt();
                switch (tercih_3){
                    case 1:
                        System.out.println("enginar 50 tl");
                        break;
                    case 2:
                        System.out.println("roka 30 tl");
                        break;
                    default:
                        System.out.println("hatalı giriş");

                }

        }


        }



    }

