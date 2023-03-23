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
        System.out.println();
        System.out.println("-------------------------");
        // 0-1000 arasındaki 5 ve 5 nin katlarını ekrana yazdırın ancak bu sayılardan 50 ye tam bölünenler olmasın
        for (int i=5;i<=1000;i+=5){
            if (i%50==0){
                continue;

            }
            System.out.print(i+" ");
        }







    }
}
