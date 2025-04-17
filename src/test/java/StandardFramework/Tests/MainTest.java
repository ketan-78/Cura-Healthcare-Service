package StandardFramework.Tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import StandardFramework.TestComponents.BaseTest;
import StandaredFramework.PageObject.makeAppointment;

public class MainTest extends BaseTest{

	@Test(dataProvider="data")
	public void funtion(HashMap<String,String> data) throws IOException, InterruptedException 
	{
		makeAppointment appoint=signUp.signUP(data.get("username"),data.get("pswd"));
		appoint.appointment(data.get("facilityNo"),data.get("option"),data.get("visitMonth"),
				data.get("day"));
		
	}
	 
	@DataProvider
	public Object[][] data() throws IOException
	{
		List<HashMap<String,String>> data=getData(System.getProperty("user.dir")+"\\src\\test\\java\\StandardFramework\\Data\\Data.json");
		return new Object[][] {{data.get(0)},{data.get(1)},{data.get(2)}};
	}
}

