package TestLayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import BaseLayer.BaseClass;

public class HandleWindowMethodTest extends BaseClass {
	
	public static void handleMultipleMethods(Set<String> ls)
	{
		//Set<String> ls=driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<String>(ls);
		Iterator<String> it=arr.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
		}
	}

}
