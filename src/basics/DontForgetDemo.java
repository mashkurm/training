package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DontForgetDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver9=new ChromeDriver();
		driver9.get("https://www.dontforget.co/login/");
		driver9.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement e=driver9.findElement(By.name("username"));
		e.sendKeys("mashkurm");
		WebElement g=driver9.findElement(By.name("password"));
		g.sendKeys("abc123");
		driver9.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		driver9.findElement(By.xpath("//a[@href='requests/reminder/add']")).click();
		
		 WebDriverWait wait = new WebDriverWait(driver9, 10);

		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='requests/reminder/add']")));
		
		 /*try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		//Select dropdown = new Select(driver9.findElement(By.xpath("//form[@action='requests/reminder/add']//select[1]")));
		Select dropdown = new Select(driver9.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/div[1]/div/select")));
		dropdown.selectByIndex(3);
		Select dropdown1 = new Select(driver9.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/div[8]/div/select")));
		dropdown1.selectByVisibleText("Afternoon");
		Select dropdown2 = new Select(driver9.findElement(By.xpath("//*[@id='DataTables_Table_1_length']/label/select")));
		dropdown2.selectByValue("50");
	}

}
