package wwek2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
//Thread.sleep(4000);
//driver.close();
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
driver.findElement(By.xpath("(//input[@class ='inputLogin'])[2]")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[@type='submit']")).click();

driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
driver.findElement(By.xpath("//a[contains(text(),'Lead')]")).click();
driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("barcalys");
driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("yuvaraj");
driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_lastName')]")).sendKeys("s");
WebElement sourceId = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
Select source=new Select(sourceId);
source.selectByIndex(6);
driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
String Title=driver.getTitle();
System.out.println(Title);




	}

}
