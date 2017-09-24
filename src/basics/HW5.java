package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW5 {;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver3=new ChromeDriver();
		driver3.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver3.get("http://way2automation.com/way2auto_jquery/frames-windows/frameset.html");
		WebElement h=driver3.findElement(By.id("topframe"));
		driver3.switchTo().frame(h);
		driver3.findElement(By.xpath("/html/frameset/frame[1]")).click();
		
	}

}
