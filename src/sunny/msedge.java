package sunny;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class msedge {
public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C:\\selenium\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://www.google.co.uk/");
		
//		driver.get("https://mail.google.com/mail/u/0/#inbox");
}
}