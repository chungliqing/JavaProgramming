public class App {
    public static void main(String[] args) {
        displayContatenationOfStringAndInteger();
        displayTheResultByAddingTwo();
    }
    
    public static void firstJavaProgram() {
        System.out.println("Hello World");
    }

    public static void displayDifferentStatement() {
        System.out.println("This is one statement.");
        System.out.println("This is another statement.");
    }

    public static void displayNumber() {
        System.out.println(7);
    }

    public static void concatenateTwoDifferentStatements() {
        String statement1 = "I am Li Qing";
        String statement2 = "I am a female";

        System.out.println(statement1 + " and " + statement2 + ".");
    }

    public static void performCalculationOfAnyTwoNumbers() {
        int number1 = 7;
        int number2 = 7;

        System.out.println(number1 + number2);
    }

    public static void concatenateStringStatementAndNumber(){
        String ageStatement = "My age is ";
        int age = 23;

        System.out.println(ageStatement + age + ".");
    }

    public static void concatenateStringStatementAndPerformCalculationOfTwoNumbers() {
        String nameStatement = "My name is ";
        String ageStatement = "My age is ";
        String name = "Li Qing";
        int currentYear = 2023;
        int birthYear = 2000;

        System.out.println(nameStatement + name + ".\n" +
                            ageStatement + (currentYear-birthYear) + ".");
    }

    public static void methodsOfVariableDeclaration() {
        /*
         * Method 1: Declare Variable
             * <data type> <nameOfVariable>;
             * String name;
             * String name = "Li Qing";
         * Method 2: Initialize Variable with a value
             * <data type> <nameOfVariable> = <value>;  
             * int number1, number2;
             * number1 = 1; number2; 2
         */
    }

    public static void declareStringTypeVariable() {
        String name;
    }

    public static void declareTwoIntegerTypeVariables() {
        int number1; int number2;
    }

    public static void displayContatenationOfStringAndInteger() {
        String statement = "Welcome to Java Programming";
        int number1 = 1;
        
        System.out.println(statement + number1);
    }

    public static void displayTheResultByAddingTwo() {
        String statement = "Welcome to Java Programming";
        int number1 = 1;
        
        System.out.println(statement + (number1+2));
    }

    public static void concatenateStringAndResultOfTwoValues() {
        String statement = "The sum of 2 values is ";
        int num1 = 1;
        int num2 = 2;
        
        System.out.println(statement + ((num1+num2)+2));
    }

}

