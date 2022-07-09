package sunny;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class userinfo {
	
	public void ram()
	{
		WebElement elerole = launch.driver.findElement(By.xpath("//img[@ src='images/Roles_but.jpg']"));
		elerole.click();
	    WebElement elerole1 = launch.driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img"));
		elerole1.click();	
		
		WebElement elerole2 = launch.driver.findElement(By.xpath("//*[@id=DG_bankdetails]/tbody/tr[3]/td[2]"));
		elerole2.click();
		
		WebElement elerole11 = launch.driver.findElement(By.id("Lblrowin"));
		String str1= elerole11.getText();	
		if(str1.contains(("New Role Insertion")))
				{
			System.out.println("text is validated");
			
				}
		else
		{
			System.out.println("text is invalidated");
			
		}
		
		
	}

	
}
