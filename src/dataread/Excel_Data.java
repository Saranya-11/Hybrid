package dataread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class Excel_Data {
public void getExcel_Data() throws IOException{
	//public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream ips=new FileInputStream("C:\\Users\\DELL\\workspace\\Hybrid_FW\\src\\data\\DData.xls");
		//obj.load(ips);
		HSSFWorkbook wb=new HSSFWorkbook(ips);
		HSSFSheet sh=wb.getSheet("Sheet1");
		int rowcount=sh.getLastRowNum();
		int colcount=sh.getRow(0).getLastCellNum();
		System.out.println("Row Num: "+rowcount);
		System.out.println("Column Num: "+colcount);
		//String data[][]=new String[rownum][colnum];
		//String Value="";
		
		for(int i=1;i<=rowcount;i++)
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
				//data[i][j]=Value;
				}
		
			catch(java.lang.NullPointerException exception)
			{
				
			}
	}

}
	}
}
