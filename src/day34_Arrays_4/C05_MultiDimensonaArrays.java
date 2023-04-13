package day34_Arrays_4;

import java.util.Arrays;

public class C05_MultiDimensonaArrays {
    public static void main(String[] args) {

        String [] group1={"arikan","ayse","daghan"};
        String [] group2={"emine","hasan","hatice"};
        String [] group3={"isa","nuran","omer"};

        String[][] groups=new String[3][]; //index:0,1,2
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;

        System.out.println(groups[1][1].length());
        System.out.println(groups[1][1]);

        System.out.println(Arrays.toString(groups)); // toString() is for one dimensional arrays only
        System.out.println(Arrays.deepToString(groups));
        System.out.println("------------------------------------------------------");
        //              0 1 2   0 1 2 3   0 1  2  3  4
        int[][] arr2D={{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        //                0       1           2
        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(arr2D[2][1]);

        System.out.println(Arrays.toString(arr2D[0]));

        System.out.println("------------------------------------------------------");

        int[][] nums=new int[5][4];
        nums[0][0]=10;
        nums[0][1]=20;
        nums[0][2]=30;
        nums[0][3]=40;

        nums[1][0]=90;
        nums[1][1]=80;
        nums[1][2]=70;
        nums[1][3]=60;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------");

        int[][] num2= new int[3][];
        num2[0]=new int[2];
        num2[1]=new int[3];
        num2[2]=new int[4];

        num2[0][0]=10;
        num2[0][1]=20;
       // num2[0][2]=10;  runtime error
        // num2[0][3]=10; runtime error
        num2[1][0]=30;
        num2[1][1]=40;
        num2[1][2]=50;

        num2[2][0]=60;
        num2[2][1]=70;
        num2[2][2]=80;
        num2[2][3]=90;

        System.out.println(Arrays.deepToString(num2));

        for (int i = 0; i < num2.length; i++) {
            for (int j = 0; j < num2[i].length; j++) {
                System.out.print(num2[i][j]+" ");
            }
            System.out.println();
        }


    }
}
