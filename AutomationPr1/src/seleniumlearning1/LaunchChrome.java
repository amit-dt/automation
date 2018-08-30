package seleniumlearning1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	
	public static void main(String args[])
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.capgemini.com");
		
		String t=driver.getPageSource();
		
		System.out.println(t);
	}
	}
	
	
	
	
