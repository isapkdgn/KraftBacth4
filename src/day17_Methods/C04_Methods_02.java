package day17_Methods;

import java.util.Scanner;

public class C04_Methods_02 {
    public static void main(String[] args) {
        //aritmeticOrtalam();
        //buyukSayi();
        kiloOkkaCevir();
        //int sayi=5;
        //kupHesaplama(sayi);
        //kareHesaplama(sayi);
        //isimYaz("isa");
        //max(5,10);
        //ortalama(15,30);
        //isimYas("isa",38);

    }

    /**
     * a metod that returns the max of to consaole
     */


    public static void aritmeticOrtalam(){

        double x=3,y=5,z=10;
        double result=(x+y+z)/3;
        System.out.println("ortalama :"+result);
    }

    public static void buyukSayi(){
        int x=10,y=15;
        int max;
        if (x>y){
          max=x;
        }else {
            max=y;
        }
        System.out.println("en buyuksayi:"+max);
    }

    public static void kiloOkkaCevir(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Kiogram: ");
        double kg= scan.nextDouble();
        double okka=kg/1.282;
        System.out.println(kg+" kg "+okka+" okkadır");

    }


    public static void kupHesaplama(int x){
        int result=x*x*x;
        System.out.println("sonuc:"+result);
    }
    // 1 sayının karesini yazan metodu yazınız
    public static void kareHesaplama(int x){
        int result=x*x;
        System.out.println("sonuc:"+result);
    }
    // parametre olarak isminizi alan ve sonucunda isminiz..... dır

    public static void isimYaz(String name){
        System.out.println("isminiz : "+name+" dır");
    }

    public static void max(int x,int y){

        int max;
        if (x>y){
            max=x;
        }else {
            max=y;
        }
        System.out.println("en buyuksayi:"+max);
    }
    public static void ortalama(double x,double y){
        double result=(x+y)/2;
        System.out.println("ortalama: "+result);

    }
    public static void isimYas(String isim,int yas){
        System.out.println(isim+" "+yas+" dadır");
    }



}
