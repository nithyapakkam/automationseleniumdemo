package automationseleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practiceform {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdiver.chrome.driver", "C:\\Users\\Devavrath\\Desktop\\automation\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver ();
	    driver.get("https://demoqa.com/automation-practice-form");
	    driver.manage().window().maximize();
	   // driver.manage().window().minimize();
	    
	    //firstname
       WebElement firstname = driver.findElement(By.xpath("//*[@id='firstName']"));
       firstname.sendKeys("Devavrath");
       //lastname
       WebElement lastname = driver.findElement(By.xpath("//*[@id='lastName']"));
       lastname.sendKeys("PSN");
       
       //Email
       WebElement email = driver.findElement(By.xpath("//*[@id='userEmail']"));
      email.sendKeys("dev@gmail.com");
      
      //Gender
       WebElement gender = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        gender.click();
		
      
     // Mobile
      WebElement mobile =driver.findElement(By.xpath("//*[@id='userNumber']"));
      mobile.sendKeys("9876543210");
      
      //DOB
      
     WebElement datefield = driver.findElement(By.xpath("//*[@id='dateOfBirthInput']"));
     datefield.click();
     WebElement monthselect = driver.findElement(By.xpath("//*[@id='dateOfBirthInput']"));
    		Select monthDropdown= new Select(monthselect);
    		monthDropdown.selectByVisibleText("APRIL");
    		WebElement yearselect  = driver.findElement(By.xpath("//*[@id='dateOfBirthInput']"));
    		Select yearDropdown = new Select(yearselect);
    		yearDropdown.selectByVisibleText("2017");
	}

}
