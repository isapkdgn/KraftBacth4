package day52_Collection2;

import java.util.HashSet;
import java.util.Set;

public class C04_SetPractice2 {
    public static void main(String[] args) {
        String str="Yattın mi Yorgun musun Uyu düşünme beniBen ki hiç düşünülmedim senden öncesini";
        // bu String içinde kac farklı harf var?


//        Set<Integer> set1=new HashSet<>();
//        set1.add(5);
//        set1.add(10);
//        set1.add(15);
//        set1.add(15);
//        set1.add(15);
//        System.out.println(set1);
//        set1.remove(15);
//        System.out.println(set1);
        System.out.println("unigueLetterCount(str) = " + unigueLetterCount(str));


    }

    public static int unigueLetterCount(String str){
      String[] arr=  str.replace(" ","").split("");
      Set<String> uniqueCharSet=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            uniqueCharSet.add(arr[i]);
        }
      return   uniqueCharSet.size();



    }







}
