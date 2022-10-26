package day18_garbageCollection;

import day17_customClass.Dog;

public class GarbageCollection {


    public static void main(String[] args) {


        String s1 = "Java";

        s1 = null; // "Java" is eligible for garbage collection

        //  System.out.println(s1.toUpperCase());
        //  System.out.println(s1.replace(null,"Python"));

        System.out.println("-------------------------------");


        String a = "";
        String b = null;


        System.out.println("----------------------------------");

        String str1 = "Python";
        str1 = "Cydeo";

        System.out.println(str1);

        System.out.println("---------------------------------------------");


        Dog dog1 = new Dog();
        dog1.setInfo("Max","Husky",'M',4,"Large","White");

        Dog dog2 = new Dog();
        dog2.setInfo("Bella", "Poodle",'M',4,"Large","gold");

        dog1 = dog2;

        //System.out.println(dog2);






    }


}
