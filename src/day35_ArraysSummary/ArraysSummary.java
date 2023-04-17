package day35_ArraysSummary;

import java.util.Arrays;

public class ArraysSummary {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 30;
        array[4] = 30;

        System.out.println(Arrays.toString(array));
        String str=Arrays.toString(array);

        String[] yeniArray=str.replace("[","").replace("]","")
                .replace(",","").split(" ");
        System.out.println(Arrays.toString(yeniArray));
        String[] yeniArray1=str.substring(1,str.length()-2).replace(",","").split(" ");

        for (int i = 0; i < array.length; i++) {
            //System.out.println(array[i]);
        }

        for (int sayi:array){
            if (sayi==2){
                continue;
            }
        }

    }

    public static String arrayYazdır(int[] arr){
        String result="";
        for (int sayi:arr){
            System.out.println(sayi+" ");
        }
        return result;
    }
    public static String[] tersdenYazdır(String str){

        //  merhaba      //merhaba.split("")    // String[] yeniArray={"m","e","r","h","a","b","a"}
                                                            //          0   1    2  3   4   5   6

       String [] yeniArray=str.trim().split(" ");
       String [] resultArray=new String[yeniArray.length];

        for (int i =0,j= yeniArray.length-1;i< yeniArray.length;  i++,j--) {
            resultArray[i]=yeniArray[j];
        }
       return resultArray;
    }

}
