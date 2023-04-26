package day39_ConstructorOverloading;

public class C07_KraftBank {
    public static void main(String[] args) {

        KraftBank kraftBank1= new KraftBank("CJ0001","Mehmet Akif YILMAZ",true);
        System.out.println(kraftBank1);
        System.out.println(".....................................................................");

        KraftBank kraftBank2=new KraftBank("CJ0001","Mehmet Akif YILMAZ",true, 50000,"f067jgj-7o54-4f3f-7c44bjk");
        System.out.println(kraftBank2);
        System.out.println("kraftBank2.customerToken = " + kraftBank2.customerToken);
        kraftBank2.createToken(kraftBank2);
        System.out.println("kraftBank2.customerToken = " + kraftBank2.customerToken);
        System.out.println(kraftBank2);
        System.out.println("...................................................................................");

        System.out.println("kraftBank2.customerAccount = " + kraftBank2.customerAccount);
        kraftBank2.addMoney(kraftBank2,30000);
        System.out.println("kraftBank2.customerAccount = " + kraftBank2.customerAccount);
        System.out.println(kraftBank2);

    }
}
