package day34_Arrays_4;

import java.util.Arrays;
import java.util.Random;

public class C07_ArraysLabDay34PDF {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 3, 3};
        System.out.println("--------örnek 1 ----------");
        System.out.println(sumOfArrayElements(numbers));
        System.out.println("-----------örnek 2 ---------");
        System.out.println(sumOfEvenElements(numbers));
        System.out.println("----------örnek 3 ---------");
        System.out.println(sumOfThrees(numbers));
        System.out.println("-----------örnek 4 ------------------------");

        int[] numbers1 = {1, 2, 3, 4, 5, 3, 3};
        System.out.println(Arrays.toString(arrayMaxOfMin(numbers1)));
        System.out.println("-------- örnek 5 --------------");
        int[] num1 = {1, 2, -8, -9};
        System.out.println(Arrays.toString(arrayFill(num1)));
        System.out.println("--------------örnek 6 --------------------------");
        System.out.println(Arrays.toString(buildArray(8, 15)));
        System.out.println("----------------örnek 7 ---------------------------");
        int[] a = {1, 2, -8, -9};
        int[] b = {-1, 0, -7, 11};
        System.out.println(Arrays.toString(concatArray(a, b)));
        System.out.println("---------------örnek 8 ----------------------");
        int[] arr1 = {5, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 5, 7, 9};
        System.out.println(arraysEquals(arr1, arr2));
        System.out.println("---------------örnek 9 ----------------------");
        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(arr3)));
        System.out.println("-----------------örnek 10 --------------------");
        System.out.println(Arrays.toString(randomArray()));
        System.out.println("-------------------ornek 11------------------");
        System.out.println(Arrays.toString(randomArray2()));
        System.out.println("-------------------örnek 12 ------------------");
        System.out.println(Arrays.toString(randomArray3()));
        System.out.println("------------------örnek 13 -------------------");
        System.out.println(Arrays.toString(new int[]{randomArrayIkinciEnBuyuk()}));

        System.out.println(enBüyük2sayi(randamSayiAta(500, 50, 80)));
        System.out.println(maxArray(randamSayiAta(500, 50, 80)));

        System.out.println("--------------örnek 14 -----------------------");
        int[] z = {2, 3, 3, 4, 5, 6, 5, 6, 3};
        System.out.println(ardisikucsayiVarmıArrayi(z));
        System.out.println("------------örnek15-----------------------");
        System.out.println("------------örnek16-----------------------");
        int [] zz={2,4,5,8,8};
        System.out.println(mostRepeatNumber(zz));


        System.out.println("---------------örnek 17 ----------------------");
        int[] dubli = {1, 2, 8, 1};
        int[] dubli1 = {25, 89, 78, 98};
        System.out.println(dublicate(dubli));
        System.out.println("------------ örnek 18 ----------------");
        String str = "Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek\n" +
                "    dolu karnı horlarken bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp\n" +
                "    sesin olduğu tarafa gitti, filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının\n" +
                "    üzerine oturdu, salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu.";
        System.out.println(kacAdetVar(str, 'o'));
        System.out.println("---------------örnek 19 ----------------------");
        String str1 = "araba ile yola çıktık fakat araba arıza yaptı";
        String str2 = "araba ile yola çıktık fakat arıza yaptı";
        System.out.println(Arrays.toString(new boolean[]{dublicateWord(str1)}));
        System.out.println("-----------örnek 20 ---------------------------");
        int[] x1 = {5, 7, 1, 9};
        System.out.println(Arrays.toString(minArrayiİlkEndekseAtama(x1)));
        System.out.println("------------örnek 21 --------------------");
        int[] c = {6, 5, 8, 6, 8, 5, 8};
        System.out.println(Arrays.toString(arrayİçerisindesayiatama(c)));
        System.out.println("------------örnek 22-------------");
        int[] prime={21,7,29,12};
        asalSayilar(prime);
        System.out.println("-------------örnek 24 ------------------");
        int[] q = {1, 1, 2, 3};
        int[] w = {2, 5, 5, 5, 9};
        System.out.println(dublicateOlmayanToplam(q));
        System.out.println("----------------- örnek 25 ------------------");
        int[] r = {1, 5, 9, 3};
        int[] t = {5, 5, 5, 9};
        int[] u = {5, 3, 9, 11, 9};
        System.out.println(belliAralikHaricToplama(u));
        System.out.println("--------- örnek 26 --------------------");
        int[] bir={5,1,9,6,1,4,7,11,25,36};
        System.out.println(Arrays.toString(aynıRakamıSonaYazma(bir)));


    }

    //Örnek 1: Array’in içerisindeki tüm sayıların toplamını veren metodu yazınız..
    public static int sumOfArrayElements(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static double sumOfArrayElements(double[] arr) {
        double sum = 0;
        for (double i : arr) {
            sum += i;
        }
        return sum;
    }

    // Örnek 2: Array’in içerisindeki tüm çift sayıların toplamını veren metodu yazınız.
    public static int sumOfEvenElements(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    //Örnek 3: Array’in içerisindeki tüm 3 sayılarının toplamını veren metodu yazınız.
    //[2,3,3,6,5,4,3] →9

    public static int sumOfThrees(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i == 3) {
                sum += i;
            }
        }
        return sum;
    }

    // Örnek 4: Array’in içerisindeki en büyük ve en küçük sayıyı bulan metodu yazınız. (Arrays.sort kullanılmayacak)

    public static int[] arrayMaxOfMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        int[] result = {max, min};
        return result;
    }

    /*Örnek 5:Array’in içerisindeki en küçük sayıyı tüm indekslere atayan bir metod yazınız.(Arrays.sort ve
    Arrays.fill kullanılmayacak)
            [1,2,-8,-9] [-9,-9,-9,-9]

     */

    public static int[] arrayFill(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                arr[i] = min;
            }
        }
        return arr;
    }

   /* Örnek 6: 2 adet integer sayı alan ve arasındaki sayıları indekslere atayan metodu yazınız.
            createArray(8,15) → [8,9,10,11,12,13,14,15]

    */

    public static int[] buildArray(int num1, int num2) {
        int[] intArr = new int[(num2 - num1) + 1];

        for (int i = 0, j = num1; i < intArr.length; i++, j++) {
            intArr[i] = j;
        }
        return intArr;
    }

    /*  Örnek 7: 2 adet array kabul eden ve sonucunda bu 2 array’in verileri ile birlikte tek bir array
        oluşturan metodu yazınız.
        [1,2,-8,-9] [-1,0,-7,11] -------→ [1,2,-8,-9,-1,0,-7,11]

     */


    public static int[] concatArray(int[] arr1, int[] arr2) {

        int[] yeniArr = new int[arr1.length + arr2.length];

        for (int i = 0, j = 0; i < yeniArr.length; i++) {
            if (i < arr1.length) {
                yeniArr[i] = arr1[i];
            } else {
                yeniArr[i] = arr2[j];
                j++;
            }

        }

        return yeniArr;
    }

    /* Örnek 8: 2 array kabul eden, ilk array in içerindeki tüm sayılar ikinci arrayin içinde yer alıyorsa true
     yer almıyorsa false yazdıran metodu yazınız.
         [5,4,3,2,1] , [1,2,3,4,5,7,9] true
         [5,4,3,2,1,7,5] , [1,2,3,4,5] false

     */
    public static boolean arraysEquals(int[] arr1, int[] arr2) {

        firstLoop:
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    continue firstLoop;
                }
            }
            return false;
        }
        return true;
    }
    // Örnek 9: Array’in içerisindeki sayıları ters çevirerek yeni bir array oluşturan metodu yazınız [5,4,3,2,1] -----------> [1,2,3,4,5]

    public static int[] reverseArray(int[] arr) {
        int[] reverce = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverce[j] += arr[i];
        }
        return reverce;
    }
    // Örnek 10: Boyutu 10 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 0-100 arasında
    // rasgele sayılar atayın ve ekrana bu verileri yazdıran metodu yazınız.

    public static int[] randomArray() {
        Random random = new Random();
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(100);
        }
        return num;
    }

    // Örnek 11: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 50-80
    // arasında rasgele sayılar atayın.
    public static int[] randomArray2() {
        Random random = new Random();
        int[] num = new int[500];
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(50, 80);
        }
        return num;
    }

    // Örnek 12: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 120-140
    // arasında rasgele sayılar atayın. Oluşturduğunuz Array in içerinde kaç adet 125 sayısı vardır?
    public static int[] randomArray3() {
        Random random = new Random();
        int[] num = new int[500];
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(120, 140);
            if (num[i] == 125) {
                count++;

            }
        }
        return new int[]{count};
    }

    /* Örnek 13: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 120-140
     arasında rasgele sayılar atayın. Oluşturduğunuz Array içerisindeki en büyük 2. sayıyı bulun.
             (Array.sort kullanılmayacak)

     */
    public static int randomArrayIkinciEnBuyuk() {
        Random random = new Random();
        int number[] = new int[500];
        int max = number[0];
        int max2 = number[0];
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(120, 140);
            if (number[i] > max) {
                max = number[i];
            }
            if (max != number[i] && number[i] > max2) {
                max2 = number[i];
            }
        }
        return max2;
    }

    public static int enBüyük2sayi(int[] arr){
        int max=maxArray(arr);
        int enBüyük2sayi=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=enBüyük2sayi&&arr[i]!=max){
                enBüyük2sayi=arr[i];
            }
        }


        return enBüyük2sayi;
    }
    public static int maxArray(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int[] randamSayiAta(int boyut,int from, int to){
        int[] arr=new int[boyut];
        Random random=new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(to-from)+from;  // aradaki fark iceriye miminum dısariya artı olarak yazılır
        }
        return arr;
    }

    //Örnek 14: Array’in içerisinde ard arda 3 adet sıralı sayı var ise true döndüren metodu yazınız.
    //    [2,3,3,4,5,6,5,6,3] → true     [2,4,5,8,8] → false        [1,2,3] → true     [1,2] → false

    public static boolean ardisikucsayiVarmıArrayi(int[] arr) {

        for (int i = 0, j = 1, k = 2; i < arr.length - 2; i++) {
            if (arr[i] + 1 == arr[j] && arr[j] + 1 == arr[k]) {
                return true;
            }
            j++;
            k++;
        }
        return false;
    }
   /* Örnek 15: Array’in içerindeki eşi olmayan yalnız sayıları bulan ve bunları ekrana yazdıran metodu
yazınız. (sağında veya solunda aynı sayı yoksa yalnızdır.)
            [2,3,3,4,5,6,5,6,3] → 2,4,5,6,3
            [2,2,5,8,8] →5
            [2,2,3] → 3
            [1,2] → 1,2

    */
   /* Örnek 16: Array’in içerisinde en çok bulunan sayıyı veren metodu yazınız. (eşitlik durumda herhangi
    birini alabilir,1 den fazla bulunmuyorsa -1 döndürecek)
            [2,3,3,3,6,6,5,6,3] → 3
            [2,4,5,8,8] → 8
            [2,4,5,8] → -1

    */
    public static int mostRepeatNumber(int[] arr){

        int maxcount=1;
        int deger=0;

        //1,1,1,5,8,8,8,8
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if (count>maxcount){
                maxcount=count;
                deger=arr[i];
            }
        }
        if (maxcount==1){
            return -1;
        }
        return deger;
    }




    // Örnek 17:Array’in içerindeki dublicate sayı varsa true yoksa false döndüren metodu yazınız.
    //     [1,2,8,1] true     [25,89,78,98] false

    public static boolean dublicate(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return true;
            }
        }
        return false;
    }
   /* Örnek 18: «Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek
    dolu karnı horlarken bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp
    sesin olduğu tarafa gitti, filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının
    üzerine oturdu, salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu.» kelimesinde kaç adet o
    harfi vardır. (Büyük ve küçük ihmal edilecek)

    */

    public static int kacAdetVar(String str, char ch) {
        str = str.toLowerCase();
        int adet = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                adet++;
            }
        }
        return adet;
    }
   /* Örnek 19:Verilen bir cümlenin içerinde dublicate kelime varsa true yoksa false döndüren metodu yazınız.
    araba ile yola çıktık fakat araba arıza yaptı true
    araba ile yola çıktık fakat arıza yaptı false

    */

    public static boolean dublicateWord(String str) {

        str = str.toLowerCase();
        String[] strArr = str.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].equals(strArr[j])) {
                    return true;
                }
            }
        }
        return false;
    }
     /* Örnek 20:Array’in içerisindeki en küçük sayıyı bulan ve array in ilk indeksine bu sayıyı atayan diğer
    indekslere 0 atayan metodu yazınız.    [5,7,1,9] [1,0,0,0]

    */

    public static int[] minArrayiİlkEndekseAtama(int[] arr) {
        int[] yeniArr = new int[arr.length];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        yeniArr[0] = min;
        return yeniArr;
    }

    /* Örnek 21:Array’in içerisindeki sayılardan 5 den sonra 8 geliyorsa 8 yerine 1 atayan metodu yazınız.
         [6,5,8,6,8,5,8] →[6,5,1,6,8,5,1]   ---   [5,7,8,5,9] → [5,7,8,5,9]

     */
    public static int[] arrayİçerisindesayiatama(int[] x) {
        for (int i = 0, j = 1; i < x.length - 1; i++) {

            if (x[i] == 5 && x[j] == 8) {
                x[j] = 1;
            }
            j++;
        }
        return x;
    }

    // Örnek 22:Array’in içerisindeki asal sayıları bularak ekrana yazdıran metodu yazınız.  [21,7,29,12] ----→ 7 29


    public static void asalSayilar(int[] x){
        for (int i = 0; i < x.length; i++) {

            if(asalMi(x[i])) {
                System.out.println(x[i]);
            }
        }
    }


    public static boolean asalMi(int x){
        int bolen=0;
        boolean result=false;
        for (int i = 2; i <=x ; i++) {//sıfır modu olmaz. o yüzden 1
            if(x%i==0){
                bolen++;
            }
        }
        if(bolen==1) {result= true;}
        return result;
    }
    //Örnek 23:Array’in içerisindeki sayıları artan düzeyde sıralayınız. (Arrays.sort kullanılmayacak)
      //      [21,7,29,12] ----→ [7,12,21,29]



    //  Örnek 24:Array’in içerisindeki ard arda aynı olan sayıları hariç tutarak dublicate olmayan sayıların
    //  toplamını veren metodu yazınız.

    public static int dublicateOlmayanToplam(int[] arr) {
        int count = 0;
        for (int i = 0,j=1; i < arr.length-1; i++,j++) {
           if (arr[i]!=arr[j]){
               count+=arr[i];
           }

        }
        return count;

    }

/*Örnek 25:Array’in içerisindeki sayıların toplamını veren fakat 5 ile 9 dahil arasındaki sayıları
    toplama dahil etmeyin.
       [1,5,9,3] → 4      [2,5,28,36,9] →2      [5,3,9,11,9] →20   [5,5,5,5,9] →0    [5,9,5,1,9] →0

     */

    public static int belliAralikHaricToplama(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 5 && arr[j] == 9) {
                    Arrays.fill(arr, i, j + 1, 0);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


    //Örnek 26:Array’in içerisindeki ne kadar 1 var ise hepsini en sağa taşıyan metodu yazınız.
     //       [5,1,9,6,1,4,7,11,25,36] → [5,9,6,4,7,11,25,36,1,1]
    public static int[] aynıRakamıSonaYazma(int[] arr){
        int size=arr.length;
        int out[]=new int[size];
        int solİndex=0;
        int sagİndex=size-1;

        for (int i = 0; i < arr.length; i++) {
                if (arr[i]!=1){
                    out[solİndex]=arr[i];
                    solİndex++;
                }else {
                    out[sagİndex]=arr[i];
                    sagİndex--;
                }            }


        return out;
    }



}









