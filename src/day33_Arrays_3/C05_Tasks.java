package day33_Arrays_3;

import java.util.Arrays;

public class C05_Tasks {
    public static void main(String[] args) {
       // elma, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
       // element olacak şekilde bir array a atın. İlk ve son idexi swaping yapın.

       String str="elma, armut, üzüm, çilek, nar";
       String[] str1=str.split(", ");
       System.out.println(Arrays.toString(ilkVeSonEndeks(str1)));
       System.out.println("-----------------------------");
       String kelime="merhaba java insanları bugün nasılsınız";
       System.out.println("-----------------------------");
       System.out.println(Arrays.toString(sıralıYazdır(5)));
        System.out.println("-----------------------------");
        int[] num={5,10,15,86,4,3,2};
        Arrays.sort(num);

        System.out.println(Arrays.toString(ortalama(num)));
        System.out.println(Arrays.toString(changeArray(kelime, 2)));


    }
    public static String[] ilkVeSonEndeks(String[] str){
        String temp=str[0];
        str[0]=str[str.length-1];
        str[str.length-1]=temp;

        return str;
    }

   // Bir method yazın int n parametre olarak alsın. n değeri kadar sayıları sıralı bir
   // biçimde bir array içine yerleştirsin. n = 5 Exm: [0,1,2,3,4]

   public static int[] sıralıYazdır(int n){
        int[] x=new int[n];
       for (int i = 0,j=0; i < x.length; i++,j++) {
           x[i]=j;

       }
       return x;
   }

   // Bir sayı dizisinin en büyük ve en küçük element lerinin aritmetik ortalamasını
   // veren bir method yazın
   public static int[] ortalama(int[] arr){
      int max=arr[arr.length-1];
      int min=arr[0];
      int sum=(max+min)/2;

     return new int[]{sum};
   }
    public static String[] changeArray(String str, int sayi) {
        int newSayi = sayi - 1;
        String[] newStr = str.split(" ");
        String[] newStr2 = newStr[newSayi].split("");

        return newStr2;
    }


}
