package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import base.BasePage;

public class NewCarPage extends BasePage {
	
	public NewCarPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void gotoToyota() {
		driver.findElement(By.xpath("//img[@alt='Toyota']")).click();		
		
	}
	
	public void gotoHyundai() {
		driver.findElement(By.xpath("//img[@alt='Honda']")).click();
	}
	public void gotoBMW() {
		driver.findElement(By.xpath("//img[@alt='BMW']")).click();
	}
}
