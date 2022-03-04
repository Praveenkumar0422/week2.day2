package wwek2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
      driver.manage().window().maximize();
      driver.findElement(By.id("username")).sendKeys("demoSalesManager");
      driver.findElement(By.id("password")).sendKeys("crmsfa");
      driver.findElement(By.className("decorativeSubmit")).click();
      driver.findElement(By.linkText("CRM/SFA")).click();
      driver.findElement(By.xpath("//a[text()='Leads']")).click();
      driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
      driver.findElement(By.xpath("//span[text()='Email']")).click();
      driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("praveen0422a@gmail.com");
      driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
      Thread.sleep(4000);

 driver.findElement(By.xpath("//a[contains(text(),16464)]")).click();
 
 System.out.println( driver.findElement(By.id("viewLead_firstName_sp")).getText());
 driver.findElement(By.linkText("Duplicate Lead")).click();
 String Title=driver.getTitle();
 System.out.println(Title);
 driver.findElement(By.name("submitButton")).click();
 driver.close();

 
      
      
	}

}
