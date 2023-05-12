package day53_ExceptionAndCollection_Summary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_List_Summary {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.addAll(Arrays.asList("harun","mehmet","Ahmet"));
        list.add("celal");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.remove(0));
        System.out.println(list);
        list.addAll(Arrays.asList("harun","mehmet","Ahmet"));
      //  list.removeAll(Arrays.asList("mehmet","Ahmet"));
      //  list.retainAll(Arrays.asList("mehmet","Ahmet"));

        System.out.println(list.contains("harun"));
        list.containsAll(Arrays.asList("mehmet","Ahmet"));

        System.out.println(list);



    }
}
