package day34_abstraction.carTask;


public class TestCarObjects {


    public static void main(String[] args) {



        Honda honda = new Honda("Civic","Black",2019,35000 );

        Audi audi = new Audi("Q3","White",2020,45000);

        Tesla tesla = new Tesla("Roadster","Red",2023,100000);

        System.out.println(honda);
        System.out.println(tesla);
        System.out.println(audi);

        System.out.println("---------------------------------------------------");

        honda.stop();
        audi.stop();
        tesla.stop();

        System.out.println("---------------------------------------------------");

        honda.start();
        audi.start();
        tesla.start();

        System.out.println("---------------------------------------------------");

        audi.autoPark();
        tesla.autoPilot();


    }


}
