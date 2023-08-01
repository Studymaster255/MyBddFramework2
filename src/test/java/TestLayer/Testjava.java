package TestLayer;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;
import UtilsLayer.JavaScriptMethods;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Testjava extends BaseClass {
	public static JavaScriptMethods jsm;
	public static void main(String[] args) throws IOException {
//		BaseClass base=new BaseClass();
//		BaseClass.intilization();
//		JavascriptExecutor js=(JavascriptExecutor)driver;
		
//		
//		int n = 10;
//	    double sum = 0.0;
//	    for (int i = 1; i <= n; i++) {
//	      sum += 1.0/i;
//	    }
//	    System.out.println("The sum of the first " + n + " terms of the harmonic series is: " + sum);
	
		 System.out.print("Enter any number : ");
	        Scanner s = new Scanner(System.in);
	        int num = s.nextInt();
	        System.out.print("The Harmonic Series is : ");
	        double result = 0.0;
	        while(num > 0)
	          {
	               result = result + (double) 1 / num;
	               num--;
	               System.out.print(result +"  ");
	          }
	        System.out.println("");
	        System.out.println("Output of Harmonic Series is "+result);
	
	}
	
	
//	@Test
//	public void method_one() {
//		Assert.assertEquals("selenium", "selenium");
//	}
//
//	@Test(dependsOnMethods = {"method_one"})
//	public void method_two() {
//		Assert.assertEquals(12*12,14);
//	}
//	
//	@Test(dependsOnMethods = {"method_two"})
//	public void method_three() {
//		Assert.assertEquals("java","java");
	}

