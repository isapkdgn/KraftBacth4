package day44_Final;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

     /* final   String[] strArr= {"Ogretmen","Mehmet","Ahmet"};
         String[] strArr2= {"Ogretmen","Mehmet","Ahmet"};
       strArr=strArr2;
       strArr2=strArr;

      */


        // FinalExample finalExample=new FinalExample();
        // finalExample.X=100;

       final   ArrayList<Integer> arrayList=new ArrayList<>();
         ArrayList<Integer> arrayList2=new ArrayList<>();
        arrayList.add(250);
        arrayList.add(350);
        arrayList.set(0,600);   //600,350
       // arrayList=arrayList2;
        arrayList2=arrayList;
        System.out.println(arrayList2.get(0));


    }
}
