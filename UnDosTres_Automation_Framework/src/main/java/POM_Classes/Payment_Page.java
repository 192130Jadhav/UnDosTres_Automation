package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page {
	
	@FindBy (xpath="//a[@id='new-card-toggle']")
	private WebElement tarjeta;
	
	@FindBy (xpath="(//a[@style='font-size: 16px; color: var(--udtlightblue); padding-left: 17px;'])[1]")
	private WebElement usarNuevaTarjeta;
	
	@FindBy (xpath="//input[@id='cardnumberunique']")
	private WebElement cardno;
	
	@FindBy (xpath="(//input[@name='expmonth'])[2]")
	private WebElement month;
	
	@FindBy (xpath="(//input[@name='expyear'])[2]")
	private WebElement date;
	
	@FindBy (xpath="(//input[@name='cvvno'])[2]")
	private WebElement cvv;
	
	@FindBy (xpath="(//input[@name='txtEmail'])[1]")
	private WebElement email;
	
	@FindBy (xpath="//button[@id='paylimit']")
	private WebElement btnPayment;
	
	@FindBy (xpath="//input[@id='usrname']")
	private WebElement username;
	
	@FindBy (xpath="//input[@id='psw']")
	private WebElement password;
	
	@FindBy (xpath="//button[@id='loginBtn']")
	private WebElement loginBtn;
	
	public Payment_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnTarjeta()
	{
		tarjeta.click();
	}
	public void clickOnUsarNuevaTarjeta()
	{
		usarNuevaTarjeta.click();
	}
	public void passCardNo()
	{
		cardno.sendKeys("4111111111111111");
	}
	public void passMonth()
	{
		month.sendKeys("11");
	}
	public void passDate()
	{
		date.sendKeys("25");
	}
	public void passCvv()
	{
		cvv.sendKeys("111");
	}
	public void passEmail()
	{
		email.sendKeys("test@test.com");
	}
	public void clickOnPaymentBtn()
	{
		btnPayment.click();
	}
	public void passUsername()
	{
		username.sendKeys("automationexcersise@test.com");
	}
	public void passPassword()
	{
		password.sendKeys("123456");
	}
	public void clickOnLoginBtn()
	{
		loginBtn.click();
	}
	
	

}
