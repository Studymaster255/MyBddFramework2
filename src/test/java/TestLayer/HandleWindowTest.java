package TestLayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import UtilsLayer.HandleWindowMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindowTest {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amezon.in/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles",Keys.ENTER);
		for(int i=1;i<4;i++)
		{
			driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])["+i+"]")).click();
		}
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		Set<String> ls=driver.getWindowHandles();
		
		System.out.println(driver.getTitle());
	
	}

}
