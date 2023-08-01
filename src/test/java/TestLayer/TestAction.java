package TestLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ESCAPE).build().perform();
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		//WebElement electronic=driver.findElement(By.xpath("//div[text()='Electronics']"));
		//act.moveToElement(electronic).build().perform();
//		WebElement camera=driver.findElement(By.xpath("//a[text()='Cameras & Accessories']"));
//		act.moveToElement(camera).build().perform();
//		WebElement dslr=driver.findElement(By.xpath("//a[text()='DSLR & Mirrorless']"));
//		act.moveToElement(dslr).click().build().perform();
//		act.contextClick(electronic).build().perform();
//		
//		Thread.sleep(3000);
//		
//		act.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_LEFT).build().perform();
		System.out.println(driver.getCurrentUrl());
	}

}
