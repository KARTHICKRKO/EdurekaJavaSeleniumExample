package co.edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class ImageSikuli {
	
	public static void main(String[] args) throws FindFailed {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthick.r\\3D Objects\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.get("https://www.tutorialspoint.com/index.htm");
	      // Screen class to access Sikuli methods
	      Screen s = new Screen();
	      //object of Pattern to specify image path
	      Pattern e = new Pattern("C:\\Users\\karthick.r\\3D Objects\\Demo\\capture.png");
	      //add wait time
	      s.wait(e, 5);
	      //enter text and click
	      s.type(e, "Selenium");
	      s.click(e);
	   }
 
}


