package day08_ScannerAndOperators;

public class C01_nonPrimitiveDataTpyes {
    public static void main(String[] args) {

        String fullName="Ali OZTURK";

        String firstLetter="A";
        char fisrtLetter2='B';
        // primitive data türünde variable lar sadace data taşıyor
        //nonprimitive data turunde hem deger tasıyor hem de metadları var

        System.out.println(firstLetter.toLowerCase());

        String metin="alllllassasasasasşşaşllaşşalu"+"ghjkşşkşşşşşşş\n" +
                "şşşşşşş"+fullName+"alllşşşılmşjf" +
                "ggllşllklişşşşşş\n"+firstLetter+"hkşliş"+fisrtLetter2;
        System.out.println("metin = " + metin);


        String not="not";
        String Not="Variable isimlerine buyuk harfle baslamak tavsiye edilmez ama java kabul eder";
        String nOT="bir kere declare ettiğim  bir tekrar declare edemiyorum";
        String noT="ama isimler farklı olursa java bunları farklı değişkenler olarak kabul eder";

        //name convention: degisken isimleri kucuk harfle baslar sonraki kelimeler bitişik ve buyuk harfle olur
        // fullName, firstName, ogrenciAdi, okulNumarasi;
        //camelCase
        // CamelCase classlarda bu şekilde kullanıyoruz.
    }
}
