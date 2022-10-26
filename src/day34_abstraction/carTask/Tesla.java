package day34_abstraction.carTask;

public class Tesla extends Car {

    public Tesla(String model, String color, int year, int price) {
        super(model, color, year, price);
    }


    @Override
    public void start() {
        System.out.println(" Use the voice to start " +  getMake() + " " + getModel());
    }


    public void autoPilot(){
        System.out.println(getMake() + " " + getModel() + " has auto pilot feature");
    }

}
/*
3. Tesla
					extra methods:
						autoPilot()
 */
