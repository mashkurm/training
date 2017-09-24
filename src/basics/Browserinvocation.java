package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Browserinvocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Selenium 3.0
		
		// Java requirement 1.8
		// Firefox Less than 47- Then Selenium 2.5*
		// Firefox 48+ is Selenium 3.0 - Supplement
		
		
		//http://github.com/mozilla/geckodriver/releases/
		
		//System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
	//WebDriver driver=new FirefoxDriver();
//driver.get("https://www.dontforget.co/login/");
//driver.close();
System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
WebDriver driver1=new ChromeDriver();
//driver1.get("https://www.dontforget.co/login/");
driver1.navigate().to("https://www.dontforget.co/login/");
String title=driver1.getTitle();
System.out.println(title);
driver1.navigate().refresh();
String currenturl=driver1.getCurrentUrl();
System.out.println(currenturl);
int titleLength = driver1.getTitle().length();
System.out.println(titleLength);
String pagesource=driver1.getPageSource();
//System.out.println(pagesource);
//driver1.quit();
WebElement e=driver1.findElement(By.name("username"));
String classname= e.getAttribute("class");
System.out.println(classname);
WebElement f=driver1.findElement(By.name("password"));
System.out.println(f.getAttribute("placeholder"));
//driver1.close();
e.sendKeys("nicksclicks");
System.out.println(e.getText());
System.out.println(e.getTagName());
System.out.println(e.getSize());
System.out.println(e.getLocation());
/*e.clear();
e.isDisplayed();
e.isEnabled();
e.isSelected();*/
WebDriver driver2=new ChromeDriver();
driver2.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_disabled");
driver2.switchTo().frame(driver2.findElement(By.id("iframeResult")));
WebElement g=driver2.findElement(By.xpath("/html/body/button"));
System.out.println((g.isEnabled()));
	}

}
