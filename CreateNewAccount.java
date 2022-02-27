package wwek2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
driver.findElement(By.name("firstname")).sendKeys("praveenkumar");
driver.findElement(By.name("lastname")).sendKeys("s");
driver.findElement(By.name("reg_passwd__")).sendKeys("Praveen@1997");
driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9094948938");
WebElement birthDate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
Select date=new Select(birthDate);
date.selectByVisibleText("4");
WebElement birthMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
Select month=new Select(birthMonth);
month.selectByValue("10");
WebElement birthYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
Select year=new Select(birthYear);
year.selectByValue("1997");

driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();








	}

}
