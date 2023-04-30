package week2.day1;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
        ChromeDriver driver=new ChromeDriver();
        
        //Load the url http://leaftaps.com/opentaps/control/login
        driver.get("http://leaftaps.com/opentaps/control/login");
        
        //Find the element username  Enter the username
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        
        //Find the element password Enter the password
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        Thread.sleep(1000);
        
        //Click Login button
        driver.findElement(By.className("decorativeSubmit")).click();
        
        //Click on CRM/SFA
      	driver.findElement(By.linkText("CRM/SFA")).click();
      	
        //Click Leads
        driver.findElement(By.linkText("Leads")).click();
        
       //Click create Lead
      	driver.findElement(By.partialLinkText("Create")).click();
      	
      //Enter Company name
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
        
      //Enter First name
      	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
      		
      //Enter Last name
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raj");
        
       //Enter First Name(local)
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Priya Raj");
        
        //Enter Department field
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer Science");
        
        //Enter Description field
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Interesting to learn selenium");
        
        //Enter Email Address
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("prsaravana@gmail.com");
        Thread.sleep(1000);
        
        //Click Create Lead button
		driver.findElement(By.name("submitButton")).click();
		
		//Click Duplicate Lead button
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		//Clear Company Name field and enter new value
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf Selenium");
		
		//Clear First Name field and enter new value
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SaravanaPriya");
		
		//Click Create Lead button
		driver.findElement(By.name("submitButton")).click();
		
		//To Print the title of  the page
		String title = driver.getTitle();  
		System.out.println(title);

	}

}
