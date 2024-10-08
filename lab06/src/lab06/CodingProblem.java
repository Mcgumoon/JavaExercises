package lab06;

public class CodingProblem extends Problem{
	private String programmingLanguage;
	
	public CodingProblem() {
		
	}
	
	public CodingProblem(int input, String output, String algorithm, String programmingLanguage) {
		super(input, output, algorithm);
		this.programmingLanguage = programmingLanguage;
	}
	
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}
	
	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	
	@Override
	public boolean isHard() {
		return true;
	}
	
	@Override
	public String howToSolve() {
		return "Write a " + programmingLanguage + " language";
	}
	
	@Override
	public String getFinalAnswer() {
		return "Eureka!";
	}
	
	@Override
	public String toString() {
		return "Problem \n[input = " + getInput() + ", output: " + 
				getOutput() + ", algorithm: " + getAlgorithm() + ", isHard() = " + isHard() +
				"]\n" + " programmingLanguage is : " + programmingLanguage + ", HowToSolve: " + howToSolve() + 
				" ] \n " + getFinalAnswer();
	}
	
	public static void main(String[] args) {
		int number = (int)(Math.random() * 100);
		
		 Problem codingproblem1 = new CodingProblem(number,"Your lucky number is " + number, "randomization", "Python");
		 Problem mathproblem1 = new MathProblem(number, "It's square is: " + number, "randomization", 30);
		 
		 System.out.println(codingproblem1.toString());
		 System.out.println(mathproblem1.toString());
	}
}
