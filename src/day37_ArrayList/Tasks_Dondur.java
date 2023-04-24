package day37_ArrayList;

import java.util.ArrayList;

public class Tasks_Dondur {
    public static void main(String[] args) {
        //yeni bir araylist olusturun içerisine 5 adet sayı ekleyin
        // dondur(int x) x kadar sayıları  kendi içerisınde döndürün
        // 12345 döndür(int 1) 51234  döndür(int 3)  34512   yeni bir arrayLİst

        ArrayList<Integer> arrayList=new ArrayList<>(5);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println("dondur(arrayList,5) = " + dondur(arrayList, 3));
    }
    public static ArrayList<Integer> dondur(ArrayList<Integer> arrayList,int x){
        for (int i = 0; i < x; i++) {
            arrayList.add(0,arrayList.get(arrayList.size()-1));
            arrayList.remove(arrayList.size()-1);

        }

      return arrayList;
    }
}
