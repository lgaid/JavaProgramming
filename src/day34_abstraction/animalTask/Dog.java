package day34_abstraction.animalTask;

public class Dog extends Animal implements Playable {

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food");

    }


    @Override
    public void play() {
        System.out.println("Dog " + getName() + " is friendly and playful");
    }


    public void bark(){
        System.out.println("Dog " + getName() + " barks");
    }

}
