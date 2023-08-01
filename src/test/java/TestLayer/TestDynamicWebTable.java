package TestLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDynamicWebTable {

	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.airtel.in/ir-packs/?utm_source=DigitalMarketing_Ps_Pfx_Google_Search_Airtel_IR&utm_campaign=Pfx_Airtel-IR_Brand_Phrase_Mar23_Airtel-IR_Prepaid_Ad1&kwd=airtel%20prepaid%20ir&cid=ps&gclid=EAIaIQobChMIz6uE9dHC_QIVWTErCh1kYgUwEAAYASAAEgJk1fD_BwE");
		driver.findElement(By.xpath("//input[@class='cursor-pointer']")).click();
		List<WebElement> ls=driver.findElements(By.xpath("//ul[@class='list']//li"));
		for(int i=0;i<ls.size();i++)
		{
			System.out.println("country="+ls.get(i).getText());
		}
	}

}
