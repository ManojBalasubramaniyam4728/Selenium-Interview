package ExcelAndJsonforDataDriveing;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class GetDataFromJson {
	
	public static String filePath = System.getProperty("user.dir")+ "/src/test/java/ExcelAndJsonforDataDriveing/TestData.json";
	public static JsonPath testData = new JsonPath(new File(filePath));
	
	public String getDataFromJson(String jsonObjectName,int jsonObjextIndex, String jsonPathParameter) {
		return testData.getString(jsonObjectName+".findAll{it.TestData_ID=='"+jsonObjextIndex +"'}."+jsonPathParameter).replace("[", "").replace("]", "");
	}
	
	@Test
	public void getDataFromJson() {
		String username = getDataFromJson("loginData",2,"username");
		String password = getDataFromJson("loginData",2,"password");
		String expected = getDataFromJson("loginData",2,"expected");
		System.out.println("The user name : "+username+" and Password : "+password+" and expected is : "+expected+" From Json File");
	}
}
