
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        exercise3();
    }

    public void arrayDeclarationAndInitialization(){
        int[] declarationMethod1;
        int declarationMethod2[];

        int[] initializationMethod1 = new int[5];
        int[] initializationMethod2 = {1, 2, 3, 4, 5};
    }

    public static void exercise1(){
        /*
         * Write a program to count even and odd number in an array.
         */

        int number_ls[] = {35, 28, 46, 71, 80, 58};
        int even = 0, odd = 0;

        for (int i = 0; i < number_ls.length; i++){
            if (number_ls[i] % 2 == 0) //even number
                even++;
            else
                odd++;
        }

        System.out.println("The array contains: " + Arrays.toString(number_ls));
        System.out.println("There are " + even + " even and " + odd + " odd numbers in the array.");
    }

    public static void exercise2(){
        System.out.println();
        int[] numbers = {75, 49, 30, 83, 203, 102};

        System.out.print("Numbers: ");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
            if (i < (numbers.length-1))
                System.out.print(", ");
            else
                System.out.println();  
        }

        Arrays.sort(numbers);
        System.out.println("Smallest: " + numbers[0]);
        System.out.println("Largest: " + numbers[numbers.length-1]);
        System.out.println();
    }

    public static void exercise3() {
        /*
         * Write a program by declaring 2 arrays with same size and calculate the sum of product of the arrays.
         * 
         */
        
        int[] list1 = {26, 3, 14, 8, 10};
        int[] list2 = {11, 28, 24, 30, 12};

        int[] product = new int[list1.length];

        for (int i = 0; i < list1.length; i++)
            product[i] = list1[i] * list2[i];
        
        int sumOfProducts = 0;

        for (int i = 0; i < list1.length; i++)
            sumOfProducts += product[i];
        
        
        
        System.out.println("Sum of product = " + sumOfProducts);

    }

    public static void exercise6() {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter string: ");
        String word = keyboardInput.nextLine();

        System.out.print("To Upper Case (U)/ To Lower Case (L): ");
        String choice = keyboardInput.nextLine();

        if (choice.equals("U"))
            toCapitalLetter(word);
        else if (choice.equals("L"))
            toLowerLetter(word);
        else
            System.out.println("invalid input.");
        keyboardInput.close();
    }

    public static void toCapitalLetter(String word) {
        System.out.println(word.toUpperCase());
    }

    public static void toLowerLetter(String word) {
        System.out.println(word.toLowerCase());
    }
}
