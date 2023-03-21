package day13_ForLoops;

import java.util.Scanner;

public class Tasks4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter A number Between to(0-1000)");
        int num= scan.nextInt();
        int dsum=0, ssum=0;
        for (int i=1;i<=num;i++){
            if (i%2==0){
                dsum+=i;
            }else{
                ssum+=i;
            }

        }System.out.println("double sum :"+dsum);
         System.out.println("singel sum :"+ssum);

    }
}
