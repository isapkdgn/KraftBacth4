package day31_Arrays_1;

public class C03_Array_2 {
    public static void main(String[] args) {
        int array[]=new int[5];
        array[0]=105;
        array[1]=89;
        array[2]=63;
        array[3]=56;
        array[4]=107;
        System.out.println("array.length = " + array.length);

      //  for (int i = 0; i < array.length; i++) {
        //    System.out.print(array[i]+" ");
      //  }

        for (int x:array) {
            //x=array[0] 1,döngü
            //x=array[1] 2,döngü
            //x=array[2] 3,döngü
            //x=array[3] 4,döngü
            //x=array[4] 5,döngü
        }

        int ciftsayi=0;
        for (int x:array) {
            if (x%2==0){
                ciftsayi++;
            }
        }
        System.out.println("cift sayi :"+ciftsayi);
        int teksayi=0;
        for (int y: array) {
            if (y%2==1){
                teksayi++;
            }
        }
        System.out.println("teksayi :"+teksayi);

           int sum=0;
        for (int x: array) {
            sum+=x;
        }

        System.out.println("for each sum = " + sum);
        int sum1=0;
        for (int i = 0; i <array.length ; i++) {
            sum1+=array[i];
        }
        System.out.println("for loop sum = " + sum1);
        
    }

    public static String[] arrayMethot(){

        String[] array={"harun","mehmet"};

      return array;
    }
    public static String arrayMethot(String[] arr){



        return arr[0];
    }








}
