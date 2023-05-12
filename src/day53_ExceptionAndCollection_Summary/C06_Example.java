package day53_ExceptionAndCollection_Summary;

import java.util.*;

public class C06_Example {
//list içerisinde bulunan polindrom (terside kendisine ayni  olan kelimeler) kelimeleri string olarak donen
// metodu yazınız.(aynı kelimeleri ekrana yazma-sın)
//kazık,adanada,kazak,radar,ses,harun
//adanada,kazak,radar,ses,aga,ada

    public static void main(String[] args) {
       List<String> list=new ArrayList<>();
       list.addAll(Arrays.asList("kazık","adanada","kazak","radar","ses","harun"));
       polindrom(list);
       List<Integer> list2=new ArrayList<>();
       list2.addAll(Arrays.asList(2,2,5,6,8,4,6));
        System.out.println(uniqSayilar(list2));


    }

    public static void polindrom(List<String > list){
        Set<String> resultSet=new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
           if( list.get(i).equalsIgnoreCase(reverse(list.get(i)))){
               resultSet.add(list.get(i));
           }
        }

        for (String str:resultSet){
            System.out.print(str+" ");
        }
    }

    public static String reverse(String str){
        try{
            String result="";
            for (int i =str.length()-1; i >=0 ; i--) {
                result+=str.charAt(i);
            }
            return result;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }


    }

    //list içerisindeki eşi olmayan (Çifti olmayan) uniq sayıları bulun list olarak döndürelim

    public static List<Integer> uniqSayilar(List<Integer> list){
        int count=list.size();
        List<Integer> resultList=new ArrayList<>();

        while (!list.isEmpty()) {
           int deger= list.get(0);
            list.removeAll(Arrays.asList(list.get(0)));
           if( list.size()==count-1){
               resultList.add(deger);
           }
           count=list.size();
        }
        return resultList;
    }



}
