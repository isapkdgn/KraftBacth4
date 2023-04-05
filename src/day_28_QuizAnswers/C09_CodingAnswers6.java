package day_28_QuizAnswers;

public class C09_CodingAnswers6 {
    public static void main(String[] args) {
        System.out.println("isPalindrome(\"racecar\") = " + isPalindrome("racecar"));
    }
   // kelimenin polindrom olup olmadığı kontrol eden bir methot yazınız
    public static boolean isPalindrome(String str){
        String reverse="";
        for (int i=str.length()-1;0<=i;i--){
            reverse+=str.charAt(i);
        }
         return str.equals(reverse)? true:false;

        }
    }


