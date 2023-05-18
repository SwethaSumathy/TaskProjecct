package TestLayer;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import BaseClass.ProClass;

public class ObjectC extends ProClass{
	
	@Test(priority = 0)
	public void Obj()
	{
		boolean title = loc.Loc();
		System.out.println(title);
	}
	
	
	@Test(priority = 1)
	public void boo() throws InterruptedException
	{
		boolean checkUrl = loc.checkUrl();
		System.out.println(checkUrl);
		driver.navigate().back();
	}
	
	
	@Test(priority =2)
	public void doo() throws InterruptedException
	{
		loc.Drop();
	}
	
	
	@Test(priority = 3)
	public void price()
	{
		c.select();
	}
	
	
	@Test(priority = 4)
	public void flight() throws InterruptedException
	{
		c.p();
	}
	@Test(priority =5)
	public void news ()
	{
		
		c.tit();
		
	}
	
	@Test(priority = 6)
	 public void total()
	 {		 
		 String cost = c.cost();
		 System.out.println(cost);
	 }
	
	
	@Test(priority = 7)
	public void finish() throws InterruptedException 
	{		
		c.conform();
		
	}
	
	
	@Test(priority = 8)
	public void valid() throws InterruptedException
	{		 
		String purchase = c.purchase();
		System.out.println(purchase);
	}
	
	
	@Test(priority = 9)
	public void end() throws InterruptedException
	{		
		String con = c.console();
		System.out.println(con);
	}
	
	
	@Test(priority = 10)
	public void Report()
	{
		
		x.createTest("reports").assignAuthor("swetha").assignDevice("Chrome").log(Status.PASS, "Id=1684409809888");
		
		
	}
}
