import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContectClickExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/prajnashetty/Downloads/Jars and drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com");
		Actions action = new Actions(driver);
	    Thread.sleep(1000);
		action.contextClick(driver.findElement(By.xpath("//*[@class='card-body']/h5[contains(text(),'Forms')]")));
		
		driver.close();

	}

}
