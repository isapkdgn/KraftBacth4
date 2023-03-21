package day07_Aritmetic_Opereators;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        //System.out.println("Math.pow(2,5) = " + Math.pow(2, 5));
        System.out.println("Math.sqrt(25) = " + Math.sqrt(25));

        //Scanner scan=new Scanner(System.in);
       // System.out.print("Lütfen bir kelime giriniz: ");
       // String str=scan.nextLine();
        //System.out.print("girdiniz kelime"+str+"dır");

        //System.out.println("kimya: ");
        //int kimya= scan.nextInt();
        /* Scanner scan=new Scanner(System.in);
         System.out.print("Doğum yiliniz: ");
         int yil=scan.nextInt();
         int yas=2023-yil;
        System.out.println("yas = " + yas);*/

        Scanner scan=new Scanner(System.in);
        System.out.print("fizik: ");
        double f= scan.nextDouble();
        System.out.print("matematik: ");
        double m= scan.nextDouble();
        System.out.print("kimya: ");
        double k= scan.nextDouble();
        double ort=(f+k+m)/3;
        System.out.println("ortalama: "+ort);




    }
}
