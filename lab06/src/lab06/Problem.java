package lab06;

public abstract class Problem implements Solvable{
	protected int input;
	protected String output;
	protected String algorithm;
	
	public Problem() {
		
	}
	
	public Problem(int input, String output, String algorithm) {
		this.input = input;
		this.output = output;
		this.algorithm = algorithm;
	}
	
	public int getInput() {
		return input;
	}
	
	public void setInput(int input) {
		this.input = input;
	}
	
	public String getOutput() {
		return output;
	}
	
	public void setOutput(String output) {
		this.output = output;
	}
	
	public String getAlgorithm() {
		return algorithm;
	}
	
	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}
	
	public abstract boolean isHard();
	
	public String toString() {
		return "Problem [ \ninput = " + input + ", output: " + output + ", algorithm = " + algorithm +
				", isHard() = " + isHard();
	}
	
}
