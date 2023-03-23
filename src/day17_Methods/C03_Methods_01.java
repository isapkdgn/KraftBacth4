package day17_Methods;

public class C03_Methods_01 {
    public static void main(String[] args) {

message_1();
yas(1984);
kuvvet(5,5);
islem(5,6);
    }
    public static void message_1(){
        message_3();
        System.out.println("1");
    }
    public static void message_2(){
        message_1();
        System.out.println("2");
    }
    public static void message_3(){
        System.out.println("3");

    }
    public static void yas(int x){

        int result=2023-x;
        System.out.println("yasiniz: "+result);
    }
    public static void kuvvet(double x,double y){
        double result=Math.pow(x,y);
        System.out.println(result);
    }public static void islem(int x,int y){
        int result=x+y;
        System.out.println(x+"+"+y+"="+result);
    }












    /*
    public static void hello(){
        System.out.println("Bankamıza hoşgeldiniz");

    }

    public static void menu(){
        System.out.println("1:Para cekme 2: para yatır 3: bakiye görüntüleme 4: cıkıs");
    }

     */


}
