package day12_SwitchCase;

import java.util.Scanner;

public class Tasks99 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("yasınız");
        int yas= scan.nextInt();

        if(yas>18){
            System.out.println("bayan var mı evet/hayır");
            String yanıt= scan.next();
            if (yanıt.equals("evet")){
                System.out.println("yüzme bil. evet/hayır");
                String yanıt1= scan.next();
                if (yanıt1.equals("evet")){
                    System.out.println("bone var mı evet/hayır");
                    String yanıt2= scan.next();
                    if (yanıt2.equals("evet")){
                        System.out.println("hos geldin");
                    }else{
                        System.out.println("alda gel");
                    }
                }else{
                    System.out.println("öğrende gel");
                }
            }else{
                System.out.println("giremezsin");
            }


        }else{
            System.out.println("giremezsiniz");
        }
    }
}
