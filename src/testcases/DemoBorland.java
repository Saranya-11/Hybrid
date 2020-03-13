package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBorland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Jar\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.borland.com//gmopost/");
		driver.findElement(By.xpath("//input[@name='bSubmit']")).click();
		driver.findElement(By.xpath("//input[@name='QTY_TENTS']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@name='bSubmit']")).click();
		
	}

}
