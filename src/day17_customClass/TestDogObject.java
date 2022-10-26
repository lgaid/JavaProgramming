package day17_customClass;

public class TestDogObject {

    public static void main(String[] args) {


        Dog dog1 = new Dog();

        dog1.name = "Max";
        dog1.breed = "Husky";
        dog1.size = "Large";
        dog1.color = "White";
        dog1.gender= 'M';
        dog1.age = 4;

        dog1.setInfo("Max","Husky",'M',4,"Large","White");

        Dog dog2 = new Dog();

        dog2.name = "Loki";
        dog2.breed = "Golden Retriever";
        dog2.size = "Small";
        dog2.color = "Orange";
        dog2.gender= 'F';
        dog2.age = 2;



        Dog dog3 = new Dog();
        dog3.setInfo("Bella", "Poodle",'M',4,"Large","gold");

        Dog dog4 = new Dog();
        dog4.setInfo("Nalla","poodle",'f',5,"Large","grey");



        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);



    }



}
