package day10_UnaryLogicalOperAndReview;

public class Tasks3 {
    public static void main(String[] args) {

        boolean x=false;
        boolean y=false;
        boolean z=true;

        x=!y;
        z=!x && x==z;
        System.out.println(z);
        System.out.println("-----------------");

        int i=2;
        boolean ln=--i==i || i<1;
        System.out.println(ln);
        System.out.println("-----------------");
        int a=2;
        boolean ln1=a++==a || a<1;
        System.out.println(ln1);


    }
}
