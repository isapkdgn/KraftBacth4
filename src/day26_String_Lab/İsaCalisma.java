package day26_String_Lab;

public class İsaCalisma {

        public static void main(String[] args) {

            //Kullanıcıdan bir input alın ve girilen inputun ilk 3
            // harfini yazan , 3 kelimeden az ise inputu döndüren bir metot yazınız.
            //Merhaba Mer Ali Ali

            // String str="Harun"; // har
            // ali ali
            //iş iş
            // a a
            System.out.println(ilkUcharfGetir("isaaaa"));
            System.out.println("-----------------------------");
            System.out.println(bısluksilyuzdeEkle("    merhaba dünya   "));
            System.out.println("-----------------------------");
            System.out.println(kelimeyi2yeböl("mutluluk"));
            System.out.println(kelimeyi2yeböl2("sanatyagi"));
            System.out.println(kelimeyi2yeböl3("sanatyagı"));
            System.out.println("-----------------------------");
            System.out.println(harfDegistir("merhaba","er","is"));
            System.out.println("-----------------------------");
            System.out.println(trim("   merhaba isa nasılsın   "));
            System.out.println("-----------------------------");
            System.out.println(herKelimeyiCokluYazdır("Merhaba",5));
            System.out.println("-----------------------------");
            System.out.println(substring("merhaba", 3));
            System.out.println("-----------------------------");
            System.out.println(substring("merhaba", 3, 5));
            System.out.println("-----------------------------");
            System.out.println(karakterSay("mehaba", 'a'));
            System.out.println(karakterSay1("Ankara", 'a'));
            System.out.println(karakterSay2("Ankara", "a"));
            System.out.println("-----------------------------");
            System.out.println(harfSil("merhaba", 'a'));
            System.out.println(harfSil2("merhaba", 'a'));


        }
        public static String ilkUcharfGetir(String str){

            if (str.length()<3){
                return str;
            }
            return str.substring(0,3);
        }
        //Kullanıcıdan bir dize sözcük alın ve her
        // boşluğa % ibaresi ekleyin. Merhaba dünya Merhaba%dünya
        // "   merhaba dünya  "   %%%merhaba%dünya%%

        public static String bısluksilyuzdeEkle(String str){
            return str.replace(" ","%");
        }
        //Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını
        // döndüren bir program yazdırın.
        //Sanayagı yagı Mutluluk uluk

        public static String kelimeyi2yeböl(String str){
        return str.substring(str.length()/2);
        }
        public static String kelimeyi2yeböl2(String str){
            if (str.length()%2==0){
            return str.substring(str.length()/2);
            }else {
                return str.substring(str.length()/2+1);
            }
        }
        public static String kelimeyi2yeböl3(String str){
           //                                      (int)       5.0=5
         //                                   (int)    Math.ceil(4.5 )
           return str.substring((int)Math.ceil((double)str.length()/2 )  );
        }
        //Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve
        // yeni harfi/harfleri alan ve buna göre kelimede/dizede sadece
        // ilk bulduğu yeri değiştiren metodu yazınız.
        //(Merhaba ,a, e) Merheba (Kasaba , a, i) Kisaba

        public static String harfDegistir(String str,String old,String yeni){

            return str.replaceFirst(old,yeni);
        }
        //trim(String str) şeklinde bir metot yazın trim gibi çalışsın
        // ve string döndürsün.  İçerisinde string in hazır metodu
        // olan trim metodunu kullanmayın.

        public static String trim(String str){
           int start=0;
           int end=0;
           for (int i=0;i<str.length();i++){
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
        //Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.
        //Merhaba MMMeeerrrhhhaaabbbaaa Ali AAAllliii

       public static String herKelimeyiCokluYazdır(String str,int adet){
          String result="";
           for (int i = 0; i <str.length() ; i++) {
               for (int j = 0; j <adet ; j++) {
                   result+=str.charAt(i);
               }
           }
           return result;
       }

        //tek index  numarası alan substring metodunu yazınız
        // "Merhaba"     str.substring(3)=haba
        //  subString(String str,int index)
        public static String substring(String str,int index){
          String result="";
            for (int i = index; i < str.length(); i++) {
                result+=str.charAt(i);
            }
            return result;

        }
        //çift index  numarası alan substring metodunu yazınız
        // "Merhaba"     str.substring(3,5)=ha
        //  subString(String str,int start, int end)

        public static String substring(String str,int start,int end){
            String result="";
            for (int i = start; i <end ; i++) {
                result+=str.charAt(i);
            }
            return result;
        }
        //Kullanıcıdan bir kelime ve bir karakter alın
        // ve bu kelimenin istenen karakterin kaç adet olduğunu
        // döndüren metodu yazınız. (büyük küçük harf göz ardı edilecek)
        //Ankara,a 3 Edirne,e 2

        public static int karakterSay(String str,char ch){
            int count=0;
            for (int i = 0; i <str.length() ; i++) {
                if (str.charAt(i)==ch){
                count++;
                }
            }
            return count;
        }
        public static int karakterSay1(String str,char ch){
            String x=ch+"";
            int count=0;
            for (int i = 0; i <str.length() ; i++) {
                if (str.substring(i,i+1).equalsIgnoreCase(x)){
                count++;
                }
            }
            return count;
        }

        public static int karakterSay2(String str,String c){
            str=str.toLowerCase();
            c=c.toLowerCase();
            int count=0;
            for (int i = 0; i <str.length() ; i++) {
                if (str.substring(i,i+1).equals(c)){
                count++;
                }
            }
            return count;
        }

        public static  String harfSil(String str,char target){
            String target2=target+"";
            return str.replaceAll(target2,"");
        }

        public static  String harfSil2(String str,char target){

            String result="";
            for (int i = 0; i <str.length() ; i++) {
                if (str.charAt(i)!=target){
                    result+=str.charAt(i);
                }
            }
            return result;
        }




















    }

