import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyHiglightedText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/prajnashetty/Downloads/Jars and drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.paloaltonetworks.com/");
		String color = driver.findElement(By.xpath("//p[contains(text(),'Product Portfolio')]")).getCssValue("color");
		String bgColor = driver.findElement(By.xpath("//p[contains(text(),'Product Portfolio')]")).getCssValue("-webkit-tap-highlight-color");
		System.out.println(color);
		System.out.println(bgColor);
		if(!color.equals(bgColor))
		{
			System.out.println("Success");
		}
		
		WebElement color2 = driver.findElement(By.xpath("//p[contains(text(),'Product Portfolio')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='2px soild Red'",color2);
		
		driver.close();
		
		
		
		
		
	}

}
