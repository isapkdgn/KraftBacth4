package day39_ConstructorOverloading;

public class C03_CarObjects {
    public static void main(String[] args) {
        Car car1=new Car();
        System.out.println("car1.otomatikMi = " + car1.otomatikMi);
        System.out.println("car1.marka = " + car1.marka);
        System.out.println("car1 = " + car1);

        Car car2=new Car("VW");
        System.out.println("car2.otomatikMi = " + car2.otomatikMi);
        System.out.println("car2.marka = " + car2.marka);
        System.out.println("car2 = " + car2);

        Car car3=new Car("Honda","Civic");
        System.out.println("car3.marka = " + car3.marka);
        System.out.println("car3.model = " + car3.model);
        System.out.println(car3);
        renkSec(car3,"kırmızı");
        System.out.println(car3);
        Car.renkSec(car3,"sarı");
        System.out.println(car3);
        Car car4=new Car("BmW","M6","Siyah",300,true);
        System.out.println("car4 = " + car4);

    }
    public static Car renkSec(Car car,String renk){
        car.renk=renk;
        return car;
    }
}

