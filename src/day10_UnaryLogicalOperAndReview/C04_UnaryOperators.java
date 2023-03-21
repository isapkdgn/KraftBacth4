package day10_UnaryLogicalOperAndReview;

public class C04_UnaryOperators {
    public static void main(String[] args) {

        int num1=+3;
        int num2=-2;
        System.out.println(num1>0);
        System.out.println(num2>0);

        System.out.println("--------------------------");

        int a=10;
        ++a;    //a=a+1; pre increment : sayının degerini bir artırıyor // a=11
        System.out.println("a : "+a);

        --a;    // pre decrement : sayının degerini bir azaltır //a=10
        System.out.println("a : " + a);
        System.out.println("--------------------------");

        int b=99;
        System.out.println(++b);  // pre increment b=100

        int c=99;
        System.out.println(c++);    // post increment c yı konsala yazacak 99---> c=100
        System.out.println(c);      //100
        System.out.println("--------------------------");

        int x=201;
        System.out.println(--x);    // pre decrement // x=200

        int y=201;

        System.out.println(y--);    // post increment consalam=201
        System.out.println(y);       //200
        System.out.println("--------------------------");


        int z=44;
        System.out.println(++z);  // 45 z=45
        System.out.println(z++);    //45 z=46
        System.out.println(z++);      //46 z=47
        System.out.println("--------------------------");
        int i=42;
        System.out.println(--i);    //41 i=41
        System.out.println(i--);    //41 İ=40
        System.out.println(i);
    }
}
