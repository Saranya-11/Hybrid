package dataread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.Test;

public class XLDataread {

	//public static void main(String[] args) throws IOException{
	
	public String[][] fetchxldata() throws IOException
	{
		
	// TODO Auto-generated method stub
		System.out.println("Inside Excel Read");
	//Properties obj=new Properties();
	FileInputStream ips=new FileInputStream(System.getProperty("C:\\Users\\DELL\\workspace\\DataDriven_FW\\src\\data\\RegisterData.xls"));
	//FileInputStream ips=new FileInputStream(System.getProperty("user.dir")+"\\src\\data\\DData.xls");
	//obj.load(ips);
	HSSFWorkbook wb=new HSSFWorkbook(ips);
	HSSFSheet sh=wb.getSheet("Sheet1");
	int rowcount=sh.getLastRowNum()+1;
	int colcount=sh.getRow(0).getLastCellNum();
	System.out.println("Row Num: "+rowcount);
	System.out.println("Column Num: "+colcount);
	String data[][]=new String[rowcount][colcount];
	String Value="";
	
	for(int i=0;i<rowcount;i++)
	{
		Row row=sh.getRow(i);
		for(int j=0;j<colcount;j++)
		{
			try
			{
			if(row.getCell(j).getCellType()==HSSFCell.CELL_TYPE_STRING)
			{
				System.out.println(row.getCell(j).getStringCellValue());
				//Value=row.getCell(j).getStringCellValue();
			}
			else
			{
				System.out.println(row.getCell(j).getNumericCellValue());
				//Value=""+row.getCell(j).getNumericCellValue();
			}
			data[i][j]=Value;
			}
	
		catch(java.lang.NullPointerException exception)
		{
			
		}
	
}
	
}
	return data;
}
}
