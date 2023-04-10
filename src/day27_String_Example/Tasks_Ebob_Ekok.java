package day27_String_Example;

public class Tasks_Ebob_Ekok {
    public static void main(String[] args) {
        System.out.println("ebob(18,24) = " + ebob(18, 24));
        System.out.println("ekok(18,24,6) = " + ekok(18, 24, 6));
    }

    public static int ebob(int num1,int num2){
        int ebob=1;
        for (int i = 1; i <=num1&&i<=num2 ; i++) {
            if (num1%i==0&&num2%i==0){
                ebob=i;
            }
        }
        return ebob;

    }
    public static int ekok(int num1,int num2,int ebob){
     int ekok=(num1*num2)/ebob;
     return ekok;
    }
}
