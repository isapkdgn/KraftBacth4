package day23_StringClass;

public class C01_StringIntro {
    public static void main(String[] args) {
        String str1="hello";        //literal way -->heap memory-->String pool
        String str2="hello";        //str2 -->String pooldaki "hello" isaret eder

        String str3="Hello";        //literal way -->heap memory-->String pool
        String str4=new String("hello");    //String object -->Heap Memory
        boolean bl;
       // System.out.println(bl);   // local degisken initize edilmedi icin hata verir
        bl=str1==str2;                   //true
        System.out.println("bl :"+bl);
        System.out.println("---------------------");
        bl= str1.equals(str2);
        System.out.println("bl :"+bl);
        System.out.println("---------------------");
        bl= str1.equals(str3);
        System.out.println("bl :"+bl);
        System.out.println("---------------------");
        bl=str1==str3;
        System.out.println("bl :"+bl);
        System.out.println("---------------------");
        bl= str1.equals(str4);
        System.out.println("bl :"+bl);
        System.out.println("---------------------");
        bl=str1==str4;
        System.out.println("bl :"+bl);      // false since different objects
        bl= str1.equals(str4);
        System.out.println("bl :"+bl);

    }
}
