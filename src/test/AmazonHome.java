package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver web1 = (WebDriver) new ChromeDriver();
		//WebDriver web1 = new WebDriver();
		web1.get("https://www.simplilearn.com/");
		web1.manage().window().maximize();
		web1.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		//WebDriverWait wait = new WebDriverWait(web1,50);
		
		WebElement LoginClick = web1.findElement(By.className("login"));
		//wait.until(ExpectedConditions.elementToBeClickable(LoginClick));
		LoginClick.click();
		WebElement UserName = web1.findElement(By.name("user_login"));
		WebElement Passwd = web1.findElement(By.id("password"));
		WebElement LoginBt = web1.findElement(By.name("btn_login"));
		WebElement Remember1 = web1.findElement(By.className("rememberMe"));
		UserName.sendKeys("rahuldeodhar@gmail.com");
		Passwd.sendKeys("Madhuban@08");
		Remember1.click();
		LoginBt.click();
		WebElement error1 = web1.findElement(By.id("msg_box"));
		String ActualMsg = error1.getText();
		String expMsg = "The email or password you have entered is invalid.";
		if (ActualMsg.equals(expMsg)) {
			System.out.println("Login Error.");
		}else {
			System.out.println("Different error message: " + ActualMsg);
			System.out.println("Expected message is : " + expMsg);
		}   
		
		List<WebElement> links = web1.findElements(By.tagName("a"));
		System.out.println("Total Links are " + links.size());
		for (WebElement elm : links) {
			System.out.println(elm.getAttribute("href"));
		}
		web1.close();
	}
	

}
