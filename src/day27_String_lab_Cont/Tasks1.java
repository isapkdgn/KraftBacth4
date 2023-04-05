package day27_String_lab_Cont;

public class Tasks1 {
    public static void main(String[] args) {
        System.out.println(soru1(3));
    }
    public static int soru1(int x){
        int sum=0;
        for (int i = 1; i <=x ; i++) {
            sum+=i;
        }
        return sum;

    }
}
