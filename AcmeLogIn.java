package wwek2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeLogIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
     driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
     driver.findElement(By.id("password")).sendKeys("leaf@12");
     driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
    String Title = driver.getTitle();
    System.out.println(Title);
    driver.findElement(By.xpath("//a[text()='Log Out']")).click();
    driver.close();
	
	
	}
	

}
