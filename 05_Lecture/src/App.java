import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*var col = new Collection();
		int[] numbers = col.readNumbers();
		col.echoArray(numbers);*/
        //sortNumbersInAscendingOrder();
        System.out.println(findNumberFromArray());;



        


    }

    public static void sortNumbersInAscendingOrder() {
        int numbers[] = {100, 99, 98, 97, 96, 95};
        int original[] = Arrays.copyOfRange(numbers, 0, numbers.length);

        for (int i = 0; i < numbers.length-1; i++){
            for (int j = i+1; j < numbers.length; j++){
                if (numbers[j] < numbers[i]){
                    int temp[] = {numbers[i], numbers[j]};
                    numbers[i] = temp[1];
                    numbers[j] = temp[0];
                }
            }
        }

        System.out.println("Original:\n" + Arrays.toString(original));
        System.out.println(Arrays.toString(numbers));
    }

    public static int findNumberFromArray() {
        //available --> return the index of the number
        //unavailable --> return -1
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number to find: ");
        int userInput = input.nextInt();

        int numbers[] = {27, 12, 3, 18, 11, 7};
        
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == userInput){
                return i;
            }
        }
        return -1;
    }
}
//System.out.println(Arrays.toString(numbers)); (return str rep of array's value);