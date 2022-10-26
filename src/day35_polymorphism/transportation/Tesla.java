package day35_polymorphism.transportation;

public class Tesla extends Car implements Autopark,AutoPilot,Electric{


    public Tesla(String make, String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel() + " is self drive");
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " has auto park");
    }

    @Override
    public void charge() {
        System.out.println(getMake() + " " + getModel() + " has charge");
    }

    @Override
    public void transportPeople() {
        System.out.println(getMake() + " " + getModel() + " can transport people");
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " has start button");
    }


}
/*

	8. Create a subclass of Car named Tesla that implements AutoPark, AutoPilot and Electric
 */
