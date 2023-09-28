package co.edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumbegin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthick.r\\3D Objects\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.smartprix.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 13");
		
		driver.findElement(By.xpath("//*[contains(@class,'icon i-search')]")).click();
	}

}
