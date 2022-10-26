package day36_polymorphism;

public class TestEqualMethod {


    public static void main(String[] args) {



        Circle circle1 = new Circle(5);

        Circle circle2 = new Circle(5);

        Circle circle3 = new Circle(15);

        System.out.println(circle1 == circle2); // false

        System.out.println( circle1.equals(circle2) ); // true

        System.out.println (circle1.equals(circle3) );  // false

        System.out.println("-----------------------------------------------------------");


        IPhone iPhone1 = new IPhone("Apple","Iphone 12","Medium","Black",900);

        IPhone iPhone2 = new IPhone("Apple","Iphone 12","Medium","White",900);

        System.out.println(iPhone1.equals(iPhone2));


        System.out.println("---------------------------------------------");


        Square square1 =new Square(2.5);

        Square square2 = new Square(5.2);

        System.out.println(square1.equals(square2));





    }


}
