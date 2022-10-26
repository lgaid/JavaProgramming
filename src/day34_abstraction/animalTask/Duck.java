package day34_abstraction.animalTask;

public class Duck extends Animal implements Swimmable, Playable {


    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " " + " is eating worms");
    }


    @Override
    public void swim() {
        System.out.println("Duck " + getName() + " " + canSwim);
    }


    @Override
    public void play() {
        System.out.println("Duck "+ getName() + " "+ " ia playable");
    }
}
