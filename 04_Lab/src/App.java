
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        
        exerciseFour();
        
    
    }

    public static void exerciseOne() {

        for (int a = 0; a < 5; a++){
            for (int b = 0; b < 5; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void exerciseTwo() {
        int sum = 0;

        for (int i = 1; i < 501; i++){
            sum += i;
        }

        System.out.println(sum);
        
    }

    public static void exerciseThree() {
        Scanner keyboardInput = new Scanner(System.in);
        
        System.out.print("Enter number of lines: ");
        int num = keyboardInput.nextInt();

        for (int i = 1; i <= num; i++){
            if (i % 2 != 0){
                for(int j = 0; j < 5; j++){
                    System.out.print("*");
                }
                System.out.println();
            }else{
                for(int j = 0; j < 5; j++){
                    System.out.print("+");
                }
                System.out.println();
            }
        }
    }

    public static void exerciseFour() {
        Scanner keyboardInput = new Scanner(System.in);
        String choice = "n";

        do {
            System.out.print("\nPlease key in your first number: ");
            int num1 = keyboardInput.nextInt();
            System.out.print("Please key in your second number: ");
            int num2 = keyboardInput.nextInt();

            System.out.println("Sum = " + (num1 + num2));

            do{
                System.out.print("Do you want to continue? Please choose yes=y or no=n: ");
                choice = keyboardInput.next();

                if (choice.equals("y") || choice.equals("n")){
                    break;
                }else{
                    System.out.println("Invalid choice.");
                }
                
            }while (!choice.equals("y") || !choice.equals("n"));
                    
        }while(choice.equals("y"));
    
        System.out.println("Thank you for using the system!");      
    }
    
    public static void exerciseFive() {
        Scanner keyboardInput = new Scanner(System.in);

        
        
    }
}
