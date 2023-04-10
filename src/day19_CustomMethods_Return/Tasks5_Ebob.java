package day19_CustomMethods_Return;

public class Tasks5_Ebob {
    public static void main(String[] args) {
        System.out.println(ebob(18, 24));

        System.out.println(ekok(18,24,6));
    }

    public static int ebob(int x, int y){
        int ebob=1;
        for (int i = 1; i <=x && i<=y; i++) {
            if (x%i==0&&y%i==0){
                ebob=i;
            }
        }
        return ebob;
    }

    public static int ekok(int x,int y,int ebob){
       int ekok=(x*y)/ebob;
       return ekok;
    }










}
