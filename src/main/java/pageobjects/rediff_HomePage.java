package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rediff_HomePage {
	
public WebDriver driver;
	
	public rediff_HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By fullName=By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input[@type='text']");
	By rediffId=By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[@type='text']");
	By availability=By.cssSelector(".btn_checkavail");
	By password=By.xpath("//table[@id='tblcrtac']/tbody/tr[9]/td[3]/input[@type='password']");
	By re_password=By.xpath("//table[@id='tblcrtac']/tbody/tr[11]/td[3]/input[@type='password']");
	By alt_email=By.xpath("//table[@id='tblcrtac']/tbody/tr[14]/td[1]/div/table/tbody/tr[1]/td[3]/input[@type='text']");
	By countrycode=By.xpath("//div/span[@id='lbl_txt']");
	//By select_country=By.xpath("//div/ul/li[text()='Northern Mariana Islands (+1670)']");
	By select_country=By.xpath("//div[@id='country_id']/ul/li[contains(text(),'India')]");
	By mobile_no=By.id("mobno");
	By day=By.xpath("//tbody//tr[22]/td[3]/select[1]");
	By month=By.xpath("//tbody//tr[22]/td[3]/select[2]");
	By year=By.xpath("//tbody//tr[22]/td[3]/select[3]");
	By gender=By.xpath("//input[@value='f']");
	By country=By.id("country");
	
	public WebElement get_FullName()
	{
		return driver.findElement(fullName);
	}
	
	public WebElement get_rediffId()
	{
		return driver.findElement(rediffId);
	}
	public WebElement get_Availablility()
	{
		return driver.findElement(availability);
	}
	public WebElement get_password()
	{
		return driver.findElement(password);
	}
	public WebElement get_Re_Password()
	{
		return driver.findElement(re_password);
	}
	public WebElement get_Alternate_Email()
	{
		return driver.findElement(alt_email);
	}
	public WebElement get_Country_Code()
	{
		return driver.findElement(countrycode);
	}
	public WebElement select_Country()
	{
		return driver.findElement(select_country);
	}
	
	public WebElement get_MobileNo()
	{
		return driver.findElement(mobile_no);
	}
	public WebElement get_Day()
	{
		return driver.findElement(day);
	}
	public WebElement get_Month()
	{
		return driver.findElement(month);
	}
	public WebElement get_Year()
	{
		return driver.findElement(year);
	}
	public WebElement get_Gender()
	{
		return driver.findElement(gender);
	}
	public WebElement get_Country()
	{
		return driver.findElement(country);
	}
	

}
