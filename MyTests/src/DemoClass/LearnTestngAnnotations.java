package DemoClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class LearnTestngAnnotations {
	
public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "//Users//prajnashetty//Downloads//Jars and drivers//chromedriver");
	
	WebDriver driver = new ChromeDriver();
	
	System.out.println("Hi");
	
	driver.get("https://www.google.com");
	driver.navigate().forward();
	System.out.println("Hi");
	driver.close();
	
	Action a = new Action(driver);
	
	driver.manage().window().setSize(null);
}
	
	
	
}
