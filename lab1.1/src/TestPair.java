
public class TestPair {
	public static void main(String[] args) {
		Pair<Integer, Double> pair1 = new Pair<>(10, 10.1);
		Pair <Double, String> pair2 = new Pair<>(8.2, "ABC");
		
		System.out.println("The value of the first pair instance is: ( " + pair1.getFirst() + ", " + pair1.getSecond() + " )");
		System.out.println("The value of the second pair instance is: ( " + pair2.getFirst() + ", " + pair2.getSecond() + " )");
		
		Pair<Integer, Double>[] holdings = new Pair[100];
		System.out.println("\n The array is: ");
		
		for(int index = 0; index < 100; index++) {
			holdings[index] = new Pair<>(index, 100.0 - index);
			
			System.out.println("(" + holdings[index].getFirst() + ", " + holdings[index].getSecond()+ ")");
		}
		
		
	}
}
