package day51_Collection_List;

import java.util.*;

public class C01_Collection {

    public static void main(String[] args) {


    /* Collection nesneleri öbjelerin bir arada tutan yapılar
    karşılasılan istenilen durumlara göre kullanılan collection yapılari farklılık gösterir
    hangi collection tipini kullanacağımızı belirleriz

    3 ana colection tipi vardir
    1- List : Arraylist Linkedlist, Vector(stack)
    2- Queue: Priority Que, Arrayque
    3- Set: Hasnnet,Linkedhashset .TreeSet

    *
     */
      int[] arr=new  int[4];
      arr[0]=1;
      arr[1]=2;
      arr[2]=3;
      arr[3]=4;
     /// arr[4]=5;  //ArrayIndexOutOfBoundsException


    //    List<String> coll1=new List<String>(); //Interface obje olusturamıyoruz
        List<String> coll2=new ArrayList<>();
        List<Object> coll3=new LinkedList<>();
        Queue<String> coll4=new LinkedList<>();
        Queue<String> coll5=new PriorityQueue<>();
        List<String> coll6=new Stack<>();
        List<String> coll7=new Vector<>();

        Set<String> coll8=new HashSet<>();
        Set<String> coll9=new TreeSet<>();
        Set<String> coll10=new LinkedHashSet<>();
        HashSet<String> set1=new HashSet<>();











    }

}
