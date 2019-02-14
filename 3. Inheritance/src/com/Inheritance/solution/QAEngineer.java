package com.Inheritance.solution;

public class QAEngineer extends Employee
{
	private double signInBonus;
	
	public QAEngineer(String aName, double aSalary, 
					  String aCompany, double bonus)
	{
		super(aName, aSalary, aCompany);
		signInBonus = bonus;
	}
	
	public double getSignInBonus()
	{
		return signInBonus;
	}
}
