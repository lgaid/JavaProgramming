package day34_abstraction.carTask;

public class Honda extends Car {


    public Honda(String model, String color, int year, int price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Twist and turn the key into the ignition to start " + getMake()+ " " + getModel() );
    }


}
