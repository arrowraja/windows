package org.windows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathi\\Desktop\\raja\\Day10\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	/*	driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi note 7");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.id("hlb-ptc-btn-native")).click();
		String s = driver.findElement(By.xpath("//h1[@class='a-size-large a-spacing-none']")).getText();
		System.out.println(s);*/
		
	/*	driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("inputValEnter")).sendKeys("iphone 7");
		driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
		driver.findElement(By.xpath("(//p[text()='Apple iPhone 7 ( 32GB , 2 GB ) Black'])[1]")).click();
		String a = driver.getWindowHandle();
		Set<String> b = driver.getWindowHandles();
		for (String c : b) {
			if(!a.equals(c)) {
				driver.switchTo().window(c);
			}}
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
		String text = driver.findElement(By.xpath("//div[@class='you-pay']")).getText();
		System.out.println(text);*/
		
	/*	driver.get("https://www.homedepot.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("headerSearch")).sendKeys("celiling fan");
		driver.findElement(By.id("headerSearchButton")).click();
		driver.findElement(By.xpath("/span[@class='product-pod__title__product'])[1]")).click();
		String a = driver.getWindowHandle();
		Set<String> b = driver.getWindowHandles();
		for (String c : b) {
			if(!a.equals(c)) {
				driver.switchTo().window(c);
			}}
		driver.findElement(By.xpath("(//span[@class='bttn__content'])[4]")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@allowtransparency='true']")));
		String text = driver.findElement(By.xpath("//div[@class='u__husky']")).getText();
driver.get("https://www.amazon.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi note 7");
			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
			driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
			driver.findElement(By.id("add-to-cart-button")).click();
			driver.findElement(By.id("hlb-ptc-btn-native")).click();
			String s = driver.findElement(By.xpath("//h1[@class='a-size-large a-spacing-none']")).getText();
			System.out.println(s);
		System.out.println(text);
		
		driver.findElement(By.id("hello"));
		driver.findElement(By.xpath("welcome"));

		System.out.println(text);*/
		

			

	}

}


