package day53_ExceptionAndCollection_Summary;

import java.util.*;

public class C03_List_Summary {
    public static void main(String[] args) {
        List<String> arrayLst=new ArrayList<>();
        LinkedList<String> linkedList=new LinkedList<>();

        arrayLst.add("harun");
        linkedList.add("harun");
        arrayLst.add("mehmet");
        linkedList.add("mehmet");
        System.out.println(arrayLst);
        System.out.println(linkedList);
        System.out.println(arrayLst.get(0));
        System.out.println(linkedList.get(0));

        Stack<Integer> stack=new Stack<>();
        System.out.println(stack.capacity());
        stack.add(25);
        stack.add(50);
        stack.add(75);
        System.out.println(stack.firstElement());
        System.out.println(stack.elementAt(1));
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        stack.push(80);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);


    }
}
