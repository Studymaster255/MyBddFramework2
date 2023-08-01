package TestLayer;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ecozensolutions.com/");
		WebElement wb=driver.findElement(By.xpath("//select[@id='ca[14][v]']"));
		List<WebElement> lss=new ArrayList<WebElement>();
		
		lss=PriticeDropDown.printAllValuesFromDropDown(wb);
		for(int i=0;i<lss.size();i++)
		{
			System.out.println(lss.get(i).getText());
		}
		System.out.println("count="+PriticeDropDown.countValuesFromDropDown(wb));	
	driver.close();
	}
	

}
