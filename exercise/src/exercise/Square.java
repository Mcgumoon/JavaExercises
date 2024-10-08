package exercise;

public class Square extends SimpleGeometryObject{
	private double side;
	
	public Square() {
		super();
	}
	
	public Square(String color, boolean filled, double side) {
		super(color, filled);
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	public double getArea() {
		return side * side;
	}
	
	public double getPerimeter() {
		return 4 * side;
	}
	
	@Override
	public java.util.Date getDateCreated(){
		return new java.util.Date();
	}
	

	public String toString() {
		return "Square [ Side= " + getSide() + "Date Created= " + getDateCreated() + " ]\n";
	}
	
	
//	@Override
//	public String toString() {
//		return "Square: Side= " + getSide() + "\nDateCreated= " + getDateCreated() + "\nArea= " + getArea() + "\nPerimeter= " + getPerimeter()
//				+ "\nColor= " + getColor() + "\nFilled= " + isFilled()  
//				+ "\ntoString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
//				+ "]";
//	}
	
}
