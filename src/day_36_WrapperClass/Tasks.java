package day_36_WrapperClass;

import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {
        String str3=" merhaba ben isa 39 yasındayım ve 123456 teleofon numaram";
        System.out.println(Arrays.toString(stringİcindeSayilar(str3)));

    }
    // task2 -- string içindeki sayıları bir aray içinde döndüren bir method yazın
    public static int[] stringİcindeSayilar(String str){



        String digit="";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                digit+=str.charAt(i);
            }
        }
        String [] arr=digit.split("");
        int[] arrNew=new int[arr.length];
        for (int i = 0; i < arrNew.length; i++) {
            arrNew[i]=Integer.parseInt(arr[i]);
        }




    return arrNew;
    }
}
