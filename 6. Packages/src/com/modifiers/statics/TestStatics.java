package com.modifiers.statics;

public class TestStatics
{
	public static void main(String[] args)
	{
		Student s1 = new Student("Alex", "Minsk");
		Student s2 = new Student("Inna", "Rome");
		
		System.out.println("School: " + Student.getSchool());
		System.out.println("Total number of students: " + Student.getNumberOfStudents());
	}
}
