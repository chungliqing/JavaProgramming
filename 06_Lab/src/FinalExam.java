public class FinalExam {
	//global variable
	private String name;
	private double quiz1, quiz2, quiz3;
	private double sum, avg;

	public void setName(String name){
		//function parameter
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void printMessage() {
		System.out.println("Hi, " + name);
	}

	public void setQuiz1(double quiz1) {
		this.quiz1 = quiz1;
	}

	public double getQuiz1() {
		return quiz1;
	}

	public void setQuiz2(double quiz2) {
		this.quiz2 = quiz2;
	}

	public double getQuiz2() {
		return quiz2;
	}

	public void setQuiz3(double quiz3) {
		this.quiz3 = quiz3;
	}

	public double getQuiz3() {
		return quiz3;
	}

	public double getAverageMarks() {
		sum = quiz1 + quiz2 + quiz3;
		return sum/3;
	}
	
	public void printAverage(){
		System.out.println("Your final result is: " + getAverageMarks());
	}
}
