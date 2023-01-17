public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.number1 = 5;
        calculator.number2 = 7;
        int sum = calculator.getAddition();
        System.out.println(sum);
        
    }

    
}

/*
 * one program should have only 1 public class
 */
