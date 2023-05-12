package day52_Collection2;

import java.util.*;

public class C05_SetPractice3 {

    public static void main(String[] args) {
        String[] arr={"book","book","notebook","pen","pencil","pen","spoon","ruler","phone","mirror","phone","brush"};

        Set<String> uniqItemsInMybeg=new HashSet<>(Arrays.asList(arr));
        System.out.println(uniqItemsInMybeg);

        Set<String> uniqItemsInMybeg2=new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(uniqItemsInMybeg2);

        Set<String> uniqItemsInMybeg3=new TreeSet<>(Arrays.asList(arr));
        System.out.println(uniqItemsInMybeg3);

//        arr=uniqItemsInMybeg3.toArray(new String[0]);
//        System.out.println("arr.length = " + arr.length);
//        System.out.println(Arrays.toString(arr));





    }
}
