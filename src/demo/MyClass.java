package demo;

import java.awt.image.CropImageFilter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass {
WebDriver d= new ChromeDriver();


public static void main(String[] args) {
	// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\Harshali\\Downloads\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("http://www.google.com");

}
}
