package automationseleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class meesho {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Devavrath\\Desktop\\automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.meesho.com");
		driver.manage().window().maximize();
		String actualTitle= driver.getTitle();
		System.out.println(actualTitle);
		//driver.quit();
		}

}
