package day27_String_Example;

public class SORU20 {
    public static void main(String[] args) {
        System.out.print(tekrarEdenHarfler("aabcccseeeeefff"));
    }

    public static String tekrarEdenHarfler(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            String ch = ""+str.charAt(i);
            if (!result.contains(ch)) {
                result += ch;
            }

        }
        return result;
    }
}