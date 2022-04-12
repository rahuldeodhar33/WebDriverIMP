package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("Number of Rows : " + table.size());
		List<WebElement> tableC = driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println("Number of Columns : " + tableC.size());
		List<WebElement> tab = driver.findElements(By.xpath("//table[@id='customers']//tr[4]/td"));
		for (WebElement elm:tab) {
			System.out.print(elm.getText());
			System.out.print(" ");
		}
		System.out.println(" ");
		List<WebElement> tab1 = driver.findElements(By.xpath("//table[@id='customers']//td[2]"));
		for (WebElement elm1:tab1) {
			System.out.println(elm1.getText());
		}
		driver.close();
	}

}
