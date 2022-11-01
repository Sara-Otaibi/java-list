package facebok_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Class {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MQ\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/index.html");

		driver.findElement(By.id("email-input")).sendKeys("sara@hotmail.com");
		driver.findElement(By.id("password-input")).sendKeys("PAssW0rd");
		driver.findElement(By.id("date-input")).sendKeys("12-11-1995");
		driver.findElement(By.id("mobile-input")).sendKeys("00962798585858");
driver.findElement(By.tagName("button")).click();
	}

}
