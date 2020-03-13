package scripts;
import org.openqa.selenium.WebDriver;

public class KeywordMethods {
	
public void readdata(WebDriver driver,String Keyword,String Locator,String InputData,String Purpose)
{
	Seleniummethods data1=new Seleniummethods();
switch(Keyword)
{
case "OpenWebsite":
	System.out.println("Inside Keyword Method");
	data1.openwebsite(driver, InputData);
	break;
case "Click":
	data1.click(driver, Locator);
	break;
case "UpdateQuantity":
	data1.update(driver, Locator, InputData);
	break;
	
default:
	System.out.println("Invalid Keyword");
	break;
}
}
}
