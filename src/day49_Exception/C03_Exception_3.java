package day49_Exception;

public class C03_Exception_3 {
    public static void main(String[] args) {
        /*System.out.println("1");
        try {
            System.out.println("2");
            System.out.println(5/0);

        }catch (Exception e){
            System.out.println(5/0);
        }finally {
            System.out.println("4");
        }
        System.out.println("5");

         */
        unchecked();
        System.out.println(method(null));

    }
    public static void unchecked(){
        System.out.println("1");
        try {
            System.out.println("2");
            System.out.println(5/1);

        }catch (Exception e){
            System.out.println(5/1);
        }finally {
            System.out.println("4");
        }
        System.out.println("5");
    }




    public static void check() throws InterruptedException {

            Thread.sleep(3000); //InterruptedException

    }
    public static String  method(String str){
       try {
           String result="";
           for (int i =str.length()-3 ; i < str.length(); i++) {
               result+=str.charAt(i);
           }
           return result;
       }catch (Exception e){
           return null;
       }


    }


}
