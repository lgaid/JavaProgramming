package day35_polymorphism.transportation;

public class Audi extends Car implements Autopark {


    public Audi(String make, String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }



    @Override
    public void autoPark() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }




}
/*
7. Create a subclass of car named Audi that implements AutoPark

 */
