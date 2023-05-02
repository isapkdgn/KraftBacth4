package day43_InheritanceAndKeywords;

public class Motorcycle extends Vehicle{

    private int cc;
    public Motorcycle(){}
    public  void changeCc(int yeniCc){
       this.cc=yeniCc;
    }
    public int getCc(){
        return cc;
    }
    public void start(){
        System.out.println("motor calisti");
    }
    public static Motorcycle motorsikletOlustur(){


        return new Motorcycle();
    }
}
