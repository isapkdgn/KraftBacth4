package day39_ConstructorOverloading;

public class Car {

    String marka; // default oluyor
    String model;
    String renk;
    int hız;
    boolean otomatikMi;

    public Car()
    {}
    public Car(String marka){
        this.marka=marka;
        /* parametre ismi instance variable ile aynı değilse direk atama yapabiliriz
        *
        *
         */
    }
    public Car(String marka,String model){
        this.marka=marka;
        this.model=model;
    }
    public Car(String marka,String model,String renk){
        this.marka=marka;
        this.model=model;
        this.renk=renk;
    }
    public Car(String marka,String model,String renk,int hız){
        this.marka=marka;
        this.model=model;
        this.renk=renk;
        this.hız=hız;
    }
    public Car(String marka,String model,String renk,int hız,boolean otomatikMi){
        this.marka=marka;
        this.model=model;
        this.renk=renk;
        this.hız=hız;
        this.otomatikMi=otomatikMi;
    }
    public String toString(){
        return "Car{"+
                "marka='"+marka+"'"+
                ", model='"+model+"'"+
                ", renk='"+renk+"'"+
                ", hız='"+hız+"'"+
                ", otomatikMİ='"+otomatikMi+"'}";

    }
    public static Car renkSec(Car car,String renk){
        car.renk=renk;
        return car;
    }



}
