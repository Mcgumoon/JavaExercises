//***************************************************************
//****************
//*
//* Kean University
//* Fall 2023
/* Course: CPS2231 - Computer Programming
/*
/* Author: Ashley Davila, Section 03
//*
//* Lab 05
//* Program Description:
//****************************************************************
//*********/

public abstract class Course {
	//data fields
	private String courseName;
	private int sectionNumber;
	private String instructorName;
	private static int numberOfStudentsEnrolled;
	
	//protected constructors
	protected Course() {
		
	}
	
	protected Course(String courseName) {
		this.courseName = courseName;
	}
	
	protected Course(String courseName, int sectionNumber, String instructorName) {
		this.courseName = courseName;
		this.sectionNumber = sectionNumber;
		this.instructorName = instructorName;
	}
	
	//getters and setters
	public int getCapacity() {
		return (20 + (int)(Math.random() + 20));
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public int getSectionNumber() {
		return sectionNumber;
	}
	
	public void setSectionNumber(int sectionNumber) {
		this.sectionNumber = sectionNumber;
	}
	
	public String getInstructorName() {
		return instructorName;
	}
	
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	
	public static int getNumberOfStudentsEnrolled() {
		return numberOfStudentsEnrolled;
	}
	
	//toString 
	public String toString() {
		return "Course [ courseName = " + courseName + ", sectionNumber = " + sectionNumber + ", instructorName = " + instructorName +
				", studentsEnrolled = " + "numberOfStudentsEnrolled" + "]";
	}
}
