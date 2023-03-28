package day22_ClassAndobject_Memory;

public class CarOfCar {
    public static void main(String[] args) {
       CarNew car1=new CarNew();
       car1.marka="Honda";
       car1.model="City";
       car1.beygir=136;

       CarNew car2=new CarNew();
       car2.marka="Mercedes";
       car2.model="e200d";
       car2.beygir=185;

       if (car1.beygir> car2.beygir){
           System.out.println("car1.marka = " + car1.marka+" "+car1.model);
       }else {
           System.out.println("car2.marka = " + car2.marka+" "+car2.model);
       }




    }
}
