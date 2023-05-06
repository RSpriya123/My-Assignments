package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		//Launch the browser
        ChromeDriver driver=new ChromeDriver();
        
        //Load the url 
        driver.get(" https://en-gb.facebook.com/");
        
        //Maximize the window
        driver.manage().window().maximize();
        
        //Add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        //Click on Create New Account button
        driver.findElement(By.linkText("Create new account")).click();
        
        //Enter the first name
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Priya");
        
        //Enter the last name
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Raj");
        
        //Enter the mobile number
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("12345678");
        
        //Enter the new password
        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Learning");
        
        //Handle all the three drop downs //Drop down 1
         WebElement drop1 = driver.findElement(By.id("day"));
         Select source1 =new Select (drop1);
         source1.selectByVisibleText("30");
         
         //Drop down 2
         WebElement drop2 = driver.findElement(By.id("month"));
         Select source2 =new Select (drop2);
         source2.selectByVisibleText("Sep");
         
         //Drop down 3
         WebElement drop3 = driver.findElement(By.id("year"));
         Select source3 =new Select (drop3);
         source3.selectByVisibleText("1986");
         
         //Select the radio button "Female" 
         driver.findElement(By.xpath("//label[@class='_58mt']")).click();
         
         

	}

}
