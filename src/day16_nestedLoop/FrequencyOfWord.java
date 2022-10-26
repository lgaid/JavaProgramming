package day16_nestedLoop;

public class FrequencyOfWord {


    public static void main(String[] args) {

        String sentence = "Java Java Java Java ";
        String word = "Java";

        int count = 0;

        while (sentence.contains(word)){
            count++;
            sentence.replaceFirst(word, ""); // "Java Java Java


        }

        System.out.println(count);

/*          // example with lowercase


        String sentence = "java JAVA jAvA JAva";
        String word = "Java";

        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        int count = 0;

        while(sentence.contains(word)){
            count++;
            sentence = sentence.replaceFirst(word, ""); //
        }


        System.out.println(count);
*/

    }


}
/*
3.  Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"

		    output:
		        4

		        // "Java Java Java Java"; count = 0;
		        "Java Java Java"; count = 1;
		        "Java Java "; count = 2;
		        "Java"; count = 1;

 */