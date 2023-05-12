package day53_ExceptionAndCollection_Summary;

import java.util.LinkedList;
import java.util.Queue;

public class C04_List_Summary {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.add("harun");
        queue.add("ayse");
        queue.add("ziya");
        queue.add("umit");
        System.out.println(queue);
        queue.peek();
        System.out.println(queue);
    }
}
