
public class WithFinally
{
	public int getNumber()
	{
		int i = 25;
		try
		{
			return i;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Inside finally");
		}
		return 68;
	}
	
	public static void main(String[] args)
	{
		var a = new WithFinally();
		int b = a.getNumber();
		System.out.println("b = " + b);
	}
}
