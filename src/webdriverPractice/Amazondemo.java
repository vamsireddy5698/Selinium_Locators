package webdriverPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazondemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation Softwares\\chromedriver-win64 (1)\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement ddown = driver.findElement(By.cssSelector("select#searchDropdownBox"));
		Select select = new Select(ddown);
		select.selectByVisibleText("Books");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		

	}

}
