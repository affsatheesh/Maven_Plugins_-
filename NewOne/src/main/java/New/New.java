package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class New
{
          static WebDriver driver;
	public static void main(String[] args)
	{
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("report.html");
		ExtentReports extentReports = new ExtentReports();
		extentReports.attachReporter(reporter);
		ExtentTest test = extentReports.createTest("sathes");
		System.setProperty("webdriver.chrome.driver","D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.goolge.com");
		driver.findElement(By.name("q")).sendKeys("sathez");
		driver.findElement(By.name("q")).submit();
		test.pass("test passed");
		driver.quit();
		extentReports.flush();
	}

}
