package day50_Exception_Collection;

public class C04_Exception_8 {

    public static void main(String[] args) {
       /* int i=50;
        if (i<Integer.MAX_VALUE){
            System.out.println(1);
        } else if (i<70) {
            System.out.println(2);
        } else if (i<50) {
            System.out.println(3);
        }else {
            System.out.println(4);
        }

        */
        /*
        String str=null;

        try {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(i);
            }
        }catch (ArithmeticException a){
            System.out.println("arimetik  exception hatası alındı");
        }catch (NullPointerException a){
            a.printStackTrace();
            System.out.println("null a dikkat");
        }
        catch (RuntimeException r){
            System.out.println("run time hatası aldın");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("exception var kontrol et");
        }finally {
            System.out.println("her zaman calısır");
        }
        System.out.println("kod devam ediyor");

         */
        /*
        String str=null;

        try {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(i);
            }
        }catch (ArithmeticException | NullPointerException | IllegalArgumentException c){
            System.out.println("maritime  exception hatası alındı");

        }catch (RuntimeException r){
            System.out.println("run time hatası aldın");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("exception var kontrol et");
        }finally {
            System.out.println("her zaman calısır");
        }
        System.out.println("kod devam ediyor");

         */
        try{
            System.out.println(5/0);
        }finally {
            System.out.println(1);
        }
        System.out.println("kod devam ediyor");

    }
}
