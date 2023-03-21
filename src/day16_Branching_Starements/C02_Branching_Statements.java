package day16_Branching_Starements;

import java.util.Scanner;

public class C02_Branching_Statements {

    public static void main(String[] args) {

        //break continue return
        //System.out.println("program basladı");
        /*
        for (int i = 0; i <100 ; i++) {

            if (i%2==0){
              continue;
            }
            if (i>10){
                break;
            }
            System.out.print(i+" ");
        }
        System.out.println("program sonlandı");

         */

        //0 ve 20 dahil aradaki cift sayılarının toplamanını ekrana yazdırın

        int sum=0;

      /* for (int i = 0; i <=20 ; i+=2) {
             sum+=i;
        }
        System.out.println(sum);


        for (int i = 0; i <=20 ; i++) {
            if (i%2==1){
                continue;
            }
            sum+=i;
        }
        System.out.println(sum);

       
        //1 den 100 kadar 5 nin katlanrını ekrana continue kullanarak ekrana yazın

        for (int i = 1; i <=100 ; i++) {
            if (!(i%5==0)){
                continue;
            }
            System.out.print(i+" ");
        }
        

        for (int i = 0; i <2 ; i++) {
            System.out.print("B");
            for (int j = 0; j <10 ; j++) {
                if (j==5){
                    System.out.print("C");
                    break;
                }
                if (j>2){
                    continue;
                }
                System.out.print("A");
            }
            
        }

       */

//   // Şifre tanımlayın ve kullanıcıya ekrandan
//// 5 defa şifreyi girmesini isteyin. Her bulamadığında şifre doğru değildir tekrar deneyin ikazı çıksın.
//// Şifreyi bulursa «tebrikler şifre doğru» yazısı gösterildikten sonra programdan çıkış işlemi gerçekleşsin.
        Scanner scan=new Scanner(System.in);
        String sifre="Harun123";
        int i=0;
        boolean flag=true;
        while (flag){
            System.out.print(i+1+"Tahmin: ");
            String tahmin= scan.next();
            if (tahmin.equals(sifre)){
                System.out.println("tebrikler");
                break;
            }
            i++;
            if (i==5){
                System.out.println("tahmin hakkınız doldu");
                flag=false;
                continue;
            }

            System.out.println(" tekrar deneyin");

        }



























    }
}
