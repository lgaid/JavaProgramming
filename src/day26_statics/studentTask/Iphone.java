package day26_statics.studentTask;

public class Iphone {

    public static String brand = "Apple"; // static: all iphone objects brand is apple

    public String model; // instance: diff. models for iphone
    public String color;
    public int price;
    public static String Os = "iOS"; // Static: operating system is the for all iphones
    public static String madeIn = "China";

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean isExpensiveToFix = true;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    /*
        public static void printPhoneInfo(){  // static only accepts statics
            System.out.println("Model: " + model);
        }


     */
    public void printPhoneInfo(){
        System.out.println("brand = " + brand);
        System.out.println("model = " + model);
        System.out.println("color = " + color);
        System.out.println("price = " + price);
    }


    public static void printOperatingSystem(){

        System.out.println("Operating System: " + Os);
    }


}
/*
Attributes:
brand, model, color, price, OS, madeIn,hasBattery,isTouchScreen,isExpensiveToFix
 */