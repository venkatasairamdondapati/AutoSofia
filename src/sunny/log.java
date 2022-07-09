package sunny;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class log {
	
	
	public void login()
	
	{
	
	
		WebElement eleUsId = launch.driver.findElement(By.name("txtuId"));
		eleUsId.sendKeys("Admin");
		
		WebElement elePwd = launch.driver.findElement(By.name("txtPword"));
		elePwd.sendKeys("Admin");
		
		WebElement eleLogin = launch.driver.findElement(By.id("login"));
		eleLogin.click();
		//driver.close();
		WebElement elerole = launch.driver.findElement(By.xpath("//img[@ src='images/Roles_but.jpg']"));
		elerole.click();
	    WebElement elerole1 = launch.driver.findElement(By.xpath("//*[@id=\"Table_02\"]/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img"));
		elerole1.click();	
		
		WebElement elerole2 = launch.driver.findElement(By.xpath("//*[@id=DG_bankdetails]/tbody/tr[3]/td[2]"));
		elerole2.click();
		
	//	WebElement elerole2 = launch.driver.findElement(By.id("Lblrowin"));
		//String str1= elerole2.getText();	
		//if(str1.contains(("New Role Insertion")))
				//{
			//System.out.println("text is validated");
			
				//}
		//else
		//{
			//System.out.println("text is invalidated");
			
	//	}
		
		
		
		
		

WebElement eleuser1 = launch.driver.findElement(By.id("Btnuser"));
eleuser1.click();	
//Thread.sleep(3000);


WebElement eleuser2 = launch.driver.findElement(By.id("labmain"));
String str2= eleuser2.getText();	
if(str2.contains(("New User Creation")))
		{
	System.out.println("text is validated");
	
		}
else
{
	System.out.println("text is invalidated");
	
}




WebElement elebranch = launch.driver.findElement(By.xpath("//img[@ src='images/Branches_but.jpg']"));
elebranch.click();

WebElement elebranch1 = launch.driver.findElement(By.id("BtnNewBR"));
elebranch1.click();	
//Thread.sleep(3000);
WebElement elebranch2 = launch.driver.findElement(By.id("labmain"));
String str4= elebranch2.getText();	
if(str4.contains(("New Branch Entry")))
{
System.out.println("text is validated");

}
else
{
System.out.println("text is invalidated");

}

WebElement bname = launch.driver.findElement(By.name("txtbName"));
bname.sendKeys("vijayawada");	
WebElement add = launch.driver.findElement(By.name("txtAdd1"));
add.sendKeys("50 leavesden road");

WebElement add2 = launch.driver.findElement(By.name("Txtadd2"));
add2.sendKeys("watford");

WebElement add3 = launch.driver.findElement(By.id("txtadd3"));
add3.sendKeys("near kfc st.albans");


WebElement area = launch.driver.findElement(By.id("txtArea"));
area.sendKeys("st.albans road");


WebElement zip = launch.driver.findElement(By.id("txtZip"));
zip.sendKeys("24512");

WebElement dropdown = launch.driver.findElement(By.id("lst_counrtyU"));
Select objsel= new Select(dropdown);
objsel.selectByValue("UK");

WebElement eledown = launch.driver.findElement(By.id("lst_stateI"));
Select selbj= new Select(eledown);
selbj.selectByValue("England");


WebElement eledrop = launch.driver.findElement(By.id("lst_cityI"));
Select selbj1= new Select(eledrop);
selbj1.selectByValue("LONDON");


WebElement elesubmit = launch.driver.findElement(By.id("btn_insert"));
elesubmit.click();

System.out.println("the id is "+launch.driver.switchTo().alert().getText());
launch.driver.switchTo().alert().accept();
		
		
		
		
		
		
	}

}
