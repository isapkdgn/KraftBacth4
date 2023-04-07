package day29_FullReview;

public class C01_CustomMethodsVoid {
    public static void main(String[] args) {
        oddOrEven(5);
        ageOfPerson(1984);
        printNumber(10,20);
    }


    public static void oddOrEven(int num){
       if (num%2==0){
           System.out.println(num+" is an Even number");
       }else {
           System.out.println(num+" is a Odd number");
       }
    }
    public static void ageOfPerson(int birthYear){
        int age=2023-birthYear;
        System.out.println("your age is "+age);
    }
    public static void printNumber(int x,int y){
        for (int i=x+1;i<y;i++){
            System.out.print(i+" ");
        }
    }


}
