package day27_String_lab_Cont;

public class Tasks2 {
    public static void main(String[] args) {
        System.out.println(vucudKitleEndeksi(120, 180));
    }
    public static String vucudKitleEndeksi(int kilo,int boy ){
        int result=((kilo*10000)/(boy*boy));
        String str="";
        if (result>30){
            str= "obez";

        } else if (result>=25) {
            str= "kilolu";
        } else if (result>=20) {
            str= "normal";
        }else if (result<20){
            str= "zayıf";
        }
        return str;
    }
    }
