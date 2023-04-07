package day29_FullReview;

public class C05_FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println(freq("AAABBBC", 'A'));
    }


    public static int freq(String str, char ch){
        int freq=0;
        for (int i = 0; i <str.length() ; i++) {
            char eachChar=str.charAt(i);
            if (eachChar==ch){
                freq++;
            }
        }


       return freq;
    }






}
/*/Write a method that can return the frequency of a char from a String

        Ex:
        str = "AAABBBC" ch = 'A'

        Output:
        3/

 */