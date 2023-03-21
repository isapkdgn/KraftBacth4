package day12_SwitchCase;

import java.util.Scanner;

public class C04_Nested_IF {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yasınız");
        int yas= scan.nextInt();

       if(yas>=18) {
           System.out.println("yanıızda bayan var mı evet/hayır");
           String yanıt = scan.next();
           if (yanıt.equals("evet")){
               System.out.println("yüzme biliyormusunuz evet/hayır");
               String yanıt2= scan.next();
               if (yanıt2.equals("evet")){
                   System.out.println("hos geldiniz ");
               }else{
                   System.out.println("yüzme bilmeyenler giremez");
               }
           }else{
               System.out.println("yanızda bayan olmadığı için giremezsiniz");
           }


           } else {
               System.out.println("giremezsiniz");
           }


       }

       }


