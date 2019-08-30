package com.modifiers.pack2;

import com.modifiers.pack1.MemberLevel;

public class TestMemberLevelPack2
{
	public static void main(String[] args)
	{
		MemberLevel ml = new MemberLevel("Steinbeck", "John", 68, "Salinas");
//		ml.privateLastName = "George"; 
		ml.publicFirstName = "Anthony";
//		ml.protectedAge = 24;
//		ml.defaultCity = "San Francisco";
		
//		ml.getPrivateLastName();
		ml.getPublicFirstName();
//		ml.getProtectedAge();
//		ml.getDefaultCity();	
	}
}
