package com.Inheritance.solution;

public class TestQAEngineer
{

	public static void main(String[] args)
	{
// display a QA Engineer name, salary, company, and signin bonus
		QAEngineer qa = new QAEngineer("Anthony", 120000, "Kaiser", 5000);
		System.out.println("QA Engineer: " + qa.getName() +
				"\nsalary: " + qa.getSalary() +
				"\ncompany: " + qa.getCompany() +
				"\nsignin bonus: " + qa.getSignInBonus());
	}

}
