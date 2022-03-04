package wwek2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
       driver.findElement(By.id("username")).sendKeys("demoSalesManager");
       driver.findElement(By.id("password")).sendKeys("crmsfa");
       driver.findElement(By.className("decorativeSubmit")).click();
       driver.findElement(By.linkText("CRM/SFA")).click();
       driver.findElement(By.xpath("//a[text()='Leads']")).click();
       driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
      Thread.sleep(20);
     
     
    driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("Praveenkumar");

    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    driver.findElement(By.linkText("16464")).click();
    String Title=driver.getTitle();
    System.out.println(Title);
    driver.findElement(By.xpath("//a[@class='subMenuButton']")).click();
    WebElement CompanyName = driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
    CompanyName.clear();
    CompanyName.sendKeys("BNP Paribas");
    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
    Thread.sleep(9000);
    driver.close();
	}

}
