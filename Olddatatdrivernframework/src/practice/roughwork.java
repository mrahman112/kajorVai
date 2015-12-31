package practice;

public class roughwork {
	
	public static Xls_Reader datatable=new Xls_Reader("C:\\Users\\Public\\Documents\\seleniumtest.xlsx");

	public static void main(String[] args) {
		
		
		int rows=datatable.getRowCount("Sheet1");
		int cols=datatable.getColumnCount("Sheet1");
		System.out.println(rows +"  "+cols);
		for(int i=2;i<=rows;i++){
			
			for(int j=0;j<=cols;j++)
			{
				System.out.println(datatable.getCellData("Sheet1", j, i));
			}
		}
		

	}
	
	public Object[][] getdata(String sheetname)
	{
		int rows=datatable.getRowCount(sheetname);
		
	int cols=datatable.getColumnCount(sheetname);
	Object data[][]=new Object[rows-1][cols];
	
	for(int i=2;i<=rows;i++){
		
		for(int j=0;j<=cols;j++)
		{
			data[i-2][j]=datatable.getCellData(sheetname, j, i);
		}
		
	}
		
		
		return data;
		
		
		
		
		
	}

}
