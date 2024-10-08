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

public class Desktop extends Computer {
	private double width;
	private double height;
	
	public Desktop() {
		
	}
	
	public Desktop(String manufacturer, long diskSize, String manufacturingDate, int numberOfCores, double width,
			double height) {
		super(manufacturer, diskSize, manufacturingDate, numberOfCores);
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Desktop [ Manufacturer = " + getManufacturer() + ", disk size = " + getDiskSize() + ", manufacturing date = " +
				getManufacturingDate() + ", number of Cores = " + getNumberOfCores() + ", width = " + width + 
				", height = " + height;
	}
}
