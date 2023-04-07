package day28_QuizAnswers;

public class C10_Codinganswers7 {



    public static void main(String[] args) {
        //.equalsIgnorecase() metodunu kullanmadan girilen 2 string türündeki değeri
        //büyükküçük harfleri baz almadan kontrol eden bir metot yazınız.



                System.out.println("equalsIgnorCase(\"Ahmet\",\"AHmet\") = " + equalsIgnorCase("Ahmet", "AHmet"));
    }
    public static boolean equalsIgnorCase(String str1, String str2){
     return    str1.toLowerCase().equals(str2.toLowerCase());

    }
}
