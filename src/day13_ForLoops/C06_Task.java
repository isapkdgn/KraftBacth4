package day13_ForLoops;

public class C06_Task {
    public static void main(String[] args) {
        //bir program yazın ve 0-100 arasındaki tüm sayıları yazdırın
        for (int i=0 ;  i<=100; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("-----------------------------------------");
        //bir program yazın 15-100 arsındaki tüm sayıları yan yana yazsın
        for (int i=15; i<=100;i++ ){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("--------------------------------------");
        //bir program yazın ve 0-100 arasındaki tüm sayıları  tersten yazdırın
        for(int i=100; i>=0;i--){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("--------------------------------------");
        //bir program yazın ve 0-100 arasındaki tüm çift sayıları yazdırın
        for(int i=0; i<=100;i++){
            if (i%2==0) {
            System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("--------------------------------------");
        //bir program yazın ve 0-100 arasındaki tüm tek sayıları yazdırın
        for( int i=0;i<=100;i++){
            if(i%2==1){
                System.out.print(i+" ");
            }

        }
        System.out.println();
        System.out.println("--------------------------------------");
        //bir program yazın ve 0-100 arasındaki tüm sayıların toplamını yazdırın
        int sum=0;
        for(int i=1 ;i<=100;i++){
            sum+=i;
        }
        System.out.println("sum = "+sum);

        System.out.println();
        System.out.println("--------------------------------------");

        // bir program yazın ve 1-20 ye kadar olan sayıların kuplerini alın çarpın
        for (int i=1;i<=20;i++){
            System.out.println(i+" "+i*i*i);
        }
        System.out.println();
        System.out.println("--------------------------------------");
        // 23 derece ile 50 derce arasındaki olan tüm fahrenhit değerlerini ekrana yazdırın
        // C=(f-32)/1,8  f=1,8*C+32        23*1,8+32
        for (int i=23; i<=50;i++){
            System.out.println(i+" C ="+(i*1.8+32)+" F ");
        }
        System.out.println();
        System.out.println("--------------------------------------");
        for (char ch='a';ch<='z';ch++){
            System.out.print(ch+" ");
        }
        System.out.println();
        System.out.println("--------------------------------------");
        for (char ch='A';ch<='Z';ch++){
            System.out.print(ch+" ");
        }

        System.out.println();
        System.out.println("--------------------------------------");
        for (int i=1;i<=10;i++){
            System.out.println("9 X "+i+" ="+9*i);
        }
    }
}
