package day27_String_Example;

public class Tasks_HarflerinBasınaRakamYaz {
    public static void main(String[] args) {
        System.out.println(harfSayilariniBaslarinaYaz("merhaba"));
    }
    public static String harfSayilariniBaslarinaYaz(String str) {
        str=str.toLowerCase().replace(" ","");
        String result = "";
        int count;
        for (int i = 0; i < str.length(); i++) {
            String harf = str.substring(i, i + 1);
            count = str.length() - (str.replace(harf, "").length());
            if (!result.contains(harf)) {
                result += count + harf;
            }

        }
        return result;
    }
}
