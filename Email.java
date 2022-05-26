package jabatalks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Email{
	public void email1() throws InterruptedException {


          System.setProperty("webdriver.chrome.driver","C:\\selenium\\Drivers\\chromedriver.exe");

	   	  WebDriver driver = new ChromeDriver();

	      	//launch the chrome browser and navigate to the website
	      	driver.get("https://www.trash-mail.com/inbox/");
	      
	      	//puts an implicit wait for 10 seconds before throwing exceptions
	      	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	      	//locate the email field
	      	WebElement email = driver.findElement(By.xpath("//*[@id='inputEmail']"));

	      	//set the field's value
	      	email.sendKeys("shal.bolloju");
	      	
	      	JavascriptExecutor js = (JavascriptExecutor) driver;
	      	js.executeScript("window.scrollBy(0,250)", "");
	      	
	        //locate and click the next button
	       driver.findElement(By.xpath("//*[@id='fetch-mails']")).click();
	       
	       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	       
	       driver.findElement(By.xpath("//*[@id='refresh-inbox']")).click();
	     
	         List<WebElement> allMessages = driver.findElements(By.xpath("//*[contains(text(), 'Hi bhaskar - Please Complete JabaTalks Account')]"));

	     	//check if text has been found or not
	      	if(allMessages.isEmpty()) {
	   		   System.out.println("Email Not Received");
	      	}else {
	   		   System.out.println("Email Received");
	      	}

	    	//close the chrome browser.
	      	driver.close();


	    }

}


