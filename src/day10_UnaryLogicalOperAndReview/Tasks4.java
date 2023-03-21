package day10_UnaryLogicalOperAndReview;

public class Tasks4 {
    public static void main(String[] args) {
         int age=20;
         String healt="healty";
         boolean toBeSoldier=age>=20&&healt=="healty";
        System.out.println("toBeSoldier = " + toBeSoldier);

        boolean tobesolcier1=age==22 && healt=="healty" || age>19 && healt=="poorly";
        System.out.println("tobesolcier1 = " + tobesolcier1);

    }
}
