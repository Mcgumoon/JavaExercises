/***************************************************************
*
* Kean University
* Fall 2023
* Course: CPS*2231 - Computer Organization &Programming * Section 03
* Author: Ashley Davila
* Homework: 5, task 1
* Program Description:
***************************************************************/


package assignment5;


public class Computer {
	private String manufacturer;
	private long diskSize;
	private String manufacturingDate;
	private int numberOfCores;
	
	public Computer() {
		
	}
	
	public Computer(String manufacturer, long diskSize, String manufacturingDate, int numberOfCores) {
		this.manufacturer = manufacturer;
		this.diskSize = diskSize;
		this.manufacturingDate = manufacturingDate;
		this.numberOfCores = numberOfCores;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public long getDiskSize() {
		return diskSize;
	}
	
	public void setDiskSize(long diskSize) {
		this.diskSize = diskSize;
	}
	
	public String getManufacturingDate() {
		return manufacturingDate;
	}
	
	public void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	
	public int getNumberOfCores() {
		return numberOfCores;
	}
	
	public void setNumberOfCores(int numberOfCores) {
		this.numberOfCores = numberOfCores;
	}
	
	@Override
	public String toString() {
		return "Manufacturer = " + manufacturer + ", Disk Size = " + diskSize + " bytes" + ", Manufacturing Date = " + manufacturingDate +
				", number of Cores = " + numberOfCores;
	}
}
