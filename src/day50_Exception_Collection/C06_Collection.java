package day50_Exception_Collection;

import day48_OOP_Review_ScrumTeam.ScrumTeam.Person;

import java.util.ArrayList;

public interface C06_Collection {
    public static void main(String[] args) {
        ArrayList<Person> arrayList=new ArrayList<>();

        Person person1=new Person("harun",25,'E');
        Person person2=new Person("mehmet",25,'E');
        Person person3=new Person("ahmet",25,'E');

        arrayList.add(person1);
        arrayList.add(person2);
        arrayList.add(person3);

        ArrayList<Integer> arrayList1=new ArrayList<>();

        arrayList1.add(25);
        arrayList1.add(25);
        arrayList1.add(35);


        ArrayList<Integer> arrayList2=new ArrayList<>();


        arrayList2.add(25);
        arrayList2.add(45);
        arrayList2.add(55);
        arrayList1.addAll(arrayList2);

       // System.out.println(arrayList1.isEmpty());
      //  arrayList1.clear();
      //  arrayList1.remove(0);
      //  arrayList1.removeAll(arrayList2);
      //  System.out.println(arrayList1.get(0));
      //  System.out.println(arrayList1);
        System.out.println(arrayList1.containsAll(arrayList2));


    }


}
