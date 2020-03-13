package scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Seleniummethods {
	
public void openwebsite(WebDriver driver,String InputData)
{
	//System.out.println("Selenium Method Input Data is "+InputData);
	driver.get(InputData);
}

public void click(WebDriver driver,String Locator)
{
	driver.findElement(By.xpath(Locator)).click();
}
public void update(WebDriver driver,String Locator,String InputData)
{
	driver.findElement(By.xpath(Locator)).clear();
	driver.findElement(By.xpath(Locator)).sendKeys(InputData);
}

}

