package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseCase2Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sum = 0; 
		float f = 0;
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver6 = new ChromeDriver();
		driver6.get("https://www.qtptutorial.net/automation-practice/");
		driver6.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> w=driver6.findElements(By.xpath("//input[@type='text']"));
		System.out.println("number of text boxes " +w.size());
		for(int i=0;i<w.size();i++){
		System.out.println(w.get(i).getAttribute("value"));}
		List<WebElement> w1=driver6.findElements(By.xpath("//*[@id='htmlTableId']//tbody/tr/td[3]"));
		
		for(int i=0;i<w1.size();i++){
		String test=w1.get(i).getText();
		test = test.replace("$", "");
		 test = test.replace(",", "");
		   test = test.replace("+","");
		   f = Float.parseFloat(test);
		   sum=sum+f;
		System.out.println(test);
		
	
		
	}
		System.out.println("The sum is " + sum);
}}

