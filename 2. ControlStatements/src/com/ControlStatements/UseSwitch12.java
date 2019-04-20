package com.ControlStatements;

public class UseSwitch12
{
	public static void main(String[] args)
	{
		int index = 3;
// 1		
		System.out.println("1. Traditional Switch Statement:");
		switch (index)
		{
		case 1:
			System.out.println("1 case");
			break;
		case 2:
			System.out.println("2 case");
			break;
		case 3:
			System.out.println("3 case");
			break;
		default:
			System.out.println("default case");
		}
		System.out.println();

// 2		
		System.out.println("2. Enhanced Switch Statement:");
		index = 2;
		switch (index)
		{
		case 1 -> System.out.println("1 case"); 
		case 2 -> System.out.println("2 case");
		case 3 -> System.out.println("3 case");
		default -> System.out.println("default case");
		}
		System.out.println();
		
// 3
		System.out.println("3. Switch Expression with Break:");
		index = 1;
		String caseNumberStr =
		      switch (index)
		      {
		         case 1 :
		            break "1 case";
		         case 2 :
		            break "2 case";
		         case 3 :
		            break "3 case";
		         default :
		            break "default case";
		      };
		System.out.println("\tindex " + index + " ==> " + caseNumberStr);
		System.out.println();
		
// 4
		System.out.println("4. Switch Expression with Arrows:");
		index = 4;
		caseNumberStr =
				switch (index)
				{
		         	case 1 -> "1 case";
		         	case 2 -> "2 case";
		         	case 3 -> "3 case";
		         	case 4 -> "4 case";
		         	default -> "default case";
				};
		System.out.println("\tindex " + index + " ==> " + caseNumberStr);
		System.out.println();
		
// 5		   
		System.out.println("5. Multiple Case Labels:");
		index = 8;
		caseNumberStr =
				switch (index)
				{
		         	case 0 -> "0 case";
		         	case 1, 3, 5, 7, 9 -> "odd case";
		         	case 2, 4, 6, 8, 10 -> "even case";
		         	default -> "default case";
				};
		System.out.println("\tindex " + index + " ==> " + caseNumberStr);
		System.out.println();
		
// 6
		System.out.println("6. Multiple Case Statements:");
		index = 11;
		switch (index)
		{
		case 1 -> System.out.println("1 case"); 
		case 2 -> System.out.println("2 case");
		case 3 -> System.out.println("3 case");
		default -> {System.out.println("\tThis is the first line in default");
		            System.out.println("\tThis is the second line in default");}
		}
		
	}
}
