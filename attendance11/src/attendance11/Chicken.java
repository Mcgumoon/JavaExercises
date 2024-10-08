package attendance11;

public class Chicken extends Animal implements Edible, Comparable<Chicken>{
	@Override
	public String sound() {
		return "dododododo";
	}
	
	@Override
	public String howToEat() {
		return "Fry Chicken";
	}
	
	@Override
	public int compareTo(Chicken o) {
		return Double.compare(getWeight(),o.getWeight());
	}
}
