package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import dataread.Dataread;
import dataread.Excel_Data;

public class Test_Excel {
  @Test
  public void getexceldata() throws IOException {
	  Excel_Data obj=new Excel_Data();
	  obj.getExcel_Data();
  }
}
