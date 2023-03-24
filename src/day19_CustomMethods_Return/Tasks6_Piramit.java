package day19_CustomMethods_Return;

public class Tasks6_Piramit {
    public static void main(String[] args) {
    triangle(3);
    }

    public static void triangle(int x){
        for (int i=x;i>0;i--){
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int k=(x+1)-i;k>0;k--){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
