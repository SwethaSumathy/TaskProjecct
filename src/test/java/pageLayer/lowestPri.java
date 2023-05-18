package pageLayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass.ProClass;

public class lowestPri extends ProClass {


//	ArrayList<Double> stri= new ArrayList<>();
	By low = By.xpath("//tbody/tr[3]/td[1]/input[1]");
	By ins = By.xpath("//h2[text()='Your flight from TLV to SFO has been reserved.']");
	By high = By.xpath("//em[contains(text(),'914.76')]");
	By check = By.xpath("//input[@type=\"submit\"]");
	By pur = By.xpath("//h1[contains(text(),'Thank you for your purchase today!')]");
	By ID = By.xpath("//tbody/tr[1]/td[2]");
	public void select()
	{

		List<WebElement> web = driver.findElements(By.xpath("//table[@class=\"table\"]//td[6]"));


		ArrayList <Double>  a = new ArrayList<>();



		for (int i=0; i<web.size();i++)
		{

			WebElement webElement = web.get(i);
			String text = webElement.getText();
			String substring = text.substring(1);
			System.out.println(substring);
			double price = Double.parseDouble(substring);
			a.add(price);

		}



		Double b = Collections.min(a);
		System.out.println(b);

	}


	public void p() throws InterruptedException
	{
		driver.findElement(low).click();
		Thread.sleep(3000);
	}
public void tit()
{
	
	String sfo  = driver.findElement(ins).getText();
	System.out.println(sfo);
}

	public String cost()
	{
		String ice = driver.findElement(high).getText();
		return ice;
	}


	public void conform() throws InterruptedException
	{

		driver.findElement(check).click();
		Thread.sleep(1000);
	}


	public String purchase() throws InterruptedException
	{
		String text = driver.findElement(pur).getText();
		Thread.sleep(3000);
		return text;
	}


	public String console() throws InterruptedException
	{
		String print = driver.findElement(ID).getText();	
		Thread.sleep(1000);
		return print;
	}
}
