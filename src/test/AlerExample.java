package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		WebElement element = driver.findElement(By.xpath("//*[@id='alertButton']"));
		element.click();
		Alert alr = driver.switchTo().alert();
		System.out.println("This message printed on alert window :" + alr.getText());
		alr.accept();
		//alr.dismiss(); -> this is to dismiss alert
		//alr.dismiss();
		
		WebElement elm = driver.findElement(By.xpath("//*[@id='promtButton']"));
		elm.click();
		Alert alr1 = driver.switchTo().alert();
		alr1.sendKeys("RAHUL");
		alr1.accept();
		//alr1.dismiss();
		
		
	}

}
