import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile
{
	public static void main(String[] args) throws IOException
	{
		Properties prop = new Properties();
		prop.load(new FileInputStream("data.config"));
		String browser = prop.getProperty("browser");
		String os = prop.getProperty("OS");
		
		System.out.println("Browser: " + browser + "\nOS: " + os);
	}
}
