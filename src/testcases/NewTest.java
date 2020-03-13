package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import dataread.Dataread;

public class NewTest {
  @Test
  public void getpropertydata() throws IOException
  {
	  Dataread obj=new Dataread();
	  System.out.println(obj.fetchpropertydata("url","message"));
  }
}
