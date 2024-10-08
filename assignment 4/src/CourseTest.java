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

public class CourseTest {
	public static void main(String[] args) {
		HybridCourse course1 = new HybridCourse("CPS100", 01, "Tom", 50 );
		OnlineCourse course2 = new OnlineCourse("CPS1001", 02, "Jack", "Zoom", "www.xxx.com");
		
		System.out.println(course1.toString());
		System.out.println(course2.toString());
	}
}
