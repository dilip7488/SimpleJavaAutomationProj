package src.test.java;

import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	static {
		System.setProperty("webdriver.chromedriver", "./driver.chromedriver.exe");
	}
public static void main (String[]args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
}
}
