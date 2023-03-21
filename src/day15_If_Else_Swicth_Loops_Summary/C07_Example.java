package day15_If_Else_Swicth_Loops_Summary;

public class C07_Example {
    public static void main(String[] args) {

        //soru 1 1-100 çift sayıları yzaın

        for (int i=1;i<=100;i++){
            if (i%2==0){
                System.out.print(i+" ");
            }


        }
        System.out.println();
        for (int i=2;i<=100;i+=2){

                System.out.print(i+" ");

        }
        System.out.println();
        int j=2;
        while (j<=100){

            System.out.print(j+" ");
            j+=2;
        }
        System.out.println();

        int k=0;
        do {
            System.out.print(k+" ");
            k+=2;

        }while (k<=100);














    }
}
