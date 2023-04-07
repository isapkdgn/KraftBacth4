package day27_String_lab_Cont;

import java.util.Scanner;

public class Tasks5_BirveDörtHarfKelime {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Scanner scan = new Scanner(System.in);

            System.out.println("1. kelime");
            String kelime1 = scan.nextLine();
            System.out.println("2.kelime");
            String kelime2 = scan.nextLine();

            if (birVeDörtHarf(kelime1,kelime2)){
                break;
            }else {

                if(i==2){

                    return;
                }
                System.out.println("hatalı işlem tekrar deneyin");
            }


        }

    }

    public static boolean birVeDörtHarf(String str1,String str2){

        if (str1.isEmpty()||str2.isEmpty()){
            System.out.println("kelimeler bos olamaz");
            return  false;
        } else if (str1.length()>4||str2.length()>4) {
            System.out.println("kelimeler 1 ile 4  harf olacak");
            return false;
        } else if (str1.length()<4||str2.length()<4)
            System.out.print(str1+" "+str2);

        return true;

    }

}
