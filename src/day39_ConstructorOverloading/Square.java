package day39_ConstructorOverloading;

public class Square {
    public double length;


    public Square(double length){
        this.length=length;
    }
    public double calculateArea(){
        return length*length;
    }
    public double calculatePerimeter(){
        return 4*length;
    }
    public String toString(){
        return "Square{"+
                "length='"+length+"'"+
                "area='"+calculateArea()+
                "perimeter='"+calculatePerimeter()+"'}";




    }
}
