package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseClass.ProClass;

public class LocatorsC extends ProClass {
	
	By text = By.xpath("//h1[text()='Welcome to the Simple Travel Agency!']");
	By Click = By.xpath("//a[text()='destination of the week! The Beach!']");
	By down = By.xpath("//select[@name=\"fromPort\"]");
	By drop = By.xpath("//select[@name=\"toPort\"]");
	By cli = By.xpath("//input[@type=\"submit\"]");
	public boolean Loc()
	{
		
		boolean a = driver.findElement(text).isDisplayed();
		return a; 
		
	}
	
	
	public boolean checkUrl() throws InterruptedException
	{
		
		driver.findElement(Click).click();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		boolean con = currentUrl.contains("vacation");
		System.out.println(con);
		Thread.sleep(2000);
		return con;
		}
	
	
	public void Drop() throws InterruptedException
	{
		WebElement abc = driver.findElement(down);
		Select h = new Select(abc);
		h.selectByIndex(5);
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(drop);
		Select f = new Select (element);
		f.selectByIndex(2);
		Thread.sleep(2000);
		
		driver.findElement(cli).click();
		Thread.sleep(2000);
	}
	
			}
	

