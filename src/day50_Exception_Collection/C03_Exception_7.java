package day50_Exception_Collection;

public class C03_Exception_7 {
    public static void main(String[] args)  {

        for (int i = 0; i < 10; i++) {

            System.out.print(i);
        }


        b();
    }

   static void b()  {

        try {
            a();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    static void a() throws InterruptedException {
        Thread.sleep(3000);
    }





}
