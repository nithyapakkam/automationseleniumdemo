package automationseleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imageuploading {

	public static void main(String[] args) {
		
		System.setProperty("webdiver.chrome.driver", "C:\\Users\\Devavrath\\Desktop\\automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/signup/");
		driver.manage().window().maximize();
		//driver.quit();
	}

}
