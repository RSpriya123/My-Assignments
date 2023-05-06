package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteLead {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8940513988");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement leadId = driver.findElement(By.xpath("//a[text()='10741']"));
		String leadId1 = leadId.getText();
		System.out.println(leadId1);
		driver.findElement(By.linkText("10741")).click();
        driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10741");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement rec = driver.findElement(By.xpath("//div[@class='x-paging-info']"));
		String rec1=rec.getText();
		if (rec1=="no records found")
		{
			System.out.println("No records found");
		
		}
		else
		{				
		System.out.println(rec1);
		}
		//driver.close();
	

}
}
