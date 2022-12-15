package testcase;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LaunchUrl {
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriverService();
driver.get("https://www.google.co.in/");
driver.manage().window().maximize();


	
}
}
