package day27_String_Example;

public class Tasks_EnCokHarf {
    public static void main(String[] args) {
        System.out.println(enCokOlanHarfiDondur("Merhaba"));
    }
    public static String enCokOlanHarfiDondur(String str) {
        str=str.toLowerCase().replace(" ","");
        String result = "";
        int count;
        int sayi=0;
        for (int i = 0; i < str.length(); i++) {
            String harf = str.substring(i, i + 1);
            count = str.length() - (str.replace(harf, "").length());

            if (count>sayi  && !result.contains(harf)){
                result= harf;
                sayi=count;
            }

        }
        return result;
    }
}
