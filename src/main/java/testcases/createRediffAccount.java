package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.rediff_HomePage;
import pageobjects.rediff_LandingPage;
import resources.base;

public class createRediffAccount extends base {

	@BeforeTest
	public void initialize() throws IOException {
		// System.out.println(p.getProperty("url"));
		driver = initializeDriver();

	}

	@Test
	public void createAccount() {

		driver.get(p.getProperty("url"));
		rediff_LandingPage rp = new rediff_LandingPage(driver);
		rp.click_CreateAccountLink().click();

		rediff_HomePage rhp = new rediff_HomePage(driver);
		rhp.get_FullName().sendKeys("sajina");
		rhp.get_rediffId().sendKeys("sadfmnnn");
		rhp.get_Availablility().click();
		rhp.get_password().sendKeys("1235456");
		rhp.get_Re_Password().sendKeys("1235456");
		rhp.get_Alternate_Email().sendKeys("qweertt@wer.com");
		rhp.get_Country_Code().click();
		rhp.select_Country().click();
		rhp.get_MobileNo().sendKeys("9886735482");
		Select day=new Select(rhp.get_Day());
		day.selectByValue("11");
		Select month=new Select(rhp.get_Month());
		//month.selectByValue("JAN");
		month.selectByVisibleText("JAN");
		Select year=new Select(rhp.get_Year());
		year.selectByValue("2019");
		rhp.get_Gender().click();
		Select country=new Select(rhp.get_Country());
		country.selectByVisibleText("India");
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver = null;
	}
}
