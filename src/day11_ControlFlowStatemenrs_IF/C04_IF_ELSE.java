package day11_ControlFlowStatemenrs_IF;

import java.util.Scanner;

public class C04_IF_ELSE {
    public static void main(String[] args) {

       /* double f=30;
        double k=55;
        double ort=(f+k)/2;
        double gecmeNotu=50;
        if(ort>gecmeNotu){
            System.out.println("ali gecti");

        }else{
            System.out.println("ali kaldı");
        }*/

        //fizik kimya ve matematik notlarını konsoldan alsın
        //ortalama 80 üzerinde ise geçti yazsın
        // 80 ve altında ise kaldınız yazsın

        Scanner scan=new Scanner(System.in);
        System.out.println("fizik notu girin");
        double f= scan.nextDouble();
        System.out.println("kimya notu girin");
        double k= scan.nextDouble();
        System.out.println("matematik notu girin");
        double m= scan.nextDouble();
        double ort=(f+k+m)/3;

        double gecmeNotu=80;
        if(ort>gecmeNotu){
            System.out.println("Gecti");
        }else{
            System.out.println("Kaldı");
        }


    }
}
