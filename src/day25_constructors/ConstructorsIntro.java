package day25_constructors;

public class ConstructorsIntro {

    public ConstructorsIntro(){

        System.out.println("Object is created by using the default constructor");
    }

   public ConstructorsIntro(int a){
       System.out.println("Object is created by using the default constructor");

       ConstructorsIntro obj1 = new ConstructorsIntro(10);

       ConstructorsIntro obj2 = new ConstructorsIntro(10);

       ConstructorsIntro obj3 = new ConstructorsIntro(10);

   }


    public void add(){

    }


    public static void main(String[] args) {

      ConstructorsIntro obj = new ConstructorsIntro(10);

      ConstructorsIntro obj1 = new ConstructorsIntro();

      //ConstructorsIntro obj2 = new ConstructorsIntro("Java");

    }


}
