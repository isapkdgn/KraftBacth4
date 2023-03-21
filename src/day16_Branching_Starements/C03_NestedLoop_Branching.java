package day16_Branching_Starements;

public class C03_NestedLoop_Branching {
    public static void main(String[] args) {


       outerLoop: for (int i = 0; i <3 ; i++) {
            System.out.print("A");

            innerLoop: for (int j = 0; j <5 ; j++) {
                System.out.print("B");
                isa: for (int k = 0; k <10 ; k++) {
                    System.out.print("C");
                    if (k==0){
                        continue outerLoop;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("-------------------------");
        for (int i = 0; i <=100 ; i++) {
            if (i>30&&i<50){
                continue;
            }
            System.out.print (i+" ");
        }
        System.out.println();
        System.out.println("-------------------------");
        for (int i = 0; i <=100 ; i++) {
            if (i%13==0){
                continue;
            }
            System.out.print (i+" ");
        }








    }
}
