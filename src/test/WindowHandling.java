package test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		String ParentWin = driver.getWindowHandle();
		System.out.println("This is my Parent Window: " + ParentWin);
		WebElement element = driver.findElement(By.xpath("//button[@id='windowButton']"));
		element.click();
		System.out.println("After click button");
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> itr = handle.iterator();
		while (itr.hasNext()) {
			String CurrentVal = itr.next();
			System.out.println(CurrentVal);
			if (!CurrentVal.equals(ParentWin)) {
				driver.switchTo().window(CurrentVal);
			}
		}
		
		WebElement element1 = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println("This is on second window: "+ element1.getText());
		driver.quit();
	}

}
