package day26_statics;

import day26_statics.studentTask.Iphone;

public class TestIphoneObjects {

    public static void main(String[] args) {


        Iphone iPhone = new Iphone("iPhone12","Black", 1000);

        System.out.println(iPhone.model);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);

        iPhone.printPhoneInfo();
/*
        System.out.println( iPhone.brand );
        System.out.println(iPhone.Os);
        iPhone.printOperatingSystem();


 */
        System.out.println(Iphone.brand);
        System.out.println(Iphone.Os);
        Iphone.printOperatingSystem();
       

        //System.out.println(Iphone.);


    }



}
