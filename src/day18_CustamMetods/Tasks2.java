package day18_CustamMetods;

public class Tasks2 {
    public static void main(String[] args) {

        takeThePowerNumbers(5,6);
        addTwoDigit(15,32);
    }
    public static void takeThePowerNumbers(int x,int y){

        int result=(int)Math.pow(y,x);
        System.out.println("result: "+y+" above "+x+ " = "+result);
    }public static void addTwoDigit(int x,int y) {
        int result = x + y;
        System.out.println(x + "+" + y + "=" + result);
    }












}
