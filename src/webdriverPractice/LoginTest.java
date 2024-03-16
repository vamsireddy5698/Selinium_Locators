package webdriverPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation Softwares\\chromedriver-win64 (1)\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("The Title is "+title);
		
		String url =driver.getCurrentUrl();
		
	//login
		
		WebElement uname = driver.findElement(By.id("ctl00_MainContent_username"));
		uname.sendKeys("Tester");
		
		WebElement pwd = driver.findElement(By.id("ctl00_MainContent_password"));
		pwd.sendKeys("testing");
		
		Thread.sleep(1000);
		pwd.clear();
		Thread.sleep(1000);
		pwd.sendKeys("test");
		
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		driver.findElement(By.id("ctl00_logout")).click();
		
		TakesScreenshot tc = (TakesScreenshot)driver;
		File src= tc.getScreenshotAs(OutputType.FILE);
		File login = new File(".\\images\\login.png");
		FileUtils.copyFile(src, login);
		
		
		//driver.close(); // It closes the active browser
		
		//driver.quit(); //method closes all the windows opened by webdriver
		
		
		
		

	}

}
