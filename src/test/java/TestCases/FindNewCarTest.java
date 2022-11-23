package TestCases;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Pages.HomePage;
import Pages.NewCarPage;
import base.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
public class FindNewCarTest extends BasePage {

	public FindNewCarTest(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		WebDriver driver;

		Map<String, Object> prefs =  new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver(options);
		driver.get("https://www.carwale.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		HomePage home = new HomePage(driver);
		home.findNewCar();

		NewCarPage carPage = new NewCarPage(driver);
		carPage.gotoBMW();


	}


}
