package day21_Class_And_Object;

import java.util.Scanner;

public class C04_Methods_Last_Question {
    public static void main(String[] args) {
        System.out.println(sayiAl());

    }
    public static int sayiAl(){
        Scanner scan=new Scanner(System.in);
        System.out.print("1.sayı :");
        int sayi= scan.nextInt();
        System.out.print("2, sayi :");
        int sayi2= scan.nextInt();
        int sayi3=ucunkatı(sayi2);
        return (sayılariTopla(sayi,ucunkatı(sayi2)));
    }
    public static int ucunkatı(int sayi2){
        if (sayi2%3==0){
            return sayi2;
        }

        return  sayi2-sayi2%3;
    }
    public static int sayılariTopla(int x,int y ){
        return x+y;
    }


}
