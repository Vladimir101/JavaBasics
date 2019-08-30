package com.modifiers.pack1;

public class TestMemberLevelPack1
{
	public static void main(String[] args)
	{
		MemberLevel ml = new MemberLevel("Steinbeck", "John", 68, "Salinas");
//		ml.privateLastName = "George"; compilation error
		ml.publicFirstName = "Anthony";
		ml.protectedAge = 24;
		ml.defaultCity = "San Francisco";
		
//		ml.getPrivateLastName();
		ml.getPublicFirstName();
		ml.getProtectedAge();
		ml.getDefaultCity();
	}
}
