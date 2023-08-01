package TestLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputDropDown {

	

	    public static void main(String[] args) {

	        // Set the path to the chromedriver executable
	        WebDriverManager.chromedriver().setup();

	        // Create a new instance of the Chrome driver
	        WebDriver driver = new ChromeDriver();

	        // Navigate to the webpage that contains the dropdown input
	        driver.get("https://www.airtel.in/ir-packs/");

	        
	        // Locate the country dropdown input element
	        WebElement countryDropdown = driver.findElement(By.xpath("//input[@class='cursor-pointer']"));

	        // Click on the country dropdown to open the dropdown list
	        countryDropdown.click();

	        // Locate the dropdown list element
	        WebElement dropdownList = driver.findElement(By.className("iti__country-list"));

	        // Get all the country name elements in the dropdown list and print their text values
	        List<WebElement> countryNameElements = dropdownList.findElements(By.tagName("li"));
	        for (WebElement countryNameElement : countryNameElements) {
	            System.out.println(countryNameElement.getText());
	        }

	        // Close the dropdown by clicking on the country dropdown again
	        countryDropdown.click();
//
//	        // Quit the driver
//	       // driver.quit();
	    }

	}

	
	

