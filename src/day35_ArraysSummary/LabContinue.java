package day35_ArraysSummary;

import java.util.Arrays;

public class LabContinue {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(createArray(15, 8)));

    }

    public static int[] createArray(int x,int y){
        int min=Math.min(x,y);
        int max=Math.max(x,y);
        int[] resultArray=new int[max-min+1];

        for (int i = min,j=0; i <=max ; i++,j++) {
            resultArray[j]=i;

        }
        return resultArray;
    }
}
