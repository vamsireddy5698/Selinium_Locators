package webdriverPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Softwares\\chromedriver-win64 (1)\\Chromedriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		driver.switchTo().alert().sendKeys("Hello Vamsi");
		driver.switchTo().alert().accept();
		
		String message = driver.switchTo().alert().getText();
		System.out.println(message);
		
		
		

	}

}
