package day42_StaticAndInherritance;

import day43_InheritanceAndKeywords.Sekiller;

import static java.lang.Math.*;

public class MainClass extends Sekiller {
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
        System.out.println(Sekiller.a);


    }


}
