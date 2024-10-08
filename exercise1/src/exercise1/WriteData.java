package exercise1;

public class WriteData {
	public static void main(String[] args) throws java.io.IOException{
		java.io.File file = new java.io.File("scores.txt");
		
		if(file.exists()) {
			System.out.println("File already exits");
			System.exit(1);
		}
		
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		
		output.print("John T. Perez");
		output.println(90);
		output.print("Jamal K. Johnson");
		output.println(85);
		
		output.close();
	}
}
