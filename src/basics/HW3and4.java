package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW3and4 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver9=new ChromeDriver();
		//driver8.get("https://www.fincher.org/tips/web/SimpleForm.shtml");
		
		//RadioButtons
		/*driver8.findElement(By.xpath("//*[@id='content']/form[1]/fieldset/input[1]")).click();
		try {
		Thread.sleep(5000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();}
		driver8.findElement(By.xpath("//*[@id='content']/form[1]/fieldset/input[2]")).click();
		try {
		Thread.sleep(5000);
	} catch (InterruptedException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
		driver8.findElement(By.xpath("//*[@id='content']/form[1]/fieldset/input[3]")).click();
		
		//Text Area
		WebElement e=driver8.findElement(By.name("FirstName"));
		e.sendKeys("Nick");
		WebElement g=driver8.findElement(By.name("LastName"));
		g.clear();
		g.sendKeys("Lal");
		//sendkeys worked, however, it did not replace the text in the box
		//I need to learn how to delete existing text before replacing it
		
		//CheckBoxes
		driver8.findElement(By.name("checkbox1")).click();
		
		driver8.findElement(By.name("checkbox2")).click();*/
		
		
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Select dropdown = new Select(driver8.findElement(By.xpath("//*[@id='content']/select[1]")));
		dropdown.selectByIndex(2);
		Select dropdown2 = new Select(driver8.findElement(By.xpath("//*[@id='content']/select[1]")));
		dropdown2.selectByIndex(3);
		Select dropdown3 = new Select(driver8.findElement(By.xpath("//*[@id='content']/select[1]")));
		dropdown3.selectByVisibleText("Albania");*/
	
	//}
		
	driver9.get("https://computerservices.temple.edu/creating-tables-html");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement w=driver9.findElement(By.xpath("/html/body/div[1]/div[1]/div/article/div/div[3]/div[2]/article/div/div/div/div/table"));	
	List <WebElement> w1=driver9.findElements(By.xpath("/html/body/div[1]/div[1]/div/article/div/div[3]/div[2]/article/div/div/div/div/table"));
	System.out.println(w1.size());
	
	for(int i=0;i<w1.size();i++){
		System.out.println(i);
	System.out.println(w1.get(i).getText());	
	}
}
}
	

	

