package testing;

public class xlreader {

	public static void main(String[] args) {
		
		//getdata();
		xlreader xy=new xlreader();
		xy.getdata();
		
		
	}
	
	public  Object[][] getdata()
	{
		
		Xls_Reader xl=new Xls_Reader("C:\\Users\\Humaira.Jarjees\\workspace\\selenium\\src\\testing\\ebaylogin.xlsx");
		int rows=xl.getRowCount("Sheet1");
		
		int cols=xl.getColumnCount("Sheet1");
		
		System.out.println(rows+"   "+cols);
		
		for(int rownum=1;rownum<=rows;rownum++)
		{
			for(int colnum=0;colnum<cols;colnum++)
			{
				System.out.print(xl.getCellData("Sheet1", colnum, rownum)+"----");
			}
			System.out.println();
		}
		Object [][]data=new Object[2][2];
		data[0][0]="muradpur200";
		data[0][1]="humaira";
		
		data[1][0]="muradpur2001";
		data[1][1]="humaira1";
		return data;
	}
}
