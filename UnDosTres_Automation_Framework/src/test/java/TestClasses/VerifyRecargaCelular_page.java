package TestClasses;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Browsers.Base;
import POM_Classes.Payment_Page;
import POM_Classes.Recarga_Celular_Page;

public class VerifyRecargaCelular_page {
	WebDriver driver;
	Recarga_Celular_Page RecargaCelularPage;
	Payment_Page paymentPage ;
	
	@Parameters("browserName")
	@BeforeTest
	public void launchCrossBrowser(String browser)
	{
		if(browser.equals("Chrome"))
		{
			driver=Base.openCromeBrowser();
			System.out.print("Open Crome Browser");
		}
		if(browser.equals("Opera"))
		{
			driver=Base.openOperaBrowser();
			System.out.print("Open Opera Browser");
		}
		if(browser.equals("Edge"))
		{
			driver=Base.openEdgeBrowser();
			System.out.print("Open Edge Browser");
		}
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeClass
	public void createPOMClassObj() {
		RecargaCelularPage=new Recarga_Celular_Page(driver);
		paymentPage=new Payment_Page(driver); 
	}
	
	@BeforeMethod
	public void launchApplication(){
		driver.get("https://prueba.undostres.com.mx/");
	}
	@Test
	public void verifyPaymentPageDisplayOrNot() throws InterruptedException
	{
		Thread.sleep(2000);
		RecargaCelularPage.passMobileNumber();
		Thread.sleep(2000);
		RecargaCelularPage.clickOnOperator();
		Thread.sleep(2000);
		RecargaCelularPage.selectOperator();
		Thread.sleep(2000);
		RecargaCelularPage.clickOnAmount();
		Thread.sleep(2000);
		RecargaCelularPage.selectAmount();
		Thread.sleep(2000);
		RecargaCelularPage.clickOnRechargeBtn();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		Assert.assertEquals("undostres.com.mx - Recargas en línea Telcel, Movistar, Iusacell, Unefon, Nextel, Virgin, Cierto, Weex, TeleVía, PASE Urbano, IAVE, Viapass", title);
		Assert.assertEquals("https://prueba.undostres.com.mx/payment.php", url);
	
		Thread.sleep(2000);
		paymentPage.clickOnTarjeta();
		Thread.sleep(2000);
		paymentPage.clickOnUsarNuevaTarjeta();
		Thread.sleep(2000);
		paymentPage.passCardNo();
		Thread.sleep(2000);
		paymentPage.passMonth();
		Thread.sleep(2000);
		paymentPage.passDate();
		Thread.sleep(2000);
		paymentPage.passCvv();
		Thread.sleep(2000);
		paymentPage.passEmail();
		Thread.sleep(2000);
		paymentPage.clickOnPaymentBtn();
		Thread.sleep(2000);
		paymentPage.passUsername();
		Thread.sleep(2000);
		paymentPage.passPassword();
		Thread.sleep(2000);
		// Automating Captcha is not the best practice.. so by adding a delay to the Webdriver and manually solve Captcha before click on Login button.
		paymentPage.clickOnLoginBtn();
	}
	
	@AfterMethod
	public void logoutApplication()
	{
		System.out.println("logouthere");
	}
	@AfterClass
	public void clearObject()
	{
		RecargaCelularPage=null;
		paymentPage=null;
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver=null;
		System.gc();
	}
	

}
