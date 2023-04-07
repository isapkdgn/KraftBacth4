package day27_String_lab_Cont;

public class Tasks4_TekrarEdenHarfler {


    // kod hatalı calısmıyor

    public static void main(String[] args) {
        System.out.println(tekrarEdenHarfler("aabcccccseeeefff"));
    }

    public static String tekrarEdenHarfler(String str) {
        String result = "";
        while (!str.isEmpty()) {
            if (str.substring(0).contains(str.substring(0, 1))){
                result+=str.substring(0,1);
            }

        }
        return result;
    }
}
