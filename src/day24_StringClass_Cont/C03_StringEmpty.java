package day24_StringClass_Cont;

public class C03_StringEmpty {
    public static void main(String[] args) {
        //isEmpty() Stringin bos olup olmadığını kontrol ediyor

        String s1="Merhaba";
        System.out.println(s1.isEmpty());
        System.out.println(s1.isBlank());
        String s2="";
        System.out.println(s2.isEmpty());
        String s3=" ";
        System.out.println(s3.isEmpty());
        System.out.println(s3.isBlank());
    }
}
