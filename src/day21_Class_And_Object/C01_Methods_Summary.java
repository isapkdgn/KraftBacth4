package day21_Class_And_Object;

public class C01_Methods_Summary {
    public static void main(String[] args) {
        int a=seven();
        System.out.println(a);
        System.out.println("--------------------------");
        System.out.println("seven2() = " + seven2());
        System.out.println("-------------------------");

        System.out.println(max(5,10));
        System.out.println("-------------------------");
        //System.out.println(max2(5,15));
       int x= max2(5,10)*10;
        System.out.println(x);

    }
    //f()=7
    public static int seven(){
        return 7;

    }
    public static int seven2(){
        int i=0;
        while (true){
            i++;
            if (i==5){
                continue;
            } else if (i==7) {
                return i;
            }
            System.out.println(i);
        }


    }
    public static int max(int x,int y){
        int max;
        if (x>y){
            max=x;
        }else {
            max=y;
        }
        return max;
    }
    public static int max2(int x,int y){

        if (x>y) {
            return x;
        }  else {
            return y;
        }
    }


}
