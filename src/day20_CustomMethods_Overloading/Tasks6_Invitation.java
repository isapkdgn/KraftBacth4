package day20_CustomMethods_Overloading;

import java.util.Scanner;

public class Tasks6_Invitation {
    public static void main(String[] args) {
        invitation();

    }

    public static void invitation(){
        Scanner scan =new Scanner(System.in);

        System.out.println("Please enter a word");
        String word1= scan.nextLine();
        System.out.println("Please enter a world");
        String word2= scan.nextLine();

        if (word2.equals(word1)){
            System.out.println("Enter the same words.Please enter different words");
            invitation();
        }else {
            System.out.println("***"+word1+" & "+word2+"***");
        }

    }
}
