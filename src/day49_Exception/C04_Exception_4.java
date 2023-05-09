package day49_Exception;

public class C04_Exception_4 {

    public static void a(){
        b();
        c();
    }
    public static void b(){
        c();
    }
    public static void c() {

        try {
            d();
        }catch (Exception e){

        }

    }
    public static void d() throws InterruptedException {
        Thread.sleep(3000);
    }
}