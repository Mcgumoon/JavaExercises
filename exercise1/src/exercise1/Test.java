package exercise1;

public class Test {
	public static void main(String[] args) throws Exception{
		java.io.File file = new java.io.File("temp.txt");
		
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		
		output.printf("amount is %f %e \r \n", 2.5, 3.5);
		output.printf("amount is %5.4f %5.4e\r\n", 4.5, 5.5);
		output.close();
		
		java.util.Scanner input = new java.util.Scanner(file);
		
		while(input.hasNext()) {
			String first = input.next();
			String second = input.next();
			double third = input.nextDouble();
			double fourth = input.nextDouble();
			System.out.println(first + " " + second + " " + third + " " + fourth);
		}
		
		input.close();
	}
}
