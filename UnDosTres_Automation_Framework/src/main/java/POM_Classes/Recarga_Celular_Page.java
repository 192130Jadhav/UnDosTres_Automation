package POM_Classes;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Recarga_Celular_Page {
	@FindBy (xpath="(//input[@type='text'])[1]")
	private WebElement mobile;
	
	@FindBy (xpath="(//input[@type='text'])[2]")
	private WebElement operator;
	
	
	@FindBy (xpath="//li[@data-name='telcel']//a")
	private WebElement telcel;
	
	@FindBy (xpath="(//input[@type='text'])[3]")
	private WebElement amount;
	
	@FindBy (xpath="(//li[@data-cat='Recarga Saldo'])[1]//a")
	private WebElement doller10;
	
	@FindBy (xpath="(//button[text()='Siguiente'])[1]")
	private WebElement btnRecharge;
	
	public Recarga_Celular_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void passMobileNumber()
	{
		mobile.sendKeys("8465433546");
	}
	
	public void clickOnOperator() 
	{  
		operator.click();
	}
	
	public void selectOperator() 
	{
		telcel.click();
	}
	
	public void clickOnAmount()
	{
		amount.click();
	}
	
	public void selectAmount()
	{
		doller10.click();
	}
	
	public void clickOnRechargeBtn()
	{
		btnRecharge.click();
	}
	
	
	
	
	
	
	
	

}
