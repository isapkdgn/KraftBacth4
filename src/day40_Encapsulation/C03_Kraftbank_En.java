package day40_Encapsulation;

public class C03_Kraftbank_En {

    public static void main(String[] args) {
        //1. ve 2. soru
        KraftBank_E kraftBank1=new KraftBank_E("CJ0001","Mehmet Akif YILMAZ",true);
        System.out.println(kraftBank1.toString());
        kraftBank1.setIsSms(false);
        System.out.println(kraftBank1.toString());
        System.out.println(kraftBank1.getCustomerId());
        System.out.println("...........................................................");

        //3.soru
        KraftBank_E kraftBank2=new KraftBank_E("CJ0001","Mehmet Akif YILMAZ",true, 50000,"f067jgj-7o54-4f3f-7c44bjk");
        kraftBank2.createToken(kraftBank2);
        System.out.println(kraftBank2.toString());
        System.out.println("...........................................................");

        //4.soru
        System.out.println("(kraftBank2.getCustomerAccount())İLK = " + (kraftBank2.getCustomerAccount()));
        kraftBank2.addMoney(kraftBank2,30000);
        System.out.println("(kraftBank2.getCustomerAccount())SON = " + (kraftBank2.getCustomerAccount()));
        System.out.println("...........................................................");

        //5.soru
        System.out.println(kraftBank2.toString());
        kraftBank2.setIsSms(true);
        System.out.println(kraftBank2.getIsSms());
        System.out.println(kraftBank2.getCustomerId());
        System.out.println(kraftBank2.getCustomerFullName());
        System.out.println(kraftBank2.getCustomerAccount());
        System.out.println(kraftBank2.getCustomerToken());

        //6.soru
        kraftBank2.setCustomerFullName("Ayşe");
        System.out.println(kraftBank2.getCustomerFullName());

    }
}
