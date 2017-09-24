package basics;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://seleniumsimplified.com/testpages/javascript_countdown.html");
	WebElement a=driver.findElement(By.id("javascript_countdown_time"));
	new FluentWait<WebElement>(a).
	   withTimeout(10, TimeUnit.SECONDS).
	   pollingEvery(100,TimeUnit.MILLISECONDS).
	   until(new Function<WebElement  , Boolean>() {
	       @Override
	       public Boolean apply(WebElement element) {
	           return element.getText().endsWith("04");
	       }
	   }
			   );
		driver.close();
	}
			  


}
