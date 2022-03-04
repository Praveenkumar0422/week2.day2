package wwek2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
       driver.findElement(By.id("ext-gen315")).click();
       driver.findElement(By.xpath("//span[text()='Phone']")).click();
       driver.findElement(By.name("phoneNumber")).sendKeys("9876543211");
       driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
       Thread.sleep(4000);
       driver.findElement(By.xpath("//a[text()='17762']")).click();
    
       driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
       driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
       driver.findElement(By.name("id")).sendKeys("17762");
       driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
       String Title=driver.getTitle();
       System.out.println(Title);
       driver.close();     
	}

}
