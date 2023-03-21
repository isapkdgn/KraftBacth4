package day04_VariableCont;

public class NarrowingCasting {
    public static void main(String[] args) {


        double rate=3.9;

        int num=10;
        num =(int) rate;    //double tipinde 3.9 sayisini int tipine dönüştür diye talimat verdik
                            // type donusumu manuel casting deniyor
        System.out.println(num);
    }
}
