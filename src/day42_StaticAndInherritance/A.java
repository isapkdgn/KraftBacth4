package day42_StaticAndInherritance;

public class A {

    public static String staticVariable="Ogretmen";
    public String normalVariable;


    public static void staticMetHod(){
      //  normalMethod();
     //   System.out.println(normolVariable);
        staticMetHod();

        System.out.println("ben bir  static metodum");
    }

    public void normalMethod(){
        staticMetHod();
        System.out.println(staticVariable);
        System.out.println("ben bir normal metodum");
    }
}
