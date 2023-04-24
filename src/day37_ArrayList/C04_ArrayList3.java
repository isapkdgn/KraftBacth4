package day37_ArrayList;

import java.util.ArrayList;

public class C04_ArrayList3 {
    public static void main(String[] args) {

       /* 5,10,15,15,20,25,25,100,100,500 rakamlarını listOfNums isili
        bir ArrayListe atın ve
        printListNumbers(listOfNums); methodu ile yazdıralım.

        */
        ArrayList<Integer> listOfnums=new ArrayList<>();
        listOfnums.add(5);
        listOfnums.add(10);
        listOfnums.add(15);
        listOfnums.add(20);
        listOfnums.add(25);
        listOfnums.add(25);
        listOfnums.add(100);
        listOfnums.add(100);
        listOfnums.add(500);
        ArrayList<String> stringNums=new ArrayList<>();
        stringNums.add("10");
        stringNums.add("100");
        stringNums.add("101");
        stringNums.add("1000");

        printLisNumbers(listOfnums);
        System.out.println("----------------");
        System.out.println(sum(listOfnums));
        System.out.println("----------------");
        System.out.println(dublicate(listOfnums));
        System.out.println("----------------");
        System.out.println(multiply(listOfnums));
        System.out.println("----------------");
        System.out.println(toInLİst(stringNums));
        System.out.println("----------------");
        System.out.println(writeNumbers(20));


    }


    public static void printLisNumbers(ArrayList arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i)+" ");
        }
    }
   // sum(listOfNums); methodu ile de toplam değeri döndürelim.
    public static int sum(ArrayList<Integer> arrayList){

        int result=0;
        for (int i = 0; i < arrayList.size(); i++) {
            result+=arrayList.get(i);
        }
        return result;
    }
   // duplicate(listOfNums); methodu ile de değerleri dublicate edip list i döndürelim.

    public static ArrayList<Integer> dublicate(ArrayList<Integer> arrayList){
        ArrayList<Integer> arrListYeni=new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            arrListYeni.add(arrayList.get(i));
            arrListYeni.add(arrayList.get(i));
        }

        return arrListYeni;
    }

    public static int multiply(ArrayList<Integer> arrayList){

        int result=1;
        for (int i = 0,j=1; i < arrayList.size()-1; i++,j++) {
            if (arrayList.get(i)== arrayList.get(j)){
                result*= arrayList.get(j);
            }
        }

        return result ;
    }

    public static ArrayList<Integer> toInLİst(ArrayList<String > arrStringList){
        ArrayList<Integer> arrIntList=new ArrayList<>();
        for (int i = 0; i < arrStringList.size(); i++) {
              arrIntList.add(Integer.valueOf(  arrStringList.get(i)));
        }
        return arrIntList;
    }

   /* ArrayList<Integer> myList = getList(20);//return method
    System.out.println(myList);
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

    */
    public static ArrayList<Integer> writeNumbers(int size){
        ArrayList<Integer> myList=new ArrayList<>(size);
        for (int i = 1; i <=size; i++) {
            myList.add(i);
        }
        return myList;
    }






}
