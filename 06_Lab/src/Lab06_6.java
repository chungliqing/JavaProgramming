import java.util.Scanner;

public class Lab06_6 {

	public final static char lowerLetters[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
								'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 
								'u', 'v', 'w', 'x', 'y', 'z'};
		
	public final static char upperLetters[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 
								'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
								'U', 'V', 'W', 'X', 'Y', 'Z'};

	//final static char choices[] = {'U', 'L', 'S'};


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char status = ' ';
		String str;
		toLowerLetter("HI");
		

		while (true){
			System.out.println("\n'U' to turn a string into uppercase.");
			System.out.println("'L' to turn a string into lowercase.");
			System.out.println("'S' to quit program.\n");

			System.out.println("Input choice: ");
			status = input.next().charAt(0);

			if (status == 'S'){
				break;
			}else if (status == 'U' || status == 'L'){
				System.out.println("Input string: ");
				str = input.next();
					if (status == 'U') {
						toUpperLetter(str);
					}else if (status == 'L'){
						toLowerLetter(str);
					}
			}else
				System.out.println("Invalid");
		}
	}

	public static void toLowerLetter(String statement) {
		String result = "";

		for (int i = 0; i < statement.length(); i++){
			boolean status = false;
			for (int j = 0; j < upperLetters.length; j++){
				if (statement.charAt(i) == upperLetters[j]){
					result += lowerLetters[j];
					status = true;
					break;
				}
			}
			
			if(status == false)
				result += statement.charAt(i);
		}
		
		System.out.println(result);
	}
	

	public static void toUpperLetter(String statement) {
		String result = "";

		for (int i = 0; i < statement.length(); i++){
			boolean status = false;

			for (int j = 0; j < upperLetters.length; j++){
				if (statement.charAt(i) == lowerLetters[j]){
					result += upperLetters[j];
					status = true;
					break;
				}
			}

			if(status == false)
				result += statement.charAt(i);
		}
		
		System.out.println(result);
	}
}