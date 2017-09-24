package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.qtptutorial.net/automation-practice/");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions action = new Actions(driver1);
		 WebElement e = driver1.findElement(By.xpath("//a[contains(text(),'My Membership')]"));
		 action.moveToElement(e).build().perform();
		 driver1.findElement(By.xpath("//*[@id='menu-item-1641']/a")).click();
		
	}

}
