package day32_Array_2;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays_Methods {
    public static void main(String[] args) {
        //System.out.println("kleimeADepola()[2] = " + kleimeADepola()[2]);
        int array[]={25,26,5};
        int array2[]={35,26,5};
        //System.out.println(ilkelemanEsitmi(array, array2));
       // System.out.println(Arrays.toString(yeniArray(array, array2)));
      //  System.out.println(arrayToplam(array2));
       // System.out.println(Arrays.toString(toplamVeCarpim(array2)));
        //arrayYazdir(toplamVeCarpim(array2));
        arrayYazdir(arrayBirlestir(array,array2));
        System.out.println();
        arrayYazdir(arrayBirlestir2(array,array2));
        System.out.println();
        System.out.println(Arrays.toString(arrayBirlestir2(array, array2)));


        //  System.out.println("uzunlukKontrol(array) = " + uzunlukKontrol(array));
        /*if (uzunlukKontrol(array)){
            System.out.println("uzunluk 5 den büyük");
        }else{
            System.out.println("uzunluk 5 den kücük");
        }

         */

       // System.out.println("sayiKontrol(array,5) = " + sayiKontrol(array, 5));
      //  System.out.println("sayiKontrol1(array,98) = " + sayiKontrol1(array, 98));


    }

    public static void arrayYazdir(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + "-");
            }
        }
    }
    public static void arrayYazdir(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + "-");
            }
        }
    }
    public static void arrayYazdir(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + "-");
            }
        }
    }


    public static String[] kleimeADepola(){
        String array[]=new String[3];
        Scanner scan=new Scanner(System.in);
        System.out.println("1, kelime: ");
        String kelime1= scan.nextLine();
        array[0]=kelime1;
        System.out.println("2, kelime: ");
        String kelime2= scan.nextLine();
        array[1]=kelime2;
        System.out.println("3, kelime: ");
        String kelime3= scan.nextLine();
        array[2]=kelime3;

        return array;

    }
    //Bir method yazın ve int[] kabul etsin. length i 5 den büyükse true döndürsün
    public static boolean uzunlukKontrol(int arr[]){
      return arr.length>5;

    }
    //Bir method yazın int array kabul etsin array in içinde 5 olup olmadığını kontrol etsin.

    public static boolean sayiKontrol(int[] array,int sayi){

        for (int i = 0; i < array.length; i++) {
            if (array[i]==sayi){
                return true;
            }
        }
        return false;
    }
    public static boolean sayiKontrol1(int[] array,int sayi){

      for (int x:array){
      if (x==sayi){
          return true;
         }
      }
      return false;
    }
  //  Bir method yazın ve 2 array kabul etsin ilk elemanları eşitse true döndürsün.

    public static boolean ilkelemanEsitmi(int[] arr1,int[] arr2){
        return arr1[0]==arr2[0];
    }

    public static boolean ilkelemanEsitmi(String[] arr1,String[] arr2){
        return arr1[0].equalsIgnoreCase(arr2[0]);
    }

   // 2 array kabul eden bir method yazın ve arraylerin llk elemanları ile yeni bir array döndürsün.

    public static double[] yeniArray(double[] x,double[] y){

        double[] array=new double[2];
        array[0]=x[0];
        array[1]=y[0];

        return  array;

    }
    public static double[] yeniArray(int[] x,int[] y){

        double[] array={x[0],y[0]};

        return  array;

    }
   //Int array in elemanlarının toplamını veren bir method yazın

    public static int arrayToplam(int[] arr){
      int result=0;
      for (int sayi:arr){
          result+=sayi;
      }
        return result;
    }


   // İnt array ın elemanlarının toplamını ve çarpımını yeni bir array içinde döndüren bir method yazın.

    public static int[] toplamVeCarpim(int[] arr){
      int toplam=0;
      int carpım=1;
      int yeniArray[]=new int[2];
        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];
            carpım*=arr[i];
        }
        yeniArray[0]=toplam;
        yeniArray[1]=carpım;
      return yeniArray;
    }

  //  Verilen 2 arrayi birleştirip array döndüren bir method yazın
    public static int[] arrayBirlestir(int[] arr1, int[] arr2){
        
      int[] yeniArray=new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
           yeniArray[i]=arr1[i];
        }

        int j=0;
        for (int i = arr1.length; i <yeniArray.length ; i++) {
            yeniArray[i]=arr2[j];
            j++;
        }
        return yeniArray;
    }
    public static int[] arrayBirlestir2(int[] arr1, int[] arr2){

        int[] yeniArray=new int[arr1.length+arr2.length];
        for (int i = 0,j=0; i < yeniArray.length; i++) {
            if (i<arr1.length) {
                yeniArray[i] = arr1[i];
            }else {
                yeniArray[i]=arr2[j];
                j++;
            }
        }
        return yeniArray;
    }


}
