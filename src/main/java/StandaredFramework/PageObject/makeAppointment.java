package StandaredFramework.PageObject;

import java.net.SocketException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import StandardFramework.ReusableComponents.waitHelper;

public class makeAppointment extends waitHelper
{
	WebDriver driver;

	public makeAppointment(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css=".col-sm-12")
	WebElement appointmentPage;
	@FindBy(id="combo_facility")
	WebElement facility;
	@FindBy(id="chk_hospotal_readmission")
	WebElement readmission;
	@FindBy(css=".radio-inline")
	List<WebElement> radioOPtions;
	@FindBy(css=".input-group-addon")
	WebElement visit;
	@FindBy(css=".datepicker ")
	WebElement calender;
	@FindBy(css=".datepicker-switch")
	WebElement month;
	@FindBy(css=".next")
	WebElement next;
	@FindBy(css="[class='day']")
	List<WebElement> days;
	@FindBy(id="btn-book-appointment")
	WebElement book;
	@FindBy(css=".col-xs-12")
	WebElement confirmationPage;
	@FindBy(css=".col-xs-offset-2")
	List<WebElement> confirmationDetails;
	@FindBy(id="menu-toggle")
	WebElement menu;
	@FindBy(css="[href='authenticate.php?logout']")
	WebElement logout;
	
	public void appointment(String facilityNo,String option,String visitMonth,String day) throws SocketException
	{
		explicitWait(appointmentPage);
		Select facilityOp=new Select(facility);
		facilityOp.selectByIndex(Integer.parseInt(facilityNo));
		readmission.click();
		radioOPtions.stream().filter(s->s.getText().trim().equals(option)).limit(1).forEach(s->s.click());
		visit.click();
		explicitWait(calender);
		while(!(month.getText().equals(visitMonth)))
		{
			next.click();
		}
		days.stream().filter(s->s.getText().trim().equals(day)).limit(1).forEach(s->s.click());
		book.click();
		explicitWait(confirmationPage);
		confirmationDetails.stream().map(WebElement::getText).forEach(s -> System.out.print(s + "\n"));
		menu.click();
		explicitWait(logout);
		logout.click();
	}
}
