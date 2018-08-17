package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver3=new ChromeDriver();
		driver3.get("https://www.dontforget.co/forgot-password");
		WebElement x=driver3.findElement(By.name("iremember"));
		System.out.println(x.getAttribute("placeholder"));
		x.sendKeys("test@gmail.com");
		System.out.println(x.getText());
		WebElement p=driver3.findElement(By.xpath("/html/body/div/h2"));
		System.out.println(p.getText());
		WebElement y=driver3.findElement(By.xpath("/html/body/div/form/div[1]/div/label[1]/input"));
		System.out.println((y.isEnabled()));
		WebElement z=driver3.findElement(By.xpath("/html/body/div/form/div[1]/div/label[2]/input"));
		System.out.println((z.isEnabled()));
		driver3.findElement(By.xpath("/html/body/div/form/div[1]/div/label[2]/input")).click();
		WebElement notVisibleElement = driver3.findElement(By.xpath("/html/body/div/form/div[2]/div/input"));
		System.out.println(notVisibleElement.isDisplayed());
	}

}
