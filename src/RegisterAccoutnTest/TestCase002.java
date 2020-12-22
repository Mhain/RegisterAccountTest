 package RegisterAccoutnTest;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase002 {
	static WebDriver driver=null;	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		

		RegisterAccount();
		Password();
		RadioButton();


		
		
	}
	private static void CheckBox() {
		// TODO Auto-generated method stub
		WebElement CBox=driver.findElement(By.cssSelector("div.pull-right:nth-child(1) > input:nth-child(2)"));
		CBox.click();
		
		
		if(CBox.isSelected()) {
			Regbtn();
		}
		else {
			System.out.println("you have to agree to the Privacy Policy");
		}
		
	}
	private static void Regbtn() {
		// TODO Auto-generated method stub
	
		WebElement regBtn=driver.findElement(By.cssSelector("input.btn"));	
		regBtn.click();
	}
	private static void Password() {
		// TODO Auto-generated method stub
		WebElement Password=driver.findElement(By.id("input-password"));
		WebElement ConPassword=driver.findElement(By.id("input-confirm"));	

		Password.clear();
		Password.sendKeys("123456asdf");

		ConPassword.clear();
		ConPassword.sendKeys("123456asdf");
		
		String givenPass=Password.getText();
		String conPass=ConPassword.getText();
		
		if(givenPass.equals(conPass)) {
			System.out.println("Password match");
			
		}
		else {
			System.out.println("Password did not match");
			
		}
	
	}
	private static void RadioButton() {
		// TODO Auto-generated method stub
		
		WebElement RadioButton=driver.findElement(By.cssSelector("label.radio-inline:nth-child(1) > input:nth-child(1)"));
		RadioButton.click();
		
		
		if(RadioButton.isSelected()) {
			CheckBox();
			
		}
		else {
			WebElement RadioButton2=driver.findElement(By.cssSelector("label.radio-inline:nth-child(2) > input:nth-child(1)"));
			RadioButton2.click();
			System.out.println("you have to Suscribe first");
		}
	}
	private static void RegisterAccount() {

		WebElement FirstName=driver.findElement(By.id("input-firstname"));
		WebElement LastName=driver.findElement(By.id("input-lastname"));
		WebElement Email=driver.findElement(By.id("input-email"));
		WebElement TelePhone=driver.findElement(By.id("input-telephone"));
	
		FirstName.clear();
		FirstName.sendKeys("mhain");
		LastName.clear();
		LastName.sendKeys("hoque");
		Email.clear();
		Email.sendKeys("mhain1995@gmail.com");
		TelePhone.clear();
		TelePhone.sendKeys("0181100000");
		
		
			}
	

}
