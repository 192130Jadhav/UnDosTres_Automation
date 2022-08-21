package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {
	
	public static WebDriver openCromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\ChromeBrowserNewVersion\\chromedriver_win32 (104)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
		
	}
	public static WebDriver openEdgeBrowser()
	{
		System.setProperty("webdriver.edge.driver","E:\\EdgeBrowserNew Version\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		return driver;
		
	}
	public static WebDriver openOperaBrowser()
	{
		System.setProperty("webdriver.opera.driver","E:\\OperaBrowserNewVersion\\operadriver_win64\\operadriver_win64\\operadriver.exe");
		WebDriver driver=new OperaDriver();
		return driver;
		
	}

}
