package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver5=new ChromeDriver();
		driver5.get("http://automationpractice.com/index.php");
		WebElement a=driver5.findElement(By.xpath("//*[@id='search_query_top']"));
		a.sendKeys("jeans");
		System.out.println(a.getText());
		WebElement b=driver5.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/span/strong"));
		System.out.println(b.getText());
		WebElement c=driver5.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
		System.out.println(c.getText());
		c.click();
		WebElement d=driver5.findElement(By.name("email_create"));
		d.sendKeys("nicksclicks.biz@gmail.com");
		WebElement e=driver5.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]/a"));
		e.click();
		driver5.navigate().back();
		driver5.navigate().back();
		driver5.findElement(By.xpath("//*[@id='homefeatured']/li[7]/div/div[2]/div[2]/a[1]/span")).click();
		
		
	}

}
