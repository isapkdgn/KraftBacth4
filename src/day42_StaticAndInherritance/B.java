package day42_StaticAndInherritance;

public class B {


    public static int s=3;
    public  int z=3;
    public int n;

    static {
        System.out.println("static calıştı");
    }
    {
        System.out.println("block calıştı");
    }



    public B(){
        System.out.println("boş cons calıştı");
    }
    public B(int n){
        this();
        this.n=n;
        System.out.println("dolu cons calıştı");
    }










}
