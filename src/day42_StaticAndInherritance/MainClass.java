package day42_StaticAndInherritance;

import static java.lang.Math.*;

public class MainClass {
    public static void main(String[] args) {
        // B b=new B();
        // B b1=new B(4);
        //  B b2=new B(5);

        // System.out.println(pow(20, 2));
        // System.out.println(DisClass.IcClass.b);
        Papagan papagan=new Papagan();
        Bird bird=new Bird();
        Animal animal=new Animal();

        ChildClass childClass=new ChildClass("Tester","harun");
        System.out.println(childClass.meslek);


    }


}
