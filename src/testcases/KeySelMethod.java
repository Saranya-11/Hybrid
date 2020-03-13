package testcases;

import org.testng.annotations.Test;

import dataread.XLDataread;
import scripts.KeywordMethods;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class KeySelMethod {
	public WebDriver driver;
	XLDataread Xld=new XLDataread();
	KeywordMethods KM=new KeywordMethods();  
 
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Jar\\chromedriver.exe");
	
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	  
  }
  @AfterClass
  public void afterClass() {
  
  //driver.close();
  }
  @DataProvider
  public String[][] MethodData() throws IOException
  {
	 System.out.println("Inside DataProvider"); 
	 String testdata[][]=Xld.fetchxldata();
	  return testdata;
  }
  
  @Test(dataProvider="MethodData")
  public void read(String Keyword,String Locator,String InputData,String Purpose) 
  {
	 System.out.println("Inside Test");
	 KM.readdata(driver,Keyword,Locator,InputData,Purpose);
  }
  }

