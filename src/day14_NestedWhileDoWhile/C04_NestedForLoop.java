package day14_NestedWhileDoWhile;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        for (int i=1; i<=6;i++){
            for ( int j=1; j<=6;j++){
            System.out.print(1);
            }
            System.out.println();
        }

        System.out.println("---------------------------------------------------");


        for (int i=6; 0<=i;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------");

        for (int i=1;i<=6;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------");

        int weeks=3;
        int days=7;
        for (int i=1;i<=weeks;i++) {
            System.out.println("weeks:" + i);
        for (int j=1;j<=days;j++)
            System.out.println("days :"+j);
        }
        System.out.println("-------------------------------------------------");
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                System.out.print(" ");
                if (i==j){
                    System.out.print("X");
                }
                if (j==9-i){
                    System.out.print("X");
                }
            }
            System.out.println();
        }








        }

    }

