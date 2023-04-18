package day_37_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Day37Summary {
    public static void main(String[] args) {
     /*Boolean b=   Character.isDigit(Integer.toString(100).split("")[0].charAt(0));
                //                                    "100"    [1,0,0]     "1"       '1'
        System.out.println(b);

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
        Integer inW=new Integer(10);
        int inP=5;
        inP=inW;
        inW=inP;

        String s="5";
        Integer k=Integer.valueOf(s); // return Integer
        int x=Integer.parseInt(s);     // return int

        int[] arr=new int[10];
        arr[0]=5; // 5,0,0,0,0,0,0,0,0,0

      */

      // sifreleme validasyon isim / soy isim *21414/=
        Scanner scanner=new Scanner(System.in);
        System.out.println("isim ve soy isim");
        String nameSurname= scanner.nextLine();

       if (nameControl(nameSurname)){
           System.out.println("password enter");
       }else {
           System.out.println("hatalı isim ve soy isim tekrar deneyin");
       }

        System.out.println("---------------------------------");

        String str1="asa00a1sdd12sa01,54,vdenff,gh312tfdg,///";
        System.out.println(Arrays.toString(textNumbers(str1)));

    }
    public static boolean nameControl(String str){
        //" har/un b"
        // 012345678
        // Kriterler sayı olamaz,boşluk haricinde karakter olamaz sembol olamaz
        for (int i = 0; i <str.length() ; i++) {
            if (Character.isDigit(str.charAt(i)) || !Character.isLetter(str.charAt(i))) {
                if(str.charAt(i)!=' '|| str.charAt(i)!='-'){
                    return false;
                }
            }
        }
        return true;
    }




    // task2 -- string içindeki sayıları bir aray içinde döndüren bir method yazın

    public static int[] textNumbers(String str){
        //asa00a1sdd12sa01,54,vdenff,gh312tfdg,///

        String result="";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                result+=str.charAt(i);
            }
        }
        String[] arr=result.split("");
        int[] arrNew=new int[arr.length];
        for (int i = 0; i < arrNew.length; i++) {
            arrNew[i]=Integer.parseInt(arr[i]);
        }

        return arrNew;

    }

}
