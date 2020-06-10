package com.Interface;

public interface HasNested
{
	void outerMethod();
	interface Nested
	{
		void innerMethod();
	}
}
