import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/prajnashetty/Downloads/Jars and drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com");
		//driver.findElement(By.id("windowButton")).click();
		
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		Iterator<String> i = s.iterator();
		while (i.hasNext())
		{	
			String child = i.next();
			
		
		
		if(!parent.equals(child))
		{
			driver.switchTo().window(child);
			System.out.println(driver.switchTo().window(child).getTitle());
			driver.close();
			
		}
		}
		driver.switchTo().window(parent);
		
		
	

}
}