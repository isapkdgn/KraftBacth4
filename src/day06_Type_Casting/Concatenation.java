package day06_Type_Casting;

public class Concatenation {
    public static void main(String[] args){

        String a="Merhaba";
        String b="dünya";
        String c=a+b;
        int i=10;
        // (parantez içine sring bir ifade gelirse stringden sonra devam eder)
        System.out.println(c);
        System.out.println(a+2+5);
        System.out.println(2+5+c);
        System.out.println(8+3+c+2+5);
        System.out.println(8+3+a+(2+5+7));
        System.out.println(8+3+a+(2+5)+7);
        System.out.println(i+3+8+a+(2+5)+7+" Dünya");
    }
}
