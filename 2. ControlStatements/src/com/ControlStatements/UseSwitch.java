package com.ControlStatements;
public class UseSwitch
{
	public static void main(String[] args)
	{
		String value = "B";
		 
        switch (value)
        {
            case "A":
                System.out.println("A case");
                break;
            case "B":
                System.out.println("B case");
                break;
            default:
                System.out.println("Default case: neither A nor B");
        }
        
        int index = 2;
        
        switch (index)
        {
            case 1:
                System.out.println("1 case");
                break;
            case 2:
                System.out.println("2 case");
                break;
            default:
                System.out.println("Default case: neither 1 nor 2");
        }
	}
}
