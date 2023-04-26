package day39_ConstructorOverloading;

public class C06_Cat {

    public static void main(String[] args) {

        Cat cat1=new Cat("blue","ankara",false,true);
        System.out.println("cat1 = " + cat1);
        System.out.println("cat1.run() = " + cat1.run());
        System.out.println("cat1.food() = " + cat1.food());
        System.out.println("cat1.sleep() = " + cat1.sleep());
    }
}
