package day34_abstraction.animalTask;

public interface Playable {


    boolean isFriendly = true; // static and final automatically

  /*
    public static void main(String[] args) {
        System.out.println(isFriendly);
    }


    public default void method1(){

    }


   */

    void play();  // automatically abstract and public

}
