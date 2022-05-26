Jabatalks login app automate tested with selenium, java and eclipse IDE 
 **Table of contents**
1. General information
2. Technologies
3. setup
4. status
  **Introduction**
This project is used to automate the application in the web browser. The application is login app for the website Jabatalks. Jabatalks is an automated voice interview tool that combines the resumé review process with an automated first round phone screen. JabaTalks was developed to bridge that gap and create a solution that served both parties. JabaTalks' automated voice interview system provides hiring teams with insight to a candidate's soft skills at the earliest stage of the hiring process.
**Technologies**
The languages we used, the libraries and its versions. 
1. Java-java version "1.8.0_231"
   Java (TM) SE Runtime Environment (build 1.8.0_231-b11)
   Java Hotspot (TM) 64-Bit Server VM (build 25.231-b11, mixed mode)
2. Eclipse JavaEE IDE 
   Version: Neon.3 Release (4.6.3)
3. Selenium Webdriver java client
4. Chrome Browser
   Version 101.0.4951.67 (Official Build) (64-bit)
 
**Setup**
**java installation:**
Step 1: Verify that it is already installed or not
 Check whether Java is already installed on the system or not. In my case, it is not installed         therefore I need to install JDK 1.8 on my computer.
Step 2: Download JDK
   Click the below link to download jdk 1.8 for you windows 64 bit system.
Step 3: Install JDK
 Open the executable file which you have just downloaded and follow the steps.
step 4: Set the Permanent Path
 Open the executable file which you have just downloaded and follow the steps.
JavaFX Install JDK
Click Next to continue
JavaFX Install JDK 1
Just Choose Development Tools and click Next.
JavaFX Install JDK 2
Set up is being ready.
JavaFX Install JDK 3
Choose the Destination folder in which you want to install JDK. Click Next to continue with the installation.
JavaFX Install JDK 4
Set up is installing Java to the computer.
JavaFX Install JDK 5
We have successfully installed Java SE development kit 8. Close the installation set up.
Step 5: Set the Permanent Path
To execute Java applications from command line, we need to set Java Path. To set the path, follow the following steps.
Install Java Set the Permanent Path
Right click on "this PC". It can be named as "My Computer" in some systems. Choose "properties" from the options.
Install Java Set the Permanent Path 1
The screen look alike the above image will open. Click on "Advanced system settings" to continue.
 Install Java Set the Permanent Path 2
Above window will open. Click on "Environment Variables" to continue.
Install Java Set the Permanent Path 3
Enter "path" in variable name and enter the path to the bin folder inside your JDK in the variable value. Click OK.
Now Java Path has been set up. Open the Command prompt and type "javac" In case you have already open up the command prompt, I suggest you to close the existing window and reopen it again.

 Install Java Set the Permanent Path 4
The Java has been installed on our system. Now, we need to configure IDEs like NetBeans or Eclipse in order to execute applications.
Install Eclipse
Step 1: Download the Latest version
Step 2: Install Eclipse
Double click on the exe file which has just been downloaded. The screen will look like following. Click Run to proceed the installation.
Choose the software suit which you want to install. In our case, we have chosen Eclipse IDE for Java Developers which is recommended in our case.
Now, the Setup is ready to install Eclipse oxygen 64 bit in the directory shown in the image. However, we can select any destination folder present on our system. Just click install when you done with the directory selection.
The set up will ask us to accept the Eclipse Foundation Software Agreement. Just click Accept to continue.
Now, we will have to wait for the time the Eclipse will be installing on our system. Once the installation will be done, the following screen will appear. Just click the LAUNCH button to launch eclipse.
Browse the workspace directory, just click the Launch button once you done with the process.
We have got the Eclipse IDE opened on our system. However, the screen will appear like following. Now, we are all set to configure Eclipse in order to run the JavaFX application.
JavaFX with Eclipse
Exporting JavaFX jar files to the Java Project
Just click on the file icon appeared at the top left corner of the eclipse screen. Click on new and select Java project from the various types of options given in the list.
The following Pop-up window will be opened. Enter the project details like project name and click Finish.
Now, we have created our project. The project doesn't support the JavaFX syntax. We need to export the JavaFX jar files to the project in order to run the JavaFX application.
Just Right click on the project and select properties from the options.
Go to Java Build Path → Libraries. Here, the JRE System Library is shown which is responsible to execute our java project. We need Add a Library here, choose Add Library from the options in the list given on the right side of the screen.
Choose User Library from the list and click Next to continue.

Now, we are in the user library section. We need to create a new User Library hence choose New from the list given on the right side of the system.
Just enter Java in the user library name and press OK.
Now, a user library named as Java has been created, we need to add some external JARs file here to make our project working.
Click on Add External JARs from the list given on the right side of the system and choose appropriate JAR files from the system.
browse to Java/jre1.8.0_161/lib in the system and select jfxswt.ja rpresent in the directory. However, to set-up the appropriate environment for JavaFX application, we need to add one more JAR file so just browse to Java/jre1.8.0_161/lib/ext and choose jfxrt.jar.
Now, we are all ready to execute our first class file of the project. We have added the number of JAR files to our project. Click on Apply and Close to apply the settings to the project.
However, this is valid for this project only and we have to repeat this whole procedure with the other projects as well. It is not the better idea to implement but we can execute the JavaFX applications for now.
Right click on the project and follow New → Class to create your first class of the application. Copy and paste some JavaFX code and run the application
We have just executed our first JavaFX application by exporting JAR files to the project.
Download Selenium WebDriver Java Client
**Open URL: https://docs.seleniumhq.org/download/**
It will redirect you to the "downloads page" of Selenium official website.
Scroll down through the web page and locate Selenium Client & WebDriver Language Bindings.
Click on the "Download" link of Java Client Driver
The downloaded file would be in zipped format. Unpack the contents in a convenient directory. It contains the essential jar files required to configure Selenium WebDriver in Eclipse IDE.
4. Configure Selenium WebDriver
**Launch Eclipse IDE**
Create a new Java Project from File > New > Java Project.
click on "Java Build Path" option from the left hand side panel.
Switch to Libraries tab and click on "Add External JARs" button.
Once you get all the Selenium jar files in your Libraries tab, click on Apply and Close button.
**Install Chrome driver**
Step 1: First download the Chrome Driver.
Step 2: Once the zip file is downloaded for the operating system, unzip it to retrieve the chromedriver.exe executable file.
Step 3: Now copy the path where the Chrome Driver file is saved to set the system properties in environment variables.

**How to Run the projec**t
step 1: In the Package Explorer, select the test or test suite you want to run.
step 2: Select Run > Run...
step 3: Choose the "JUnit Plug-in Test" category, and click the button to create a new test.
step 4: On the "Main" tab, select the appropriate application for that test.
Click Run.
**Features**
1. Easily can handle the testing by automating the test cases.
2. In this, application we can test the all test cases by automating testing only.
3. we need not to be manually testing the test cases of the login application.
4. we can validate, even the email has received or not.
**Example of Use**
In this project, we have done the validation of email received also. So, we get code from the other website that is mailtrap. The code should be necessary for this application to validate the email has received.
**Example of code:**
public class Email {
public static void main(String [] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\selenium\\Drivers\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
             //launch the chrome browser and navigate to the website
	      driver.get("https://mailtrap.io/signin");
	      //puts an implicit wait for 10 seconds before throwing exceptions
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                               //locate the email field
	      	WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
                            //set the field's value
	      	email.sendKeys("shal.bolloju+1@gmail.com");
	      	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                            JavascriptExecutor js = (JavascriptExecutor) driver;
	      	js.executeScript("window.scrollBy(0,250)", "");
	      	//locate and click the next button
	             driver.findElement(By.xpath("//*[@id='new_user']/div[3]/a")).click();
                           //locate the password field
	      	WebElement password driver.findElement(By.xpath("//input[@type='password']"));
                              //set the password's value
	      	password.sendKeys("Test@1234");
	      	js.executeScript("window.scrollBy(0,250)", "");
                             //locate and click the submit button
	      	driver.findElement(By.xpath("//input[@type='submit']")).click();
                             //locate My Inbox and click it
	      	// driver.findElement(By.xpath("//a[@title='My Inbox']")).click();
	        //look for the given text in the list of web elements
	      	List<WebElement> allMessages = driver.findElements(By.xpath("//*[contains(text(),         'Here   comes an attachment')]"));
                            //check if text has been found or not
	      	if(allMessages.isEmpty()) {
	   		   System.out.println("Test not passed");
	      	}else {
	   		   System.out.println("Test passed");
	      	}
                              //close the chrome browser.
	      	driver. Close();
  }
}
   
    In this Email validation, we use the trash-mail addresses for the testing purpose. To validate that the email is received or not.
 **Project Status:**
 It's worth to add a project status - especially if the project is tested the application. If it's our library, direction of development or to emphasize we're done with its testing.
