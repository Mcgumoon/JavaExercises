package exercise;

public class SquareTest {
	public static void main(String[] args) {
		Square a = new Square();
		Square b = new Square("red", true,4);
		System.out.print(a.toString());
		System.out.print(b.toString());
	}
}
