package day32_Array_2;

import java.util.Arrays;

public class C03_ArraysToString {
    public static void main(String[] args) {
        String arr[] = new String[4];
        arr[0] = "Ogretmen";
        arr[1] = "Mehmet";
        arr[2] = "Celal";
        arr[3] = "Emine";

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println(Arrays.toString(arr).substring(0,1));
        System.out.println(toString(arr));
        System.out.println(toString1(arr));

    }

    public static String toString(String[] array){

        String result="[";
        for (String str:array){
            result+=str+", ";
        }

       result+="]";
        return result;
    }
    public static String toString1(String[] array){
        String result="[";
        for (int i = 0; i < array.length; i++) {
            if (i== array.length-1){
                result+=array[i]+"]";
            }else {
                result+=array[i]+", ";

            }
        }

        return result;

    }

}