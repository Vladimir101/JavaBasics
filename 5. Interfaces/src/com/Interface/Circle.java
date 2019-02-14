package com.Interface;

public class Circle implements Drawable
{
	@Override
	public void draw()
	{
		System.out.println("drawing circle");
	}
	
	public void fillWithRedColor()
	{
		System.out.println("filling with red color");
	}
}
