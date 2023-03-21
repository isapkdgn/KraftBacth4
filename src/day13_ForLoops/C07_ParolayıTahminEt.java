package day13_ForLoops;

import java.util.Scanner;

public class C07_ParolayıTahminEt {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String parola="safak";
        String tahmin="";
        int hak=3;

        System.out.println("paolayı tahmin ediniz toplam 3 defa hakkınıx var");
        for (int i=1;i<=3;i++){
            tahmin= scan.nextLine();
            if(tahmin.equals(parola)){
                System.out.println("tebrikler parolayı bildiniz");
                break;
            }else{
                System.out.println("parola yanlıs.kalan tahmin hakkınız : "+ (hak-i));
            }
        }










    }
}
