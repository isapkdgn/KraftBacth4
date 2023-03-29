package day22_ClassAndobject_Memory;

public class JavaMemory {

    public static void main(String[] args) {
       // System.out.println(variable(5, 6));
        CarNew car1=new CarNew();
        car1.marka="sahin";
        car1.model="civic";
        car1.beygir=136;
        System.out.println(car1);

        CarNew car2=new CarNew();
        car2.marka="honda";
       // car1=car2;
        System.out.println(car1.marka);
        System.out.println(car1==car2);
        System.out.println(car1);
        System.out.println(car2);

      //  == operatörü referansları karşılaştırır
     //    equals() dataları karşılastırır

        String str=new String();
        str="harun";
        String str2=new String();
        str2="harun";
        System.out.println(str==str2);


    }

    public static int variable(int x,int y){
        int z=x+y;
        return z;

    }

}
