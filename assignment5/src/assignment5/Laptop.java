/***************************************************************
*
* Kean University
* Fall 2023
* Course: CPS*2231 - Computer Organization &Programming * Section 03
* Author: Ashley Davila
* Homework: 5, task 2
* Program Description:
***************************************************************/

package assignment5;

public class Laptop extends Computer{
	private double weight;
	
	public Laptop() {
		
	}
	
	public Laptop(String manufacturer, long diskSize, String manufacturingDate, int numberOfCores, double weight) {
		super(manufacturer, diskSize, manufacturingDate, numberOfCores);
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Laptop [ manufacturer = " + getManufacturer() + ", disk size = " + getDiskSize() + ", manufacturing date = " + getManufacturingDate() +
				", number of Cores = " + getNumberOfCores() + ", weight = " + weight;
	}
}
