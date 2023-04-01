package day24_StringClass_Cont;

public class Tasks8_KısaKelimeEkleme {

    public static void main(String[] args) {

        System.out.println(kısaKelimeEkleme("pekdoğan", "doğan"));
    }

    public static String kısaKelimeEkleme(String str1,String str2){

        if (str1.length()<str2.length()){

           return str1.concat(str2.concat(str1));
        }else{

            return str2.concat(str1.concat(str2));
        }

    }
}
