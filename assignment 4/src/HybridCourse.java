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

public class HybridCourse extends Course{
	//data fields
	private int percentOfRemoteLearning;
	
	//constructors
	public HybridCourse() {
		super();
	}
	
	public HybridCourse(String courseName, int sectionNumber, String instructorName, int percentOfRemoteLearning) {
		super(courseName, sectionNumber, instructorName);
		this.percentOfRemoteLearning = percentOfRemoteLearning;
	}

	//getter and setters
	public int getCapacity() {
		return getNumberOfStudentsEnrolled();
	}
	
	public int getPercentOfRemoteLearning() {
		return percentOfRemoteLearning;
	}
	
	public void setPercentOfRemoteLearning(int percentOfRemoteLearning) {
		this.percentOfRemoteLearning = percentOfRemoteLearning;
	}
	
	//toString
	@Override
	public String toString() {
		return "HybridCourse [ courseName = " + getCourseName() + ", sectionNumber = " + getSectionNumber() + 
				", instructorName = " + getInstructorName() + ", percentOfRemoteLearning = " + percentOfRemoteLearning +
				"]";
	}

}
