package seleniumlearning1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyLogin {
	
	
public static void main(String args[])
	
	{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\Downloads\\geckodriver-v0.19.1-win32\\geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize() ;
		
		driver.get("http://www.facebook.com");
		
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("9008774254");
	
	driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("amma1234");
	
	driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
	
	driver.findElement(By.id("userNavigationLabel")).click();	
	
	driver.findElement(By.cssSelector("._54nh")).click();	
	
	
	}
}


