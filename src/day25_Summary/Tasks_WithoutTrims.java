package day25_Summary;

public class Tasks_WithoutTrims {
   // Pazartesiye kadar ödev: trim(String str) şeklinde bir metot yazın trim gibi çalışsın  ve string döndürsün.
   // İçerisinde string in hazır metodu olan trim metodunu kullanmayın.
   public static void main(String[] args) {
      System.out.println(trim2("   isa pekdoğan  "));
   }

   public static String trim2(String str){

     int start=0;
     int  end=0;
       for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i)!=' '){
               start=i;
               break;
           }
       }
       for (int i = str.length()-1; i >=0 ; i--) {
           if (str.charAt(i)!=' '){
               end=i;
               break;
           }
       }
        return str.substring(start,end+1);
     }


   }

