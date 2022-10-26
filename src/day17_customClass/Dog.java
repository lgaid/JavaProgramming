package day17_customClass;

public class Dog {

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", color='" + color + '\'' + '}';


        }


    public String name; // instance variables
    public String breed;
    public String size;
    public int age;
    public char gender;
    public String color;

    // new*         // "Max"         "Husky"           "M"      "4"     "small"     "White"
    public void setInfo(String name,String breed,char gender, int age,String size, String color){
        name = name;
        this.name =name;
        this.breed = breed;
        this.gender= gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public void eat() {
        System.out.println(name + "is eating");

    }

    public void drink() {

        System.out.println(name + "is drinking water");
    }

    public void play() {

        System.out.println(name + "is playing");
    }

    public void gender() {

        System.out.println(name + "is a female");



    }


}