package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLoginScript {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		String baseUrl = "https://learn.letskodeit.com/p/practice";
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.findElement(By.xpath(".//a[@href='/sign_in']")).click();
		driver.findElement(By.id("user_email")).sendKeys("test@email.com");
		driver.findElement(By.id("user_password")).sendKeys("abcabc");
		driver.findElement(By.name("commit")).click();
		Thread.sleep(3000);
		System.out.println("Login Successful");
		Thread.sleep(2000);
		driver.findElement(By.linkText("All Courses")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//li[@class='dropdown']")).click();
		driver.findElement(By.xpath(".//a[@href='/sign_out']")).click();
		System.out.println("LogOut Successful");
		driver.quit();
	}

}
