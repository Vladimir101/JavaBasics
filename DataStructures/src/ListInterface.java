import java.util.ArrayList;
import java.util.List;

public class ListInterface
{
	public static void main(String[] args)
	{
		List<String> names = new ArrayList<String>();
		names.add("Ann");
		names.add("Cindy");
		System.out.println(names);
		
		names.add(1, "Bob");
		names.remove(0);
		names.set(0, "Donald");
		String name = names.get(1);
		System.out.println(name);
		
		int size = names.size();
	}
}
