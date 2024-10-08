package attendance12;

public class Recursion {
	public static void main(String[] args) {
		theFunction(3);
	}
	
	public static void theFunction(int i) {
		if(i>0) {
			System.out.println("Before recursive call: " + i + " ");
			
			theFunction(i-1);
			System.out.println("After recursive call: " + i + " ");
		} else {
			System.out.println("In else");
		}
	}
}
