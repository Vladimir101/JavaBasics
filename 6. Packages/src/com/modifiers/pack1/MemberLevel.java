package com.modifiers.pack1;

public class MemberLevel
{
	private String privateLastName;
	public String publicFirstName;
	protected int protectedAge;
	String defaultCity;

	public MemberLevel(String ln, String fn, int ag, String ci)
	{
		privateLastName = ln;
		publicFirstName = fn;
		protectedAge = ag;
		defaultCity = ci;
	}

	private String getPrivateLastName()
	{
		return privateLastName;
	}

	public String getPublicFirstName()
	{
		return publicFirstName;
	}

	protected int getProtectedAge()
	{
		return protectedAge;
	}

// default package	
	String getDefaultCity()
	{
		return defaultCity;
	}
}
