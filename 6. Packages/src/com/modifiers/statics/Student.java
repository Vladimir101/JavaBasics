package com.modifiers.statics;

public class Student
{
// instance variables	
	private String name;
	private String city;
	
// class level variables
	private static String school = "PASV";
	private static int numberOfStudents = 0;
	
// constructor
	public Student(String aName, String aCity)
	{
		name = aName;
		city = aCity;
		numberOfStudents++;
	}

// getters	
	public static String getSchool()
	{
		return school;
	}

	public static int getNumberOfStudents()
	{
		return numberOfStudents;
	}
}
