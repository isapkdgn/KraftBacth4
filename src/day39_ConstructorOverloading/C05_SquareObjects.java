package day39_ConstructorOverloading;

public class C05_SquareObjects {
    public static void main(String[] args) {
        Square square1=new Square(15);
        System.out.println("square1.calculateArea() = " + square1.calculateArea());
        System.out.println("square1.calculatePerimeter() = " + square1.calculatePerimeter());
    }
}
