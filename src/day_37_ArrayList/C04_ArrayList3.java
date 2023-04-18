package day_37_ArrayList;

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

        printLisNumbers(listOfnums);
        System.out.println("----------------");
        System.out.println(sum(listOfnums));
        System.out.println("----------------");
        System.out.println(dublicate(listOfnums));
        System.out.println("----------------");



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

    public static ArrayList<Integer> toInLİst(ArrayList<String > arrStringList){
        ArrayList<Integer> arrIntList=new ArrayList<>();
        for (int i = 0; i < arrStringList.size(); i++) {
              arrIntList.add(Integer.valueOf(  arrStringList.get(i)));
        }
        return arrIntList;
    }


    //yeni bir araylist olusturun içerisine 5 adet sayı ekleyin
    // dondur(int x) x kadar sayıları  kendi içerisınde döndürün
    // 12345 döndür(int 1) 51234  döndür(int 3)  34512   yeni bir arrayLİst

}
