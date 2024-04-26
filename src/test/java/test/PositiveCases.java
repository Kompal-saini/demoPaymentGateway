package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PositiveCases {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/payment-gateway/index.php");

		driver.findElement(By.name("quantity")).sendKeys("2");
		driver.findElement(By.xpath("//body/section[@id='three']/div[1]/form[1]/div[1]/div[8]/ul[1]/li[1]/input[1]")).click();
		driver.findElement(By.id("card_nmuber")).sendKeys("4111111111111111");
		driver.findElement(By.id("month")).sendKeys("04");
		driver.findElement(By.name("year")).sendKeys("2024");
		driver.findElement(By.id("cvv_code")).sendKeys("123");
		driver.findElement(By.name("submit")).click();
		
		driver.close();
		driver.quit();
		
	}
}
