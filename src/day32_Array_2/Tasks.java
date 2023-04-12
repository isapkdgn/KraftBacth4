package day32_Array_2;

import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {

        int[] array={15,25,35,45};
        int[] array1={15,15,20,25};
        System.out.println(lengthKontrol(array));
        System.out.println(rakamKontrol(array1, 15));
        System.out.println(ilkElemanEsitmi(array, array1));
        System.out.println("--------------------------");
        System.out.println(Arrays.toString(yeniArray(array, array1)));
        System.out.println("----------------------------");
        System.out.println(Arrays.toString(new int[]{toplam(array1)}));
        System.out.println(toplam(array1));
        System.out.println("----------------------");
        System.out.println(Arrays.toString(toplamVeCarpım(array)));


    }
    public static boolean lengthKontrol(int[] arr){
        return arr.length>5;
    }
    public static boolean rakamKontrol(int[] arr, int num){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                return true;
            }
        }
        return false;
    }
    public static boolean ilkElemanEsitmi(int[] x,int[] y){
        if (x[0]==y[0]){
            return true;
        }

        return false;
    }
    public static int[] yeniArray(int[] x,int[] y) {
        int[] yeniArr=new  int[2];
        yeniArr[0]=x[0];
        yeniArr[1]=y[0];
        return yeniArr;
    }
    public static int toplam(int[] array){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum;
    }
    public static int[] toplamVeCarpım(int[] arr){
        int toplam=0;
        int carpım=1;
        int[] result=new int[2];

        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];
            carpım*=arr[i];
        }
        result[0]=toplam;
        result[1]=carpım;

        return result;

    }













}
