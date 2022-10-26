package day05_operators;

public class RelationalOperators {

    public static void main(String[] args) {


      int a = 100;
      int b = 200;

        // System.out.println( a > b );
        boolean aIsGreater = a > b;

        System.out.println(aIsGreater);


        int score = 60;

        boolean passed = score >= 60;   // use >= if it is equal or greater for ex.

        System.out.println(passed);

        int age = 35;

        boolean eligibleToDrink = age >= 21;

        boolean eligibleToVote = age >= 18;

      System.out.println(eligibleToVote);

      System.out.println("-------------------------------------------------------");

      score = 48;

      boolean failed = score < 60;

      System.out.println(failed);

      System.out.println("------------------------------------------------------");


      System.out.println(1000 < 10000);  // true

      System.out.println("------------------------------------------");

      System.out.println( 95 <= 100);  // true

      System.out.println( 100 <= 100); // true

      System.out.println("------------------------------------------");

      // System.out.println("Java" <= "C#"); // >, <, <=, >= can only be applicable for numbers

      System.out.println( 'a' > 'b');
      //                  65  >  66



      System.out.println();












    }



}
