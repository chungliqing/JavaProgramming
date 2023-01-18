public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.number1 = 5;
        calculator.number2 = 7;
        int sum = calculator.getAddition();
        int difference = calculator.getDifference();
        int product = calculator.getProduct();
        int quotient = calculator.getQuotient();

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        calculator.thanks();
        
    }

    
}

/*
 * one program should have only 1 public class
 */
