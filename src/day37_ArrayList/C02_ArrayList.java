package day37_ArrayList;

import java.util.ArrayList;

public class C02_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("harun");
        arrayList.add("ziya");
       // System.out.println(arrayList.get(arrayList.size()-1));
       // System.out.println(arrayList.isEmpty());
        arrayList.add(0,"mehtap");
        arrayList.add(1,"ümit");
        System.out.println(arrayList);
        //arrayList.remove(1);
       // System.out.println(arrayList.get(1));
        System.out.println(arrayList);
        arrayList.set(1,"emine");
        System.out.println(arrayList);

        //indexOff
        System.out.println(arrayList.indexOf("ziya"));


    }
}
