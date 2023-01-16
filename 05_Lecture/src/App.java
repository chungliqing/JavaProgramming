import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        /*var col = new Collection();
		int[] numbers = col.readNumbers();
		col.echoArray(numbers);*/
        sortNumbersInAscendingOrder();

        


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
}
//System.out.println(Arrays.toString(numbers)); (return str rep of array's value);