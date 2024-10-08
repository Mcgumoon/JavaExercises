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

public class OnlineCourse extends Course{
	//data fields
	private String platform;
	private String meetingLink;
	
	//constructors
	public OnlineCourse() {
		super();
	}
	
	public OnlineCourse(String courseName, int sectionNumber, String instructorName, String platform, String meetingLink) {
		super(courseName, sectionNumber, instructorName);
		this.platform = platform;
		this.meetingLink = meetingLink;
	}
	
	//protected getters and setters
	protected String getMeetingLink() {
		return meetingLink;
	}
	
	protected void setMeetingLink(String meetingLink) {
		this.meetingLink = meetingLink;
	}
	
	public int getCapacity() {
		return getNumberOfStudentsEnrolled();
	}
	
	//toString
	@Override
	public String toString() {
		return "OnlineCourse [ CourseName = " + getCourseName() + ", sectionNumber = " + getSectionNumber() + 
				", instructorName = " + getInstructorName() + ", platform = " + platform + ", meetingLink = " +
				meetingLink + "]";
	}
}
