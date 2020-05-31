// using java.nio.file package
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class UsingPath
{
	public static void main(String[] args) throws IOException
	{
		Path readFile = Path.of("readfile.txt");
		
// read file as one string		
		String fileAsString = Files.readString(readFile);
		System.out.println(fileAsString);
		
// read file as a list of strings		
		var list = Files.readAllLines(readFile);
		System.out.println(list);
				
		Path writeFile = Path.of("writefile.txt");
		
// write lines of text		
		Iterable<String> iterable = Arrays.asList("My first string.", 
				"My second string.", "My third string.");
        Files.write(writeFile, iterable);
        
// write line by line	
		Files.writeString(writeFile, "1 string");
		Files.writeString(writeFile, "\n2 string", StandardOpenOption.APPEND);
		Files.writeString(writeFile, "\n3 string", StandardOpenOption.APPEND);
	}
}
