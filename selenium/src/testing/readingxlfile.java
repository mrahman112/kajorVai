package testing;



import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingxlfile {

	public static void main(String[] args)  {
		
		

     Xls_Reader xl=new Xls_Reader("C:\\Users\\Humaira.Jarjees\\workspace\\selenium\\src\\testing\\ebaylogin.xlsx");
		
    for(int r=1;r<=xl.getRowCount("Sheet2");r++)
    {
    	for(int c=0;c<=xl.getColumnCount("Sheet2");c++)
    	{
     System.out.print(xl.getCellData("Sheet2", c, r)+"--");
    	}
    	System.out.println();
    }
    
    xl.setCellData("Sheet1", "password", 7, "hello");
		
	}
	

}
