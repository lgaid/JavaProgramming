package day34_abstraction.animalTask;

public class Shark extends Animal implements Swimmable {

    public Shark(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " " + " is eating fish");
    }


    @Override
    public void swim() {
        System.out.println("Shark " + getName() + " " + canSwim);
    }

}
