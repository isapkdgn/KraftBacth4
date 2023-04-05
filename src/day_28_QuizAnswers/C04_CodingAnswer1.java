package day_28_QuizAnswers;

public class C04_CodingAnswer1 {
    public static void main(String[] args) {
        System.out.println(sumUptoN(3));
    }
    public static int sumUptoN(int N){
        int result=0;
        for (int i = 1; i <=N; i++) {
            result+=i;
        }
        return result;
    }
}
