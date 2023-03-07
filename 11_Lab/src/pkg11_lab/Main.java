
package pkg11_lab;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chung
 */
public class Main {

    public static void main(String[] args) {
        exerciseFive();
    }
    
    public static void exerciseOne(){
        Random randomGenerator = new Random();
        Double[] randomValues = new Double[100];
        Double sum = 0.0;

        for (int i=0; i<100; i++){
            randomValues[i] = randomGenerator.nextDouble();
            sum += randomValues[i];
        }

        System.out.println("Sum: " + sum);
    }

    public static char exerciseTwo() {
        Scanner scanner = new Scanner(System.in);

        int number = -1;

        while(number < 0 || number > 127){
            System.out.print("Input a number between 0 and 127: ");
            number = scanner.nextInt();

            if (!(number < 0) || !(number > 127)){
                scanner.close();
            }
        }
        return (char)number;
    }

    public static void exerciseThree() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first sentence: ");
        String sentence1 = scanner.nextLine();

        System.out.print("Input second sentence: ");
        String sentence2 = scanner.nextLine();

        String fullSentence = sentence1 + " and " + sentence2;

        System.out.println("\nFirst sentence: " + sentence1);
        System.out.println("Second sentence: " + sentence2);
        System.out.println("Full sentence: " + fullSentence);
        System.out.println("Lowercase: " + fullSentence.toLowerCase());
        System.out.println("Uppercase: " + fullSentence.toUpperCase());
        System.out.println("No space: " + fullSentence.replace(" ", ""));
        System.out.println("Snake case: " + fullSentence.replace(" ", "_"));
        System.out.println("From index 7 to 18: " + fullSentence.substring(7, 18));

        StringBuffer sb = new StringBuffer(fullSentence);
        System.out.println("Reverse: " + sb.reverse());
        scanner.close();
    }

    public static void exerciseFour() {
        String sentence = "Mary had a little lamb";

        System.out.println("First occurence of a is at: " + sentence.indexOf("a"));
        System.out.println("Last occurence of a is at: " + sentence.lastIndexOf("a") );
    }

    public static void exerciseFive() {
        Scanner scanner = new Scanner(System.in);
        String[] fruits = new String[10];

        for (int i = 0; i < 10; i++){
            System.out.print("Input #" + (i+1) + " fruit type: ");
            String fruit = scanner.nextLine();
            fruits[i] = fruit;
        }

        Arrays.sort(fruits);
        for (int i=0; i<fruits.length; i++){
            System.out.println(fruits[i]);
        }
        scanner.close();
    }
}
