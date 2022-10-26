package day34_abstraction;

import day34_abstraction.animalTask.Swimmable;

public class Boat implements Swimmable {


    @Override
    public void swim() {
        System.out.println(getClass().getSimpleName() + " is swimmable");
    }


}
