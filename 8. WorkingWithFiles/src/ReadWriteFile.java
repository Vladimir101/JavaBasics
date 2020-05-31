import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
// using try-with-resources concept
// A resource is an object that must be closed after the program is finished with it. 
// The try-with-resources statement ensures that each resource is closed at the end of the statement. 
public class ReadWriteFile
{
	public static void main(String[] args)
	{		
		File readFile = new File("readfile.txt");
		File writeFile = new File("writeFile.txt");
		
		try (Scanner scanFile = new Scanner(readFile); 
			PrintWriter printFile = new PrintWriter(writeFile))
		{
// read from file			
			while (scanFile.hasNextLine())
				System.out.println(scanFile.nextLine());
			
// write into a file			
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
