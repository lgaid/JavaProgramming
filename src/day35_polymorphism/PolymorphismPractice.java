package day35_polymorphism;

import day34_abstraction.animalTask.*;
import day35_polymorphism.transportation.*;

public class PolymorphismPractice {

    public static void main(String[] args) {


        Animal tiger = new Tiger("Sher","Begel",'M',5,"large","orange");

       // tiger.hunts();
        tiger.eat();
        tiger.drink();
        tiger.sleep();

        Animal animal = new Eagle("John","American Eagle",'M',3,"small","black");

        //animal.fly();
        animal.drink();
        animal.eat();
        animal.sleep();

       Flyable obj1 = new Eagle("John","American Eagle",'M',3,"small","black");

       Lion lion = null;

       Parrot parrot = null;

       Duck duck = null;

       Shark shark = null;

       Dolphin dolphin = null;

       Eagle eagle =  null;

       Cat cat = null;

       Dog dog = null;



       Flyable[] obj2 = { parrot, eagle};


        Swimmable[] fishes = { dolphin, shark, duck};

        Playable[] friendlyAnimal = {cat, dog,  duck};


        boolean isAnimal = dog instanceof Animal;


        System.out.println(isAnimal);

        Car car = new Tesla("MOdel y","Roadster","white",2020,45000);

        boolean isTesla = car instanceof Tesla;
        boolean isAudi = car instanceof Audi;

        boolean isElectric = car instanceof Electric;
        boolean hasAutoPark = car instanceof Autopark;
        boolean hasAutoPilot = car instanceof AutoPilot;


        System.out.println("isTesla = " + isTesla);
        System.out.println("isAudi = " + isAudi);
        System.out.println("isElectric = " + isElectric);
        System.out.println("hasAutoPark = " + hasAutoPark);
        System.out.println("hasAutoPilot = " + hasAutoPilot);





    }



}
