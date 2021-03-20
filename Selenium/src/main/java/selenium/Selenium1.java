package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\chomedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
				driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.4.0");
	}

}
