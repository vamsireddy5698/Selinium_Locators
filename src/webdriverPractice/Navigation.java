package webdriverPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		
		String baseurl = "https://www.selenium.dev";
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation Softwares\\chromedriver-win64 (1)\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		
        driver.navigate().to("https://www.youtube.com");
		
		Thread.sleep(1000);
		
		driver.navigate().to("https://mail.google.com");
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("identifierId")).sendKeys("Vams@123");
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		System.out.println(" The Current Url is "+driver.getCurrentUrl());

	}

}
