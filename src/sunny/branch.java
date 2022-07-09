package sunny;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class branch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.co.uk/");
		driver.get("http://primusbank.qedgetech.com/");
		//driver.get("https://www.youtube.com/");
		
	
		driver.manage().window().maximize();
		
		WebElement elesel = driver.findElement(By.cssSelector("#drlist "));
		elesel.click();
		WebElement elesel1 = driver.findElement(By.cssSelector("#drlist > option:nth-child(2)"));
		elesel1.click();
		
		WebElement eleUsId = driver.findElement(By.name("txtuId"));
		eleUsId.sendKeys("Admin");
		
		WebElement elePwd = driver.findElement(By.name("txtPword"));
		elePwd.sendKeys("Admin");
		
		WebElement eleLogin = driver.findElement(By.id("login"));
		eleLogin.click();
		//driver.close();
		
		WebElement elebra = driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img"));
		elebra.click();
		
		WebElement BtnNewBR = driver.findElement(By.id("BtnNewBR"));
		BtnNewBR.click();
		
		WebElement elebra1 = driver.findElement(By.name("txtbName"));
		elebra1.sendKeys("tsbwatford");
		
		WebElement eleadd = driver.findElement(By.name("txtAdd1"));
		eleadd.sendKeys("highstreet");
		
		WebElement elearea = driver.findElement(By.name("txtArea"));
		elearea.sendKeys("watford");
		
		WebElement elecou = driver.findElement(By.cssSelector("#lst_counrtyU"));
		elecou.click();
		
		WebElement elecou1 = driver.findElement(By.cssSelector("#lst_counrtyU > option:nth-child(3)"));
		elecou1.click();
		
		WebElement elesta = driver.findElement(By.cssSelector("#lst_stateI > option:nth-child(3)"));
		elesta.click();
		
        WebElement elecity = driver.findElement(By.cssSelector("#lst_cityI > option:nth-child(2)"));
		elecity.click();
		
		WebElement elezip = driver.findElement(By.id("txtZip"));
		elezip.sendKeys("99999");
		
		WebElement elesubmit = driver.findElement(By.name("btn_insert"));
		elesubmit.click();
		
		
		
		
				
				
				
				
		

	}

}
