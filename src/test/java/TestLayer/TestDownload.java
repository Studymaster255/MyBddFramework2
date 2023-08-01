package TestLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDownload {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-translate");
		options.addArguments("--start-maximized");
//		options.setExperimentalOption("prefs", prefs);
//		ChromeDriverService cap = DesiredCapabilities.chrome();
//		cap.setCapability(ChromeOptions.CAPABILITY, options);
	//	WebDriver driver = new ChromeDriver(cap);
//		Thread.sleep(5000);
//		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=111.0.5563.19/");
//		WebElement wb=driver.findElement(By.xpath("//a[text()='chromedriver_win32.zip']"));
//		wb.submit();
//		System.out.println(driver.getCurrentUrl());
	}

}
