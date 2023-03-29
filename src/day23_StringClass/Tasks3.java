package day23_StringClass;

public class Tasks3 {
    public static void main(String[] args) {


        String str="     iyi günler    ";
        System.out.println("str.trim() = " + str.trim());

        String str1="18/10/2022 20:50:55";
        System.out.println(str1.replaceAll("/", ""));
        String str2= str1.replaceAll("/","");
        System.out.println(str2.replace("22 20:50:55", "19145055"));


    }
}
