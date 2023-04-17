package day35_ArraysSummary;

public class TwoDimensionalsArray {
    public static void main(String[] args) {
        String [][] str=new String[3][2];
        str[0][0]="harun";
        str[0][1]="celal";
        str[1][0]="ahmet";
        str[1][1]="ziya";
        str[2][0]="anıl";
        str[2][1]="mehmet";

        System.out.println(str.length);

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                System.out.print(str[i][j]+" ");
            }
            System.out.println();
        }

        int[] array1={5,4,3,2,1};
        int[] array2={1,2,3,4,5,7,9};

        System.out.println(ikinciArraydeVarmi(array1, array2));

    }
    public static boolean ikinciArraydeVarmi(int[] arr1,int[] arr2){

     firstLoop:   for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]==arr2[j]){
                    continue firstLoop;
                }
            }
         return false;
        }
       return true;
    }




}
