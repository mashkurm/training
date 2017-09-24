package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
/*driver.get("https://www.qtptutorial.net/automation-practice/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.id("idExample")).click();
driver.close();

		WebDriver driver2 = new ChromeDriver();
driver2.get("https://www.qtptutorial.net/automation-practice/");
driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver2.findElement(By.className("buttonClassExample")).click();
driver2.close();

		WebDriver driver3 = new ChromeDriver();

driver3.get("https://www.qtptutorial.net/automation-practice/");
driver3.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver3.findElement(By.name("NameExample")).click();
driver3.close();

		WebDriver driver4 = new ChromeDriver();

driver4.get("https://www.qtptutorial.net/automation-practice/");
driver4.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver4.findElement(By.partialLinkText("text!")).click();
driver4.close();

		WebDriver driver5 = new ChromeDriver();

driver5.get("https://www.qtptutorial.net/automation-practice/");
driver5.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver5.findElement(By.xpath("//*[@id='post-5969']/div/div[3]/div/div[3]/div[2]/a")).click();
driver5.navigate().back();*/

/*WebDriver driver6 = new ChromeDriver();
driver6.get("https://www.qtptutorial.net/automation-practice/");
driver6.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
List<WebElement> w=driver6.findElements(By.xpath("//input[@type='text']"));
for(int i=0;i<w.size();i++){
System.out.println("number of text boxes" +w.size());
System.out.println(w.get(i).getAttribute("value"));}
List<WebElement> w1=driver6.findElements(By.xpath("//*[@id='htmlTableId']"));
for(int i=0;i<w1.size();i++){
System.out.println("titles of table with unique ID");
System.out.println(w1.get(i).getText());*/

/*WebDriver driver7 = new ChromeDriver();
driver7.get("https://www.qtptutorial.net/automation-practice/");
driver7.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
List<WebElement> w2=driver7.findElements(By.xpath("//input[@type='radio']"));
for(int i=0;i<w2.size();i++){
w2.get(i).click();
driver7.close();
	
WebDriver driver8 = new ChromeDriver();
driver8.get("https://www.qtptutorial.net/automation-practice/");
driver8.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
driver8.findElement(By.xpath("//a[contains(@href,'https://plus.google.com/u/2/')]")).click();
driver8.quit();

WebDriver driver9 = new ChromeDriver();
driver9.get("https://www.qtptutorial.net/automation-practice/");
driver9.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
WebElement f=driver9.findElement(By.xpath("//iframe[contains(@id,'fitvid')]"));
driver9.switchTo().frame(f);
driver9.findElement(By.xpath("//*[contains(@id,'player_uid')]/div[4]/button")).click();*/
}

		}

	
	
	
	
	


