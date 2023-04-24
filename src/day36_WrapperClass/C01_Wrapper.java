package day36_WrapperClass;

public class C01_Wrapper {
    public static void main(String[] args) {
        int x=5;
       Integer y=new Integer(10);
        System.out.println(y==x);

        Float f=new Float((float) 4.5);
        Float f1=new Float("4.5");
        System.out.println(f1);
        Short s=new Short((short) 100);
        Short s1=new Short("100");
        System.out.println(s1+20);


        Integer sayiW=new Integer(10);
        int sayiP=20;

        sayiP=sayiW;
        sayiW=sayiP;






    }
}
