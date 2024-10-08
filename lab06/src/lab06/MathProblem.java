package lab06;

public class MathProblem extends Problem{
	private int difficultyLevel;
	
	public MathProblem() {
		
	}
	
	public MathProblem(int input, String output, String algorithm, int difficultyLevel) {
		super(input, output, algorithm);
		this.difficultyLevel = difficultyLevel;
	}
	
	public int getDifficultyLevel() {
		return difficultyLevel;
	}
	
	public void setDifficultyLevel(int difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}
	
	@Override
	public boolean isHard() {
		if (difficultyLevel > 50) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String howToSolve() {
		return "Multiply to itself";
	}
	
	@Override
	public String getFinalAnswer() {
		return "Eureka!";
	}
	
	@Override
	public String toString() {
		return "Problem \n[input = " + getInput() + ", output: " + getOutput() + 
				", algorithm = " + getAlgorithm() + ", isHard() = " + isHard() + "] \n" + 
				"difficultyLevel is: " + difficultyLevel + ", howToSolve = " + howToSolve() + 
				" ] \n" + getFinalAnswer();
	}
}
