package day21_Class_And_Object;

public class C03_Fibonacci {
    public static void main(String[] args) {
        //Kullanıcı tarafından girilen n terimli Fibonacci dizisini yazdıran bir program yazın: 0 1 1 2 3 5 8 13 24//
        //public static void fibonacci(){
        //  for(int i=0; i)
        fibonacci(9);
        System.out.println();
        System.out.println(fibonacciSonSayi(9));

    }
    public static void fibonacci(int n) {
        int x = 0;
        int y = 1;
        int z;
        System.out.print(x + " ");
        System.out.print(y + " ");
        for (int i = 0; i < n - 2; i++) {
            z = x + y;
            System.out.print(z + " ");
            x = y;
            y = z;
        }
    }
        public static int fibonacciSonSayi(int n){
            int x = 0;
            int y = 1;
            int z = 0;

            for (int i = 0; i < n - 2; i++) {
                z = x + y;

                x = y;
                y = z;
            }
            return z;
        }



    }

