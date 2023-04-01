package day25_Summary;

import java.util.Scanner;

public class C01_Methods {
    public static void main(String[] args) {


        int x=5;
        int y=10;
        int z=ornekMethods(x,y);

        System.out.println(z);
        //ornekMethods(x,y)=return ?

        System.out.println("sonDeger(\"merhaba\") = " + sonDeger("merhaba"));
        System.out.println("sonDeger1(\"merhaba\") = " + sonDeger1("merhaba"));

        int sayi1=5;
        int sayi2=10;
        // toplamları max değerin 4 katı mı kontrol edin
        System.out.println(4 * max(sayi1, sayi2) == sum(sayi1, sayi2));

        String str1="harun";
        System.out.println(ucekle(str1));
        //contain(str1)

    }

    public static int  ornekMethods(int x,int y){
        System.out.println("merhaba");
        int z=x+y;
        return 'A';
    }
    //int f(X)=2x+5;
    //x=5;
    // int y=10+f(x)
    //
    public static char sonDeger(String str){
       char result=' ';
        for (int i = 0; i <str.length() ; i++) {
            result=str.charAt(i);
        }
        return result;
    }
    public static char sonDeger1(String str){
        return str.charAt(str.length()-1);
    }

    public static int max(int a,int b){
        if (a>b){return a;}
        return b;
    }

    public static int sum(int x,int y){
        return x+y;
    }
    public static String ucekle(String str){
        return str+"3";
    }
    public static boolean contain(String str,String deger){

        return str.contains(deger);

    }
}
