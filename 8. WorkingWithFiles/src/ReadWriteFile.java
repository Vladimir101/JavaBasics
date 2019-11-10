import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadWriteFile
{
	public static void main(String[] args) throws FileNotFoundException
	{
// read from file		
		File readFile = new File("readfile.txt");
		Scanner scanFile = new Scanner(readFile);
		
		while (scanFile.hasNextLine())
			System.out.println(scanFile.nextLine());
		scanFile.close();
		
// write into a file
		File writeFile = new File("writeFile.txt");
		PrintWriter printFile = new PrintWriter(writeFile);
		printFile.println("My first string");
		printFile.println("My first string");
		printFile.print("My first string");
		printFile.close();
	}
}
