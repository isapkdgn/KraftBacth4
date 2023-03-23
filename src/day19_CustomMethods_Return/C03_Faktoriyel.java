package day19_CustomMethods_Return;

public class C03_Faktoriyel {
    public static void main(String[] args) {
       // System.out.println("faktiyelHesapla(4) = " + faktiyelHesapla(4));
        int sonuc=faktiyelHesapla(4);
        System.out.println("sonuc = " + sonuc);
    }
    // verdigimiz bir sayinin faktoryelini hesaplayip
    // sonucu bize donduren bir method olusturun
    /* method olusturma aşamaları
    1* puplic static (standart)
    2. oluşturscağımız method bize bir sonuc dondurrecekse data tipini belirtmek gerekiyor
    3,method adi
    4,methodun parantezi() parametre olup olmayacaği ve parametre data tipleri veisimleri parantez yazılr
     */
    public static int faktiyelHesapla(int sayi){
        int faktoriyel=1;
        for (int i=1; i<=sayi;i++){
            faktoriyel*=i;
        }
        return faktoriyel;
    }




}
