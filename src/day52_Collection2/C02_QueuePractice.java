package day52_Collection2;

import java.util.*;

public class C02_QueuePractice {
    public static void main(String[] args) {
        Queue<Integer> priotyQue=new PriorityQueue<>();
        priotyQue.addAll(Arrays.asList(20,150,200,40,120)); // random order
        priotyQue.add(30);
        System.out.println("priotyQue = " + priotyQue);

        Queue<Integer> arrayDeque= new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(20,150,200,40,120)); // preserve insertion order
        arrayDeque.add(30);

        System.out.println("arrayDeque = " + arrayDeque);

        Queue<Integer> linkedList=new LinkedList<>();
        linkedList.addAll(Arrays.asList(20,150,200,40,120));
        linkedList.add(30);
        System.out.println("linkedList = " + linkedList);

        System.out.println("-------------------------------------");

       // priotyQue.get(1)
       // arrayDeque.get(2)

        ((List)linkedList).get(1);
        System.out.println("priotyQue.peek() = " + priotyQue.peek());
        System.out.println(priotyQue);
        System.out.println("priotyQue.poll() = " + priotyQue.poll()); //first element will be removed
        System.out.println(priotyQue);
        System.out.println("-----------------------------");

        System.out.println("arrayDeque.poll() = " + arrayDeque.poll());
        System.out.println(arrayDeque);
        System.out.println("arrayDeque.poll() = " + arrayDeque.poll());
        System.out.println(arrayDeque);
        System.out.println("linkedList.poll() = " + linkedList.poll());
        System.out.println(linkedList);

      //  System.out.println("((List) priotyQue).get(1) = " + ((List) priotyQue).get(1)); runtime error
    }
}
