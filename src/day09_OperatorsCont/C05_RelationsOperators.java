package day09_OperatorsCont;

public class C05_RelationsOperators {
    public static void main(String[] args){


        boolean result1=(60>40);
        System.out.println("result1 = " + result1);
        boolean result2=(200>=200);
        System.out.println("result2 = " + result2);

        boolean result3=(200>=300);
        System.out.println("result3 = " + result3);
        System.out.println("--------------------------------------");
        // findexScore of 1500
        int findexScore =1650;

        boolean isEligileForloan=(findexScore >=1500);
        System.out.println("isEligileForloan = " + isEligileForloan);

        boolean result4=100<200;
        System.out.println("result4 = " + result4);
        boolean result5=300<200;
        System.out.println("result5 = " + result5);


        int score=75;
        boolean hasFailed=score <=59;
        System.out.println("hasFailed = " + hasFailed);

        boolean result6=45<=60;
        System.out.println("result6 = " + result6);

        System.out.println("--------------------------------------");

        int x=100;
        int y=200;
        boolean isEquel= x==y;
        System.out.println("isEquel = " + isEquel);

        boolean result7="ihsan"=="ahmet";
        System.out.println("result7 = " + result7);

        boolean result8= 'A'=='a';
        System.out.println("result8 = " + result8);

        boolean result9= "java"=="java";
        System.out.println("result9 = " + result9);
        System.out.println("--------------------------------------");

        boolean result10= 100 !=200;
        System.out.println("result10 = " + result10);

        boolean result11=200 !=200;
        System.out.println("result11 = " + result11);

        boolean result12="java" != "zor";
        System.out.println("result12 = " + result12);

    }
}
