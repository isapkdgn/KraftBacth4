package day33_Arrays_3;

import java.util.Arrays;
import java.util.Scanner;

public class C02_Tasks {
  //  İnt arry in en büyük elemanının döndüren bir method yazın
  public static void main(String[] args) {

      int [] intArr={1,20,3,40,50,6};
      System.out.println(maxOfArray(intArr));
      System.out.println(minOfArray(intArr));
      System.out.println(Arrays.toString(swapFirstAndlast(intArr)));
      System.out.println("---------------------");
      int [] intArr2={1,2,3,4,5,6};
      System.out.println(Arrays.toString(reverceArray(intArr2)));
      System.out.println(Arrays.toString(reverceArray2(intArr2)));
      System.out.println("---------------------");
      System.out.println(sumOfArraysElements(intArr2));

      System.out.println(Arrays.toString(createStringArray()));
  }
  public static int maxOfArray(int[] arr){
      int max=arr[0];
      for (int i = 0; i < arr.length; i++) {
          if (max<arr[i]){
              max=arr[i];
          }
      }
      return max;
  }
    //  İnt arry in en küçük elemanının döndüren bir method yazın

    public static int minOfArray(int[] arr){
        int min=arr[0];
     for (int i:arr){
         if (min>i){
             min=i;
         }
     }
        return min;
    }


   // Bir array oluşturun ve ilk ve son element leri swap(yer değiştirme) yapın.
    public static int[] swapFirstAndlast(int[] arr){

      int temp=arr[0];
      arr[0]=arr[arr.length-1];
      arr[arr.length-1]=temp;


      return arr;
    }
//    Bir method yazın ve verilen arry in elemanlarını tersden sıralayıp yeni bir array döndürsün.


    public static int[] reverceArray(int[] arr){
      int[] revercedArr=new int[arr.length];
        for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {
            revercedArr[j]=arr[i];
        }

       return revercedArr;
    }
    public static int[] reverceArray2(int[] arr){
        int[] revercedArr=new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            revercedArr[arr.length-1-i]=arr[i];
        }

        return revercedArr;
    }
        //Bir methodla verilen array ın teksayı indexinde bulunan elemanların toplamını alın.
    public static int sumOfArraysElements(int[] arr){
      int sum=0;
        for (int i = 0; i < arr.length; i+=2) {
          sum+=arr[i];
        }
      return sum;
    }

    public static String[] createStringArray(){
        Scanner scan=new Scanner(System.in);
        System.out.println("String Arrayin uzunluğunu giriniz");
        int length= scan.nextInt();
        scan.nextLine();
        String[] strAry=new String[length];

        for (int i = 0; i < strAry.length; i++) {
            System.out.println("String Arrayın "+(i+1)+" . elamanini giriniz");
            strAry[i]= scan.nextLine();
        }
        return strAry;
    }
}
