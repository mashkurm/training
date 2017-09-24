package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UseCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*WebDriver driver = new ChromeDriver();
driver.get("http://way2automation.com/way2auto_jquery/index.php");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.name("name")).sendKeys("Nick");
driver.findElement(By.name("phone")).sendKeys("800-555-4000");
driver.findElement(By.name("email")).sendKeys("message2nick@gmail.com");
Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='load_form']/fieldset[4]/select")));
dropdown.selectByVisibleText("Seychelles");
driver.findElement(By.name("city")).sendKeys("Victoria");
driver.findElement(By.xpath("//*[@id='load_form']/fieldset[6]/input")).sendKeys("nicksclicks");
driver.findElement(By.xpath("//*[@id='load_form']/fieldset[7]/input")).sendKeys("abc123");
String a = driver.findElement(By.xpath("//*[@id='load_form']/fieldset[4]/select/option[3]")).getText();
System.out.println(a);
driver.findElement(By.xpath("(//input[@value='Submit'])[2]")).click();
driver.close();
WebDriver driver2 = new ChromeDriver();
driver2.get("http://way2automation.com/way2auto_jquery/index.php");
driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver2.findElement(By.xpath("//a[@href='#login']")).click();
driver2.close();*/
WebDriver driver3 = new ChromeDriver();
driver3.get("http://way2automation.com/way2auto_jquery/index.php");
driver3.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver3.findElement(By.xpath("//a[@href='#login']")).click();
driver3.findElement(By.xpath("(//input[@name='username'])[2]")).sendKeys("nicksclicks");
driver3.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys("abc123");
driver3.findElement(By.xpath("(//*[@id='load_form']/div/div[2]/input)[2]")).click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver3.navigate().to("http://way2automation.com/way2auto_jquery/frames-and-windows.php");
driver3.findElement(By.xpath("//*[@id='wrapper']/div/div[1]/div[1]/ul/li[3]/a")).click();
WebElement element= driver3.findElement(By.xpath("//*[@id='example-1-tab-3']/div/iframe"));
driver3.switchTo().frame(element);
driver3.findElement(By.xpath("//a[text()='Open Frameset Window']")).click();


	}
	
}