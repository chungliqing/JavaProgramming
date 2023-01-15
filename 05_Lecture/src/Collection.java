import java.util.Scanner;

public class Collection{
	int arraySize;

	public Collection(){

	}

	public int[] readNumbers(){
		Scanner keyboardInput = new Scanner(System.in);
	
		int[] numbers = new int[10];
	
		System.out.println("Input 10 Number: ");
	
		for (int i = 0; i < 10; i++){
			numbers[i] = keyboardInput.nextInt();
		}
	
		keyboardInput.close();

		return numbers;
	}

	public void echoArray(int[] arrayName) {
		for (int i = 9; i >= 0; i--)
		System.out.print((arrayName[i]) + " ");
	}
}