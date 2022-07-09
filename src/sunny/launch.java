package sunny;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class launch {
	
	public static WebDriver driver;
	
	
	public void Base() {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	}

	public void fnNavigatetourl() {

		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
