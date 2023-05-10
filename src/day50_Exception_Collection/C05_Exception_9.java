package day50_Exception_Collection;

public class C05_Exception_9 {
    public static void main(String[] args)  {

       try {
           throw new Exception("harun hata fırlatıyor");
       }catch (Exception e){
           e.printStackTrace();
       }



    }
    static void d(){
        c();
    }




    static void c(){

       try {
           b();
       }catch (Exception e){
           e.printStackTrace();
       }

    }

    static void b() throws Exception {
        a();
    }


    static void a() throws Exception {

        throw new Exception("Harun hata fırlattı"); // interwiev sorusu
    }


}
