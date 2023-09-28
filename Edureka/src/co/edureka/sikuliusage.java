package co.edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class sikuliusage {

	
	public static void main(String[] args) throws InterruptedException, FindFailed {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthick.r\\3D Objects\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		WebElement login = driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
		login.click();
		WebElement PIMLink = driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"));
		PIMLink.click();
		Thread.sleep(3000);
		WebElement AddEmployee = driver
				.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
		AddEmployee.click();
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstName']"));
		FirstName.sendKeys("firstclass");
		WebElement LastName = driver.findElement(By.xpath("//input[@name='lastName']"));
		LastName.sendKeys("selenium");
		Thread.sleep(3000);
		WebElement PhotoFile = driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/button"));
		Actions actions= new Actions(driver);
		actions.moveToElement(PhotoFile).click().build().perform();
		Thread.sleep(3000);
		Screen screen= new Screen();
		Pattern textfield= new Pattern("C:\\Users\\karthick.r\\3D Objects\\Demo\\Image.PNG");
		Pattern Openbutton= new Pattern("C:\\Users\\karthick.r\\3D Objects\\Demo\\upload.PNG");
		screen.wait(textfield,20);
		screen.type(textfield, "C:\\\\Users\\\\karthick.r\\\\3D Objects\\\\Demo\\\\upload.PNG");
		screen.click(Openbutton);
		WebElement Savebutton = driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
		Savebutton.click();
		
		
	}

}
