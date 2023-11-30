package Tech_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Tech_test01
{


	public static void main(String[] args) throws InterruptedException 
	{
		//I:Open the browser
		
		//create object of chromedriver class by providing reference of the webdriver

		ChromeOptions CO = new ChromeOptions();

		CO.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		CO.addArguments("start-maximized");

		//create object of chromedriver class by providing reference of the webdriver
	    WebDriver driver=new ChromeDriver(CO);
	    
        

        // Task 1: Confirm accessibility of the top-level menus
	    driver.get("https://www.tendable.com");
	    
        // Task 2: Verify "Request a Demo" button on each top-level menu page
      
	    driver.findElement(By.xpath("(//a[text()='Request a Demo'])[2]")).click();
        // Task 3: Navigate to "Contact Us" section
	    
	    //wait
        Thread.sleep(2000);
        
	    driver.navigate().back();
	 
	  driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
	    
    	// Task 4: choose "Marketing", and submit the form  
	
      driver.findElement(By.xpath("(//button[text()='Contact'])[1]")).click();
     	
      //wait
      Thread.sleep(2000);
       
     //step 1: enter full name
      
      driver.findElement(By.xpath("(//input[@name='fullName'])[1]")).sendKeys("abcde");
      
      //wait
      Thread.sleep(2000);
      
      // step 2: enter organisation name
      
      driver.findElement(By.xpath("(//input[@name='organisationName'])[1]")).sendKeys("abcd pvt.ltd");
      //wait
      Thread.sleep(2000);
      
      //step 3: enter mobile no:
      
      driver.findElement(By.xpath("(//input[@name='cellPhone'])[1]")).sendKeys("9876543210");
      //wait
      Thread.sleep(2000);
      
      //step 4: enter email id
      driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("abc123@gmail.com");
      //wait
      Thread.sleep(2000);
      
      //step 5: select  listbox
      
    WebElement  JobRole =driver.findElement(By.xpath("//select[@name='jobRole']"));
      
      Select S1= new Select(JobRole);
      
      S1.selectByIndex(3);
      //wait
      Thread.sleep(2000);
      
      
      //step 6: write message
      driver.findElement(By.xpath("(//textarea[@name='message'])[1]")).sendKeys("Hello Hi");
      
      //wait
      Thread.sleep(2000);
      
     //Step 7: select radio button 
      driver.findElement(By.xpath("//input[@type='radio']")).click();
      
      //wait
      Thread.sleep(2000);
      //step 8: click submit button
      driver.findElement(By.xpath("//button[text()='Submit']")).click(); 

      // Close the browser
     // driver.quit();
      
	}
	

   

}
