package cross;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Crossbrow {

	public static void main(String[] args) throws InterruptedException {
	
	System.out.println("enter brower name");
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	String x=sc.nextLine();
	@SuppressWarnings("unused")
	WebDriver driver = null;
	if(x.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:/testing1/chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	
	else if(x.equals("firefox"))     
	{
		System.setProperty("webdriver.gecko.driver","C:/testing1/geckodriver.exe");
		driver=new FirefoxDriver();
		
	
		
	
	}

	else {
		System.out.println("wrong browser name");
		
		System.exit(0);
		
	}
	
	driver.get("http://site24.way2sms.com/content/index.html");
	String x1=driver.getCurrentUrl();
	if(x1.contains("https"))
	{
		System.out.println("secured");
	}
	else
	{
		System.out.println("not secured");
	}
	
	
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@src='../images/android-button.png']")).click();
	Thread.sleep(10000);
	
	
	driver.close();
	
	
	
		
	}
	

}