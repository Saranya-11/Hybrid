package dataread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Dataread {

	public String fetchpropertydata(String Str1,String Str2) throws IOException
	{
		
	//public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	Properties obj=new Properties();
	//FileInputStream input=new FileInputStream("C:\\Users\\DELL\\workspace\\Hybrid_FW\\src\\data\\Sdata.properties");
	FileInputStream input=new FileInputStream(System.getProperty("user.dir")+"\\src\\data\\Sdata.properties");
	obj.load(input);
	//System.out.println(obj.getProperty(Str1));
	//System.out.println(obj.getProperty("message"));
	return(obj.getProperty(Str1,Str2));
	
	
	}

}
