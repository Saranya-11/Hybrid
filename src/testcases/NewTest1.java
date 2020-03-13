package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import dataread.Dataread;
import dataread.XLDataread;

public class NewTest1 {
  @Test
 public void getxldata() throws IOException
		  {
			 XLDataread obj=new XLDataread();
			 obj.fetchxldata();
			//  System.out.println(obj.fetchpropertydata("url","message"));
		  }

  }