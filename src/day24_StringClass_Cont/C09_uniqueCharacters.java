package day24_StringClass_Cont;

public class C09_uniqueCharacters {
    public static void main(String[] args) {
        String str="abccfff";

        String result="";   //bd

        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);  // aif
            if (str.indexOf(ch)==str.lastIndexOf(ch)){
                result+=ch;
            }
        }
        System.out.println(result);


    }
}
