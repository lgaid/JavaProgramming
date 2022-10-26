package day35_polymorphism;

import day12_customMethods.Test;
import day31_inheritance.shape_methodOverriding.Circle;
import day32_finalKeyword.carTask_methodOverriding.*;
import day33_abstraction.employeeTask.*;
import day34_abstraction.animalTask.*;

import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", 'M', 4, "Small", "White");

        Cat cat = new Cat("Max", "Husky", 'M', 4, "Small", "White");

        Tiger tiger = null;

        Eagle eagle = null;

        Lion lion = null;

        Parrot parrot = null;

        Dolphin dolphin = null;

        Shark shark = null;

        Duck duck = null;


        Animal[] animals = {dog, cat, tiger, lion, eagle, parrot, dolphin, shark, duck};

        /// Animal animal = new Tesla("Model Y", "Blue", 2022, 60000);
        // there is not "IS A" relationship between Animal and Tesla

        Animal animal = new Dog("Max", "Husky", 'M', 4, "Small", "White");
        animal.eat();
        animal.drink();
        animal.sleep();

        //  animal.play();
        //  animal.bark();
        System.out.println("---------------------------------------------");


        String str = "Java";
        Integer n = 100;
        Boolean r = false;
        Double d = 10.5;

        Circle circle =  new Circle(4);

        Toyota toyota = new Toyota("Camry", "Blue", 2020, 25000);

        Honda honda = new Honda("Accord", "Gray", 2019, 24000);

        Audi audi = new Audi("Q6", "Silver", 2021, 50000);

        BMW bmw = new BMW("X6", "Black", 2017, 45000);

        Tesla tesla = new Tesla("Model 3", "White", 2022, 65000);



        Teacher teacher = new Teacher("James",36,'M',"A1","Math teacher",30000);

        Developer developer = new Developer("Lucy",44,'F',"A54","Java Developer",120000,"Java" );

        Driver driver = new Driver("Haley",26,'F',"Ad554","truck driver",65000);

        Tester tester = new Tester("Carl",50,'M',"B54","Java tester",120000);


        Object[] objects = {str,n,r,d,circle,honda,audi, tesla,bmw,teacher,developer,teacher,driver,};

        System.out.println(Arrays.toString(objects));

        Object[] employees = {teacher,developer,tester,driver};


        Employee obj = new Developer("Lucy",44,'F',"A198","Java Developer",150000,"Java");

        System.out.println("-----------------------------------------------------------");




    }
}
