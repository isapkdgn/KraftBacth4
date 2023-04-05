package day_28_QuizAnswers;

public class C07_CodingAnswers4 {
   // Girilen sayının faktoriyelini döndüren bir metot yazınız.
   public static void main(String[] args) {
       System.out.println(faktorial(4));
   }

   public static int faktorial(int n){

      int faktorial=1;
       for (int i = 1; i <=n ; i++) {
           faktorial*=i;
       }
       return faktorial;
   }
}
