package com.modifiers.fin;

public class FinalClass2
{
	private final double PI = 3.14159;
	private final int speedOfLight;
	
// final variable can be initialized only in constructor	
	public FinalClass2()
	{
		speedOfLight = 300000;
	}
	
	public double getPI()
	{
		return PI;
	}

	/*
	 * public void setPI(double pI)
	 * {
	 * PI = pI;
	 * }
	 * 
	 * public void morePrecise()
	 * {
	 * PI = 3.1415927;
	 * }
	 */
	
	public final void imFinal()
	{
		System.out.println("I'm final!");
	}
}
