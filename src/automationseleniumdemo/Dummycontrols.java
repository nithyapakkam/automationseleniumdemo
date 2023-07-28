package automationseleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dummycontrols {

	public static void main(String[] args) {
		System.setProperty("webdiver.chrome.driver", "C:\\Users\\Devavrath\\Desktop\\automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//navigate to the  login page using GET method
		driver.get("https://qavbox.github.io/demo/signup/");
		
		driver.manage().window().maximize();
		//driver.manage().window().minimize()
		
		//find the fullname field
		WebElement fullname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		fullname .sendKeys("nithyasreejith");
		
		//Email
		WebElement Email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		Email.sendKeys("dev@gmail.com");
		
		//Telephone
		WebElement telephone = driver.findElement(By.xpath("//*[@id=\"tel\"]"));
		telephone .sendKeys("9876543210");
		
		//Image uploading
		WebElement fileInput =driver.findElement(By.xpath("//*[@id=\"container\"]/div[6]/input"));
		fileInput.sendKeys("D:\\kunju  art  pictures\\animals");
		
		//Wait for a few seconds to ensure thev file is uploaded
		try {
			Thread.sleep(5000);
			}
		catch(InterruptedException e)
		{
		e.printStackTrace();
		
	}
		
		//Gender
		
		Select dropgender = new Select(driver.findElement(By.xpath("//*[@id=\"container\"]/div[7]/select")));
		dropgender.selectByIndex(2);
		
		//Experiance
		WebElement experience = driver.findElement(By.xpath("//*[@id=\"container\"]/div[8]/input[1]"));
		experience .sendKeys("1");
		experience.click();
		
		//skills
		WebElement skills = driver.findElement(By.xpath("//*[@id=\"ip\"]"));
		skills.click();
		
		//select Tools;
		//select droptools = new select(driver.findElement(By.xpath("/html/body/form/fieldset/div/div/select/option[1]")));
		//droptools.selectByValue("selenium");
		WebElement Tools = driver.findElement(By.xpath("//*[@id=\"tools\"]/option[1]"));
		Tools.click();
		
		//Find the submit button and click it
		WebElement submitbutton =driver.findElement(By.id("submitbtn"));
		submitbutton.click();
		
		
	}

}
