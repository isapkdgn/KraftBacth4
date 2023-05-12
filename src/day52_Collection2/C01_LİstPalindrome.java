package day52_Collection2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_LİstPalindrome {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.addAll(Arrays.asList("kazık","adanada","kazak","radar","ses","ses","radar"));
        System.out.println(findPalindromeInLİst(list));


    }
    public static String findPalindromeInLİst(List<String> list){
        String result="";
        for (int i = 0; i < list.size(); i++) {
            String str= list.get(i);
            String reverse="";
            for (int j = str.length()-1; 0 <=j ; j--) {
                reverse+=str.charAt(j);
            }
            if (str.equalsIgnoreCase(reverse)){
                result+=str+" ";
                list.removeAll(Arrays.asList(str));
                i--;
            }

        }

        return result;
    }

 //   public static List<String> findPalindromeInLİst(List<String> list){
//        String result="";
//        for (int i = 0; i < list.size(); i++) {
//            String str= list.get(i);
//            String reverse="";
//            for (int j = str.length()-1; 0 <=j ; j--) {
//                reverse+=str.charAt(j);
//            }
//            if (str.equalsIgnoreCase(reverse)){
//                result+=str+" ";
//                list.removeAll(Arrays.asList(str));
//                i--;
//            }
//
//        }
//
//        return result;
//    }



}
