package day34_abstraction;

import day34_abstraction.animalTask.Flyable;
import day34_abstraction.animalTask.Swimmable;

public class CydeoCar implements Swimmable, Flyable {


    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flyable");
    }

    @Override
    public void swim() {
        System.out.println(getClass().getSimpleName() + " is swimmable");
    }

}
