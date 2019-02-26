
public class SwapingNumbers
{
	public static void main(String[] args)
	{
		int i = 23;
		int j = 66;
		
		i += j;
		j = i - j;
		i -= j;
		System.out.println("i: " + i + ", j: " + j);
	}
}
