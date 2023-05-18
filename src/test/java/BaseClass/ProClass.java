package BaseClass;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import pageLayer.LocatorsC;
import pageLayer.lowestPri;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ProClass {
	
	Properties m ;
	public static WebDriver driver;
	public static LocatorsC loc = new LocatorsC();
	public static lowestPri c = new lowestPri();
	public static ExtentSparkReporter Report;
	public static ExtentReports x;
	
	@BeforeTest
	public void project() throws IOException
	{
		if (driver==null) {
			
			
			Report = new ExtentSparkReporter("C:\\Users\\raghu\\eclipse-workspace\\TaskProject\\demoreport\\extent.html");
			x = new ExtentReports();
			x.attachReporter(Report);
			
			

			File n = new File (System.getProperty("user.dir")+"\\src\\test\\resources\\configurations\\configure.pro");
			FileReader a = new FileReader(n); 
			m = new Properties();
			m.load(a);
		}
	
	
	
	if(m.getProperty("Browser").equalsIgnoreCase("Chrome")) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(m.getProperty("Url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	else if (m.getProperty("Browser").equalsIgnoreCase("edge")) {
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get(m.getProperty("Url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	else {
		
		
		System.out.println("this is not valid");
		
	}
	
	
	}
	@AfterTest
	public void quit()
	{
		x.flush();
		driver.quit();
	}
	
}


