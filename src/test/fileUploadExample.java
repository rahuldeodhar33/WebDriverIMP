package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUploadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		WebElement element = driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
		element.sendKeys("D:/Test1.txt");
		WebElement chkBox = driver.findElement(By.xpath("//input[@id='terms']"));
		chkBox.click();
		WebElement submit = driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submit.click();
		System.out.println("File upload Successful :-" + "Test1.txt");
	}

}
