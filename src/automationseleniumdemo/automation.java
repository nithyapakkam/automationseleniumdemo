package automationseleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class automation {

	public static void main(String[] args) 
	{
	System.setProperty("webdiver.chrome.driver", "C:\\Users\\Devavrath\\Desktop\\automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver ();
	
	//navigate to the automation login page using GET method
	driver.get("https://demo.automationtesting.in/Register.html");
	
	driver.manage().window().maximize();
	//driver.manage().window().minimize();
	
	//find the firstname field and enter your  firstname
	WebElement firstname = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
	firstname .sendKeys("nithya");
	//find the lastname field and enter your  lastname
	WebElement lastname = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
	lastname .sendKeys("sreejith");
	//Address
	WebElement Address=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
	Address.sendKeys("madippakkam,chennai");
	//Email
	WebElement Email = driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
	Email.sendKeys("dev@gmail.com");
	//phone
	WebElement Phone =driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
	Phone.sendKeys("9876543210");
	//Languages
	WebElement lanquages = driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
	lanquages.sendKeys("English");
	//Gender
	WebElement femalegender = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));
	 femalegender.sendKeys("female");
	 //dob
	 Select dropdate=new Select(driver.findElement(By.id("daybox")));
	 dropdate.selectByIndex(5);
	 Select dropmonth =new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
	 dropmonth.selectByIndex(5);
	 Select dropyear = new Select(driver.findElement(By.xpath("//*[@id=\"yearbox\"]")));
	 dropyear.selectByIndex(5);
	 
	//select value from visible text
	//Select dropcountry= new Select(driver.findElement(By.id("countries")));
	//dropcountry.selectByVisibleText("India");
	//select value using index
	//dropcountry.selectByIndex(1);
	 
	Select dropskills= new Select(driver.findElement(By.id("Skills")));
	dropskills.selectByVisibleText("C++");
	
	//Forward Command
	//driver.navigate().forward();
	//Backward Command
	//driver.navigate().backward();
	
	//Find the submit button and click it
	WebElement submitbutton =driver.findElement(By.id("submitbtn"));
	submitbutton.click();
	
	//close the current window
	// driver.close();
}

}
