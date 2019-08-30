package com.modifiers.pack1;

public class TestPackageLevelPack1
{
	public static void main(String[] args)
	{
		PackageLevel pl = new PackageLevel("Tony");
		String name = pl.getName();
		System.out.println(name);
	}
}
