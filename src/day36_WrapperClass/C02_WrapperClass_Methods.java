package day36_WrapperClass;

public class C02_WrapperClass_Methods {
    public static void main(String[] args) {
        //valueOf() int ve string ve cağrıldığı methoda göre değer cağrıyor

        String s="123";
        int x=Integer.valueOf(s);
        int y=x+5;
     //   System.out.println(y);

        //parseInt() parametre string alıyor int döndürüyor
        int z=Integer.parseInt("123");
     //   System.out.println("z "+z);

        int t=Integer.valueOf("123");
      //  System.out.println("t "+t);

        Integer t1=Integer.valueOf("123");
        int m=t1.intValue();
      //  System.out.println("m = " + m);

        /*String str="Bugün hava 40 derece";
       // hava sıcaklığı 10 derece artar ise hava sıcaklığı kac derece olur?

        String[] strArray=str.split(" ");
        System.out.println("strArray[2] = " + strArray[2]);

        int result=Integer.parseInt(strArray[2])+10;
        System.out.println(result);

         */
        String str="Bugün hava 40 derece;Bugün hava cok sıcak";
        // 40 ve üzerinde ise:"Bugün hava cok sıcak"
        // altında ise hava mevsim normallerinde

        int havaSicakligi=Integer.parseInt(str.split(" ")[2]);

        String expectedResult1="Bugün hava cok sıcak";
        String expectedResult2="Bugün hava mevsim normallerinde";
        String actualResult=str.split(";")[1];
        if (havaSicakligi>=40){
            System.out.println(expectedResult1.equalsIgnoreCase(actualResult));
        }else{
            System.out.println(expectedResult2.equalsIgnoreCase(actualResult));
        }

        // "Ali'nin doğum yılı 1996" ise 10 yıl sonra ali kac yaşında olur?
        // Ali 37 yaşında olur.

        String str1="Ali'nin doğum yılı 1996";
        String [] strArray=str1.split("'");
        String name=strArray[0];
        String[] strArrayYil=str1.split(" ");
        String yil=strArrayYil[strArrayYil.length-1];
        int onYİlSonrakiYasi=2023-Integer.parseInt(yil)+10;
        System.out.println(name+" "+onYİlSonrakiYasi+" yasinda olur");




    }
}
