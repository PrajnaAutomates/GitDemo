import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class HowtoTakeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/prajnashetty/Downloads/Jars and drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com");
		
		TakesScreenshot scrshot = (TakesScreenshot)driver;
		File src = scrshot.getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("/Users/prajnashetty/Downloads/Screenshots/homePageScreenshot.png"));
		
		driver.close();
	}

}
