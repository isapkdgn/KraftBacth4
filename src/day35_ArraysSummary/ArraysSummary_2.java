package day35_ArraysSummary;

import java.util.Arrays;

public class ArraysSummary_2 {
    public static void main(String[] args) {
       /* String str = "Marahaba";
        String[] strArray = str.split("a");
        System.out.println(Arrays.toString(strArray));

        for (String s : strArray) {
            System.out.println(s);
        }
        System.out.println(strArray.length);

        */

      /*  String[] strArray={"harun","Ayse","mehmet"};
        String[] yeniArray=Arrays.copyOfRange(strArray,0,strArray.length);
        String[] yeniArray1={strArray[0],strArray[1],strArray[2]};
        System.out.println(Arrays.toString(yeniArray));

       */


       /* String[] yeniArray=new  String[strArray.length];
        for (int i = 0; i < yeniArray.length; i++) {
            yeniArray[i]=strArray[i];
        }

        */

        int[] arr={9,6,3,1,0,2,4,7,8,5};
       // Arrays.sort(arr);
       // System.out.println(Arrays.toString(arr));
       // System.out.println(maxArray(arr));
       // System.out.println(Arrays.toString(arr));
        //Arrays.fill(arr,);
       // System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(doldur(arr, 0, 3, 100)));
      //  doldur(arr,0,3,100);


    }

    public static int maxArray(int[] array){
        int[] yeniArray=Arrays.copyOfRange(array,0,array.length);
        Arrays.sort(yeniArray);
        return yeniArray.length-1;

    }
    public static int[] doldur(int[] arr, int from,int to,int value){
       // int[] result=Arrays.copyOfRange(0,3,100);
        Arrays.fill(arr,from,to,value);
        return doldur(arr,0,3,100);

    }
}
