package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import base.BasePage;

public class HomePage extends BasePage{

	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//li[@class=' nS6XVS']")
	public WebElement newCarsMenu;

	@FindBy(xpath = "//a[@href='/new-cars/']//div[@class='o-brXWGL o-bqHweY o-OisZk o-frwuxB ME7bfG  o-bfyaNx']")
	public WebElement findNewCars;

	@FindBy(xpath ="//input[@placeholder='Type to select car name, e.g. Renault Kiger']")
	public WebElement searchNewCar;

	public NewCarPage findNewCar() {
		new Actions (driver).moveToElement(newCarsMenu).perform();
		findNewCars.click();
		
		return new NewCarPage(driver);
	}
	public void SearchNewCar(String CarName) {
		searchNewCar.sendKeys(CarName);
	}
	public void SearchUsedCar(String CarName) {

	}



}
