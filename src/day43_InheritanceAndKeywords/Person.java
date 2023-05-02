package day43_InheritanceAndKeywords;

import java.util.Random;

public class Person {
    String name;
    String surname;
    String id;
    double salary;
    public Person(){}
     public Person(String name,String surname,double salary,String İd){
         this.name=name;
         this.surname=surname;
         this.salary=salary;
         this.id=id;
     }

    public String createId(){
        Random random=new Random();
        id=id.concat(name).substring(0,2).concat(String.valueOf(random.nextInt(1000,9999)));
        return id;
    }
    public static void personMethod(){}
}
