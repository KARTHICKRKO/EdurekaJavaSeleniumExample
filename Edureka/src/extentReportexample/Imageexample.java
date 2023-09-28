package extentReportexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Imageexample {

	WebDriver driver;
	ExtentReports extentreports;
	ExtentSparkReporter sparkhtml;
	ExtentTest testcase;

	@Test

	public void OpenGoogle() throws InterruptedException {

		driver.manage().window().maximize();
		testcase = extentreports.createTest("Verify Google title");

		driver.get("http://www.google.co.in");
		String title = driver.getTitle();
		if (title.equals("Google")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

	}

	@Test
	public void OpenBrave() {

		testcase = extentreports.createTest("Verify Brave title");
		driver.get("http://www.brave.com");
		String title = driver.getTitle();
		if (title.equals("brave")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

	}

	@Test
	public void OpenWikipedia() {
		testcase = extentreports.createTest("Verify Wikipedia title");
		driver.manage().window().maximize();

		driver.get("https://www.wikipedia.org");
		String title = driver.getTitle();
		if (title.equals("wikipedia")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

	}

	@BeforeSuite
	public void launchingBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthick.r\\3D Objects\\New Chromedriver\\chromedriver.exe");
		extentreports = new ExtentReports();
		sparkhtml = new ExtentSparkReporter("Extentreport.html");
		extentreports.attachReporter(sparkhtml);
		driver = new ChromeDriver();
	}

	@AfterSuite
	public void ClosingBrowser() {
		driver.quit();
	}
}
