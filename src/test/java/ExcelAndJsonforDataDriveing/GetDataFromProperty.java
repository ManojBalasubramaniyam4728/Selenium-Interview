package ExcelAndJsonforDataDriveing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class GetDataFromProperty {
	
	public static String filePath = System.getProperty("user.dir")
			+ "/src/test/java/ExcelAndJsonforDataDriveing/TestData.property";
	
	public Properties getDataFromProperity() throws IOException {
	   FileInputStream fis =new FileInputStream(filePath);
	   Properties prop = new Properties();
	   prop.load(fis);
	   return prop;
	}
	
	@Test
	public void getData() throws IOException {
		String browserName =  getDataFromProperity().getProperty("Browser");
		String url =  getDataFromProperity().getProperty("Url");
		System.out.println("The Browser name is : "+browserName+" and Url is : "+url);
	}

}
