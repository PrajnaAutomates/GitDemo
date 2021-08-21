import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksExample {
	
	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/prajnashetty/Downloads/Jars and drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/broken");
		driver.manage().window().maximize();
		String url = null;
		String homepage = "https://demoqa.com/";
		int code = 200;
		HttpURLConnection huc = null;
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		Iterator<WebElement> i = links.iterator();
		while(i.hasNext()) {
			url = i.next().getAttribute("href");
			
			if(url==null)
			{
				System.out.println("url is empty");
			}
			else if(!url.startsWith(homepage))
			{
				System.out.println("belongs to oherdomain");
				continue;
			}
			else
			{
				
				
				huc = (HttpURLConnection) new URL(url).openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
			    code = huc.getResponseCode();
				
			}
			if(code >= 400)
			{
				System.out.println("broken link");
			}
			else
			{
				System.out.println("valid link");
			}
			
		}
		
			
		}
		


	
}
