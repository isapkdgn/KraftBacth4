package day27_String_Example;

public class Tasks_ilkBensersizHarf {
    public static void main(String[] args) {
        System.out.println(ilkBenzerSizHarfiBul1("Merhaba"));
    }
    public static String ilkBenzerSizHarfiBul1(String str){
        str=str.toLowerCase().trim().replace(" ","");
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            if (str.indexOf(str.substring(i,i+1))==str.lastIndexOf(str.substring(i,i+1))){
                result=str.substring(i,i+1);
                break;
            }
        }return result;
    }
}
