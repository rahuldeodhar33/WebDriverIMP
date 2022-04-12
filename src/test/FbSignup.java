package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignup {

	public static void main(String[] args) {
		String strGen = "Male";
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		WebElement LoginClick = driver.findElement(By.cssSelector("a[data-testid^='open-']"));
		LoginClick.click();
		WebElement fName = driver.findElement(By.cssSelector("input[name=firstname]"));
		WebElement sName = driver.findElement(By.cssSelector("input[name=lastname]"));
		WebElement mobile = driver.findElement(By.cssSelector("input[aria-label^='Mobile number']"));
		WebElement password = driver.findElement(By.cssSelector("input[aria-label='New password']"));
		WebElement signUp = driver.findElement(By.cssSelector("button[name=websubmit]"));
		String GenX = "//label[text()='" + strGen + "']/following-sibling::input";
		List<WebElement> DOBMonthes = driver.findElements(By.xpath("//select[@title='Month']/option"));
		for(WebElement elm : DOBMonthes) {
			System.out.print(elm.getText() + " ");
		}
		List<WebElement> DOBDays = driver.findElements(By.xpath("//select[@aria-label='Day']/option"));
		System.out.println();
		for(WebElement elm1 : DOBDays) {
			System.out.print(elm1.getText() + " ");
		}
		WebElement Gen = driver.findElement(By.xpath(GenX));
		WebElement DOBMonth = driver.findElement(By.xpath("//select[@aria-label='Month']/option[@selected='1']"));
		System.out.println();
		System.out.println("Selected Month in Drop Down :- " + DOBMonth.getText());
		WebElement dayDOB = driver.findElement(By.cssSelector("select#day"));
		WebElement monthDOB = driver.findElement(By.cssSelector("select#month"));
		WebElement yearDOB = driver.findElement(By.cssSelector("select#year"));
		Select d1 = new Select(dayDOB);
		Select m1 = new Select(monthDOB);
		Select y1 = new Select(yearDOB);
		d1.selectByVisibleText("25");
		m1.selectByVisibleText("Oct");
		y1.selectByVisibleText("1984");
		fName.sendKeys("Rahul");
		sName.sendKeys("Deodhar");
		mobile.sendKeys("9922288888");
		password.sendKeys("Anmcd#21344");
		Gen.click();
		signUp.click();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		//driver.close();
	}
	
}
