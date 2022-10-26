package day34_abstraction.animalTask;

public class TestAnimalObjects {


    public static void main(String[] args) {


        Cat cat = new Cat("Bel","Brady",'F',4,"small","black");

        Dog dog = new Dog("Nalla","Golden Retriever", 'F',5,"Large","Gold");

        Parrot parrot = new Parrot("Pancho"," African Gray",'M',2,"medium","multicolor");


        System.out.println(cat);
        System.out.println(dog);
        System.out.println(parrot);


        cat.play();
        dog.play();
        parrot.fly();



    }



}
