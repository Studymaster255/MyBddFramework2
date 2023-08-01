package TestLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class PriticeDropDown extends BaseClass {
	public static Select sel;
//	public PriticeDropDown(WebElement wb)
//	{
//		sel=new Select(wb);
//	}
	
	public static void selectByIndex(WebElement wb,int index)
	{
		new Select(wb).selectByIndex(index);
	}
	
	public static void selectByValue(WebElement wb,String value)
	{
		new Select(wb).selectByValue(value);
	}
	
	public static void selectByVisibleText(WebElement wb,String visibleText)
	{
		new Select(wb).selectByVisibleText(visibleText);
	}
	
	public static String checkSelectedValue(WebElement wb)
	{
		return new Select(wb).getFirstSelectedOption().getText();
	}
	
	public static int countValuesFromDropDown(WebElement wb)
	{
		return new Select(wb).getOptions().size()-1;
	}
	/**
	 * Contractor accepts WebElemnt locator of dropDown
	 * @return List<WebElement>
	 */
	public static List<WebElement> printAllValuesFromDropDown(WebElement wb)
	{
	//	List<WebElement> ls=new Select(wb).getOptions();
//		for(int i=0;i<ls.size();i++)
//		{
//			return ls
//			//System.out.println("element no= "+i+" "+ls.get(i).getText());
//		}
		return new Select(wb).getOptions();
	}
}
