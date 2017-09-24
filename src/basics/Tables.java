package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver9=new ChromeDriver();
		driver9.get("http://html.com/tables/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement w=driver9.findElement(By.xpath("//*[@id='post-382']/div/div[3]/table"));	
		List <WebElement> w1=driver9.findElements(By.xpath("//*[@id='post-382']/div/div[3]/table//td"));
		System.out.println(w1.size());
		
		for(int i=0;i<w1.size();i++){
			System.out.println(i);
		System.out.println(w1.get(i).getText());	
		}

	}

}
