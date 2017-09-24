package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	WebDriver driver1=new ChromeDriver();
	driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver1.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_links_w3schools");
	//driver1.switchTo().frame("iframeResult");
	WebElement w=driver1.findElement(By.id("iframeResult"));
	//driver1.switchTo().frame(driver1.findElement(By.id("iframeResult")));
	driver1.switchTo().frame(w);
	//driver1.findElement(By.id("iframeResult"));
	driver1.findElement(By.xpath("/html/body/p/a")).click();
	//element1.click();
			

		
	}	
	
}
