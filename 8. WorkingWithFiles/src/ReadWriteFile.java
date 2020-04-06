import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
// using try-with-resources concept
public class ReadWriteFile
{
	public static void main(String[] args)
	{
// read from file		
		File readFile = new File("readfile.txt");
		try (Scanner scanFile = new Scanner(readFile))
		{
			while (scanFile.hasNextLine())
				System.out.println(scanFile.nextLine());
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
// write into a file
		File writeFile = new File("writeFile.txt");
		try(PrintWriter printFile = new PrintWriter(writeFile))
		{
			printFile.println("My first string");
			printFile.println("My first string");
			printFile.print("My first string");
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
