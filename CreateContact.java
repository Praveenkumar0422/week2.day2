package wwek2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("demoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.linkText("Create Contact")).click();
        driver.findElement(By.id("firstNameField")).sendKeys("joe");
        driver.findElement(By.id("lastNameField")).sendKeys("steve");
        driver.findElement(By.name("departmentName")).sendKeys("mechanical");
        driver.findElement(By.id("createContactForm_description")).sendKeys("teastleaf selenium");
        driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abcd@gmail.com");
        WebElement StateId = driver.findElement(By.name("generalStateProvinceGeoId"));
        Select state=new Select(StateId);
        state.selectByVisibleText("New York");
        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        WebElement DescriptionId = driver.findElement(By.id("updateContactForm_description"));
       DescriptionId.clear();
       driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("selenium learning");
       driver.findElement(By.xpath("//input[@name='submitButton']")).click();
       String Title=driver.getTitle();
       System.out.println(Title);

       
        
        
	}

}
