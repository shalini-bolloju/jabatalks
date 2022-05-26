package jabatalks;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\Drivers\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

      	//launch the chrome browser and navigate to the website
		driver.get("https://jt-dev.azurewebsites.net/#/SignUp");
		
      	//puts an implicit wait for 10 seconds before throwing exceptions
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		
       //locate the language and click on the element
        WebElement  selectMyElement =driver.findElement(By.id("language"));
		selectMyElement.click();
		Thread.sleep(2000);
		
		//locate and get text from field
		String expopt1= driver.findElement(By.xpath("//*[@id='ui-select-choices-row-1-0']/a")).getText();
	    System.out.println(expopt1);
	    
		//locate and get text from field
	    String expopt2= driver.findElement(By.xpath("//*[@id='ui-select-choices-row-1-1']/a/div")).getText();
	    System.out.println(expopt2);
	    
	    //locate the name and set field value
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("bhaskar");
        
	    //locate the Organization name and set field value
        driver.findElement(By.xpath("//input[@id='orgName']")).sendKeys("Bridge shop");
        
	    //locate the Email and set field value
        driver.findElement(By.xpath("//input[@id='singUpEmail']")).sendKeys("shal.bolloju@trash-mail.com");
        
	    //locate the element Iagree the terms and conditions and click on the element
        driver.findElement(By.xpath("//*[@id='content']/div/div[3]/div/section/div[1]/form/fieldset/div[4]/label/span")).click();
        
        //locate the Signup and click on the element
        driver.findElement(By.xpath("//*[@id='content']/div/div[3]/div/section/div[1]/form/fieldset/div[5]")).click();
        Thread.sleep(10000);
        
        //locate and validate the Email sent text
       String expemail= driver.findElement(By.xpath("//*[@id='content']/div/div[3]/div/section/div[1]/form/div/span")).getText();
       System.out.println(expemail);
       
       Email obj=new Email();
       obj.email1();

	}
}

