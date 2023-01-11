import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        var col = new Collection();
		int[] numbers = col.readNumbers();
		col.echoArray(numbers);

    }
}
//System.out.println(Arrays.toString(numbers)); (return str rep of array's value);