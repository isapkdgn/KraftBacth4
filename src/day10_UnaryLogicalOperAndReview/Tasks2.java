package day10_UnaryLogicalOperAndReview;

public class Tasks2 {
    public static void main(String[] args) {

        int i=10;

        i=--i+ ++i + --i + i++;
        System.out.println(i);
        i=i++ + i-- * -i++ * --i;
        System.out.println(i);



    }
}
