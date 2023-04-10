package day30_Review;

public class C07_FrequensyOfWord {
    public static void main(String[] args) {
        System.out.println(frequencyOfWord("javajavajavapythonCcc++java", "java"));
    }

    public static int frequencyOfWord(String sentence,String word){
        int freq=0;

        while (sentence.contains(word)){

        sentence=sentence.replaceFirst(word,"");
            freq++;
        }

       return freq;
    }
}
