package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rediff_LandingPage {

	public WebDriver driver;
	
	public rediff_LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By createAccount=By.xpath("//a[text()='Create Account']");
	public WebElement click_CreateAccountLink()
	{
		return driver.findElement(createAccount);
	}
			
}
