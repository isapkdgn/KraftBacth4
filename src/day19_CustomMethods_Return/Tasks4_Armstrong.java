package day19_CustomMethods_Return;

public class Tasks4_Armstrong {
    public static void main(String[] args) {
    armstrong();
    }
    public static void armstrong(){


        for(int i=100;i<1000;i++){
            int yuzler,onlar,birler,toplam;
            yuzler=i/100;
            onlar=(i%100)/10;
            birler=i%10;

            toplam= (int) (Math.pow(yuzler,3)+Math.pow(onlar, 3)+Math.pow(birler, 3));

            if(i == toplam){

                System.out.print(i + " ");
            }

        }




    }
}
