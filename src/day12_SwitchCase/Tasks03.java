package day12_SwitchCase;

import java.util.Scanner;

public class Tasks03 {
    public static void main(String[] args) {
        /*Bir sayı için 5 den 25 den ve 50 den büyük olup olmadığını
        denetimini yapın. Eğer sayı 5 den büyükse 5 den büyük
        olduğunu konsola yazdırın. Sayı 25 den de büyükse hem 5
        hem 25 den büyük olduğunu konsola yazdırın. Sayı 25 den
        kücük 5 den büyükse sayının 5 den büyük ancak 25 den
        küçük olduğunu yazdırın.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı girin ");
        int sayi= scan.nextInt();

        if(sayi>50){
            System.out.println("sayi 50 den büyük");
        } else if (sayi>25) {
            System.out.println("sayi hem 5 den hem de 25 büyük");

        } else if (sayi>5&&sayi<25) {
            System.out.println("sayi 5 den büyük 25 den kücük ");

        } else if (sayi>5) {
            System.out.println("sayi 5 den büyük");

        }
    }
}
