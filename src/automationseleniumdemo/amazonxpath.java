package automationseleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonxpath {

	public static void main(String[] args) {
		System.setProperty("webdiver.chrome.driver", "C:\\Users\\Devavrath\\Desktop\\automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		WebElement watchwomen= driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		watchwomen.sendKeys("watches for women");
	
	    WebElement searchbutton = driver.findElement(By.xpath("//*[@id='nav-search-submit-button']"));
	    searchbutton.click();
				
				//Relative Xpath
	   /* WebElement watchwomen1= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    watchwomen1.clear();
	    WebElement watchmen = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    watchmen.sendKeys("watches for men");
	    WebElement searchbutton2 = driver.findElement(By.xpath("//*[@id='nav-search-submit-button']"));
				searchbutton2.click();*/
			
				//Xpath with OR
		/*WebElement watchwomen2= driver.findElement(By.xpath("//*[@id='twotabsearchtextbox' or @name='field-keywords']"));
		watchwomen2.sendKeys("watches for women");
		WebElement searchbutton3 = driver.findElement(By.xpath("//*[@id='nav-search-submit-button'or @class='nav-input nav-progressive-attribute']"));
	     searchbutton3.click();*/
			    
			    //Xpath with AND
	   WebElement watchwomen2= driver.findElement(By.xpath("//*[@id='twotabsearchtextbox' and @name='field-keywords']"));
		watchwomen2.sendKeys("watches for women");
		WebElement searchbutton3 = driver.findElement(By.xpath("//*[@id='nav-search-submit-button'and @class='nav-input nav-progressive-attribute']"));
	     searchbutton3.click();
	     
	     //xpath with contains

			WebElement watchwomen= driver.findElement(By.xpath("//input[contains@id,'twotabsearch')]"));
			watchwomen.sendKeys("watches for women");
			WebElement searchbutton = driver.findElement(By.xpath("//input[contains@id,'nav-search-submit']"));
		    searchbutton.click();
		    
		    //starts with
		   
		    WebElement watchwomen= driver.findElement(By.xpath("//input[starts-with@id,'twotabsearch')]"));
			watchwomen.sendKeys("watches for women");
			WebElement searchbutton = driver.findElement(By.xpath("//input[starts-with@id,'nav-search-submit']"));
		    searchbutton.click();
	}

}
