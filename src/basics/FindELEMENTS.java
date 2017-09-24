package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindELEMENTS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver9=new ChromeDriver();
		driver9.get("https://www.dontforget.co/forgot-password");
		List<WebElement> w=driver9.findElements(By.name("iknow"));
		System.out.println(w.size());
		w.get(1).click();
		w.get(0).click();
		
	}

}
