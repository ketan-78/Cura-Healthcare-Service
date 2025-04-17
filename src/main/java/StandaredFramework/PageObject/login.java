package StandaredFramework.PageObject;

import java.net.SocketException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StandardFramework.ReusableComponents.waitHelper;

public class login extends waitHelper{

	WebDriver driver;
	public login(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	} 

	@FindBy(id="btn-make-appointment")
	WebElement appoint;
	@FindBy(tagName="h2")
	WebElement loginPage;
	@FindBy(id="txt-username")
	WebElement user;
	@FindBy(id="txt-password")
	WebElement pass;
	@FindBy(id="btn-login")
	WebElement logon;
	@FindBy(css=".col-sm-12")
	WebElement appointmentPage;
	
	public makeAppointment signUP(String username,String pswd) throws SocketException
	{
		appoint.click();
		explicitWait(loginPage);	
		user.sendKeys(username);
		pass.sendKeys(pswd);
		logon.click();
		makeAppointment appoint=new makeAppointment(driver);
		return appoint;
		
	}
}
