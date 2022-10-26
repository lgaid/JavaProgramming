package day30_inheritance.PhoneTask;

public class TestPhoneObjects {

    public static void main(String[] args) {


        IPhone iPhone = new IPhone("Iphone 12", "large","White",900);
        Samsung samsung = new Samsung("Galaxy","Medium","Pink", 900 );
        Nokia nokia = new Nokia("G11","small","Black",500);


        System.out.println(iPhone);
        System.out.println(nokia);
        System.out.println(samsung);
        
        
        


    }



}
