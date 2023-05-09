package day49_Exception;

import java.util.Scanner;

public class C02_Exception_2 {



    public static void main(String[] args) {

        /*System.out.println("kod basladı");

        try {
            System.out.println(5/1);
        }catch (Exception exp){
           // System.out.println("hata");
           // exp.printStackTrace();
            System.out.println(exp.toString());
        }

        System.out.println("kod devam ediyor");
     //faktoriyel hesabı bir yapan bir ethod yapınız



        System.out.println(faktoriyel(5));

        System.out.println("0");
        try {
            System.out.println("1");

            System.out.println("2");
            System.out.println("3");
            System.out.println(5/0);
            System.out.println("5");
        }catch (Exception e){
            System.out.println("6");
            try {
                System.out.println(5/0);
            }catch (Exception f) {
                System.out.println("7");
            }
        }

        System.out.println("8");

         */
        System.out.println(sayiGirisi());

    }
    private static  int count=0;
    public static int sayiGirisi(){

        try {
            Scanner scan=new Scanner(System.in);
            System.out.println("sayi: ");
            int x= scan.nextInt();
            count=0;
            return x;

        }catch (Exception e){
            count++;
            if (count==3){
                System.out.println("hakkınız kalmamıştır");
                count=0;
                System.exit(0);
            }
            System.out.println(3-count+" hakkınız kalmıştır" +
                    "");
            return sayiGirisi();
        }
    }











    public static int faktoriyel(int n){
        try {
            int result=1;
            for (int i = 1; i <= n; i++) {
                result*=i;
            }
            return result;
        }catch (Exception e){
            System.out.println("hata:"+e.toString());
            return -1;
        }
    }
}
