package day15_If_Else_Swicth_Loops_Summary;

public class C08_Example {
    public static void main(String[] args) {
        for (int i=0;i<=20;i+=3){
            System.out.println(i+" "+(int)Math.pow(i,3)+" ");
        }

        for (int i=0; i<3;i++){
            System.out.print("A");
            for (int j=0;j<5;j++){
                System.out.print("B");
            }
            System.out.println();
        }
        System.out.println("---------------------");
        for (int i=0,k=1;i<5;i++){
            for (int j=0;j<=i;j++) {
                System.out.print(k + " ");
                k++;
            } System.out.println();
        }



        for (int i = 0,k=1; i <5 ; i++) {

            for (int j = 0; j <=i ; j++) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }








    }
}
