package day27_String_Example;

public class Tasks1_Contain {
    public static void main(String[] args) {
        System.out.println(contain("ali okula gec kaldı", "isa"));
    }
    public static boolean contain(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        boolean bl=false;
       int x=str1.length();
       str1=str1.replace(str2,"");
       int y=str1.length();
       if (x>y){
           bl=true;
       }


        return bl;
    }


}
