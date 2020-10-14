package com.Interface;

interface Drawable
{
	void draw();
	
	default void drawWithPen()
	{
		System.out.println("drawing with black pen");
	}
	
	static void drawing()
	{
		System.out.println("drawing in static method");
	}
}
