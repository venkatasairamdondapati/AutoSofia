package sunny;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {

	public static void main(String[] args) {
		
		launch objlun = new launch();
		log objlog = new log();
		
		 userinfo objuser = new userinfo();
		
		//objlun.fnbrowserLaunch();
		objlun.fnNavigatetourl();
		objlog.login();
	    objuser.ram();
		
		
		
		
		
		
		
		
		
//		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		
//		
//		driver.get("https://www.google.co.uk/");
//		driver.get("http://primusbank.qedgetech.com/");
//		//driver.get("https://www.youtube.com/");
//		
//	
//		driver.manage().window().maximize();
//		
//		//driver.close();
//	
//		WebElement eleUsId = driver.findElement(By.name("txtuId"));
//		eleUsId.sendKeys("Admin");
//		
//		WebElement elePwd = driver.findElement(By.name("txtPword"));
//		elePwd.sendKeys("Admin");
//		
//		WebElement eleLogin = driver.findElement(By.id("login"));
//		eleLogin.click();
//		
//		WebElement Elerole = driver.findElement(By.name("Roles"));
//		Elerole.click();
//		
//		driver.findElement(By.id("text")).click();
//		
//		//WebElement eleUsId = driver.findElement(By.xpath("//*[@id=\"button\"]"));
//		//eleUsId.sendKeys("legendsongs");
		
		 
		
		
		
		
	}
}
