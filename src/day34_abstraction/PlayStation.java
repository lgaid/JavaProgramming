package day34_abstraction;

import day34_abstraction.animalTask.Playable;

public class PlayStation implements Playable {



    @Override
    public void play() {
        System.out.println( getClass().getSimpleName()+ " is playable");

    }

}
