package day24_StringClass_Cont;

public class C05_SubString {
    public static void main(String[] args) {

        String str="Java Programming Language";
        //          0123456789012345678901234

        // substring metodu iki sekilde kullanılabilir
        // tek parametreli o indeksten baslar sonuna kadar kısmı alır

        System.out.println(str.substring(5));
        System.out.println(str.substring(0));
        System.out.println(str.substring(17));
        System.out.println(str.substring(str.length()));// emptyIndex Hiclik ""
        System.out.println(str.substring(str.length()-3));
        System.out.println(str.substring(str.length()-8));

        // substring(begining index, ending index) ending index dahil değil
        System.out.println(str.substring(2, 4));    //va
        System.out.println(str.substring(5, 16));
        System.out.println(str.substring(0, 1));    //J
        System.out.println(str.substring(str.length() - 1, str.length()));
        System.out.println(str.substring(5, 5));        // hiçlik
        System.out.println(str.substring(4, 5));        //" "
        //System.out.println(str.substring(5, 3)); // Run time error string index out of exception


    }
}
