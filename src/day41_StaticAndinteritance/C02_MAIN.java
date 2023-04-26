package day41_StaticAndinteritance;

public class C02_MAIN {

    public static void main(String[] args) {
        Car car=new Car("Honda",1997,123,"harun123",true,false);
        Car car1=new Car("Mercedes",1997,123,"harun123",true,false);
        Car car2=new Car("Audi",1997,123,"harun123",true,false);
        Car car3=new Car("Hyundai",1997,123,"harun123",true,false);
      // Integer sayi=new Integer(15);
        //"harun123"
      //  car.setSaseNo("isa071");
       // System.out.println(car.getSaseNo());
        car.setBeygir(80);
        System.out.println(car.getBeygir());
       Car.tekerlekSayisi=100;

        System.out.println(car3.tekerlekSayisi);
        System.out.println(car2.tekerlekSayisi);

    }
}
