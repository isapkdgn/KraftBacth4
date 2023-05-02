package day43_InheritanceAndKeywords;

public class Daire  extends Sekiller{

   protected   int degisken=10;

    public int alanHesapla(){

        return (int)(super.yaricap*pi*super.yaricap);
    }

}
