package day29_inheritance.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max","Husky",'M',4,"Large","White"  );
        Cat cat = new Cat();
        cat.setInfo("Felicia","Mutt",'F',3,"Medium","black");
        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal",'M',5, "large","Orange");


        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("-----------------------------------");


        dog.eat();
        dog.sleep();
        dog.drink();

        System.out.println("------------------------------");


        dog.bark();
        cat.meow();
        tiger.hunt();



    }


}
