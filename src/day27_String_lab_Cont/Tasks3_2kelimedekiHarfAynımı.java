package day27_String_lab_Cont;

public class Tasks3_2kelimedekiHarfAynımı {
    // code yanlış
    public static void main(String[] args) {
        System.out.println(ikiKelimeAynıHarfmi("iftarr", "tarifr"));

    }

    public static boolean ikiKelimeAynıHarfmi(String str1, String str2){
        str1=str1.toLowerCase();//büyük küçük harf ayrımından kurtarmak için
        str2=str2.toLowerCase();//büyük küçük harf ayrımından kurtarmak için
        if(str1.length()==str2.length()){//uzunluklar eşit değilse zaten gerisine bakmaya gerek yok
            String control="";//char değeri stringe atayaııp contains'se sokmak için
            for (int i = 0; i < str1.length(); i++) {//her harfi kontrol için var mı diye
                control+=str2.charAt(i);
                if(str1.contains(control)){//herdöngüdeki harf var mı diye kontrol ediyor varsa
                    return true;
                }

            }
        }return false;//yoksa
    }



}


