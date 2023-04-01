package day24_StringClass_Cont;

import java.util.Scanner;

public class Tasks5_Sev {
    public static void main(String[] args) {
        System.out.println(sev("bayramları cok seiyorum ", "sev"));

    }
    public static boolean sev(String str,String str1){
        boolean bl;
        if (str.contains(str1)){
            System.out.println("what a lovely person");
            return true;
        }else  {
            System.out.println("what is not lovely person");

            return false;
        }


    }
}
