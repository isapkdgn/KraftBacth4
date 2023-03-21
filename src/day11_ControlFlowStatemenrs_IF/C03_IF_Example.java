package day11_ControlFlowStatemenrs_IF;

import java.util.Scanner;

public class C03_IF_Example {
    public static void main(String[] args){
    /* alini fizik notu 50
    kimya notu 30 ortalaması 50 üzerinde ise gecti ekrana geçti
    50 ve altında ise herhangi bir sey yazmasın


         double f=50;
         double k=55;
         double ort=(f+k)/2;
         boolean result=(ort>50);
         //if((f+k)/2)>50)
         //if(result)
        if(ort>50){
             System.out.println("Ali gecti");
         }*/

        Scanner scan=new Scanner(System.in);
        System.out.println("ders notlarını giriniz");
        System.out.println("fizik");
        double f= scan.nextDouble();
        System.out.println("kimya");
        double k= scan.nextDouble();
        System.out.println("gecme notu");
        double gecmeNotu= scan.nextDouble();
        double ort=(f+k)/2;
        if(ort>=gecmeNotu){
            System.out.println("sınıfı gectiniz tebrikler");
        }else{

        }
        System.out.println("A");
        System.out.println("B");

    }
}
