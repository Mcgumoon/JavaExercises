enum Color{
	WHITE, BLACK, CINNAMON, ORANGE, CHOCOLATE;
}


public class Cat {
	//private fields
	private String name;
	private int age;
	private Color color;
	private String type;
	
	//static field
	public static int numberOfCats = 0;
	
	//methods
	public String eat() {
		return name + " is eating their food";
	}
	
	public String play(String toy) {
		return "The cat is playing with " + toy;
	}
	
	
	//constructors
	public Cat() {
		
	}
	
	public Cat(String name, int age, Color color, String type) {
		this.name = name;
		this.age = age;
		this.color = color;
		this.type = type;
		
		numberOfCats++;
	}
	
	//getters and setters
	public static int getNumberOfCats() {		
		return numberOfCats;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	//main method
	public static void main(String[] args) {
		Cat cat1 = new Cat("Cookie", 2, Color.WHITE, "domestic");
		Cat cat2 = new Cat("Dragon", 1, Color.BLACK, "feral");
		Cat cat3 = new Cat("Bongo", 3, Color.CINNAMON, "domestic");
		
		System.out.println(cat1.eat());
		System.out.println(cat2.play("mouse"));
		System.out.println(cat3.play("litter box"));
		
		System.out.println("Total number of cats are: " + getNumberOfCats());
	}
}

