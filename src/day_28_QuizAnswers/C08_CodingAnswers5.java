package day_28_QuizAnswers;

public class C08_CodingAnswers5 {
    public static void main(String[] args) {
        System.out.println(concat("Quiz", "kolaydı"));
        System.out.println(concat("Quiz", "cok", "kolaydı"));
    }
    public static String concat(String str1,String str2){
        return str1.concat(str2);
    }
    public static String concat(String str1,String str2,String str3){
        return str1.concat(str2).concat(str3);
    }
}
