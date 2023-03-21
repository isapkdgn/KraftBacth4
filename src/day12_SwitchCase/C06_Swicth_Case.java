package day12_SwitchCase;

public class C06_Swicth_Case {
    public static void main(String[] args) {
        //byte,short,int,String,char tipindeki değerleri karsilastırmak için kullanılır
        System.out.println("giris");
        int sayi=3;
        switch (sayi){
            case 1:
                System.out.println("sayı 1 esit");
                break;
            case 2:
                System.out.println("sayı 2ye esit");
                break;
            case 3:
                System.out.println("sayı 3 e esit");
                break;
            default:
                System.out.println("sayı eslesmedi");
        }
    }
}
