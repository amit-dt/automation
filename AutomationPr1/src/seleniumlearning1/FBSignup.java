package seleniumlearning1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignup {

	
	public static void main(String args[])
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		//String t=driver.getPageSource();
		
		//System.out.println(t);
		 
		driver.findElement(By.xpath("//*[@id=\"u_0_j\"]")).sendKeys("Amit");
		
		driver.findElement(By.xpath("//*[@id=\"u_0_l\"]")).sendKeys("Deshpande");
		
		driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//*[@id=\"u_0_v\"]")).sendKeys("12345678nm");
		
		Select sel1=new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		
		sel1.selectByIndex(2);
		
		Select sel2=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));

		sel2.selectByValue("3");
		
		Select sel3=new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		
		sel3.selectByVisibleText("1993");
		
		driver.findElement(By.xpath("//*[@id=\"u_0_a\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"u_0_11\"]")).click();
			
		
	}
	}	
	
