package LibGlobalPackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
public class Configurations extends BaseClass {
	public static String host = "ApplicationPropertiesQA";
	public Configurations() {
	
		PageFactory.initElements(driver, this);
	}	
	public static  void readbaseUrl(String url) throws IOException {
	
		FileReader reader = new FileReader("D:\\Project\\Gigsumo\\"+ toReadDataFromExcel("LOGIN", 1, 1));

        Properties props = new Properties();

        props.load(reader);

        driver.get(props.getProperty(url));

	}
	
	
	public static void readPasswordUrl(String SetPassword, String token) throws FileNotFoundException, IOException {
		
		FileReader reader = new FileReader("D:\\Project\\Gigsumo\\"+ toReadDataFromExcel("LOGIN", 1, 1));

        Properties props = new Properties();

        props.load(reader);
        
        driver.get(props.getProperty(SetPassword)+ token);


	}
	
}
