package testing;

public class xlsreading {

	public static void main(String[] args) {
		Xls_Reader xl=new Xls_Reader("C:\\Users\\Humaira.Jarjees\\Documents\\phone.xlsx");
		
		for(int i=0;i<=xl.getRowCount("Sheet1");i++)
		{
			for(int c=0;c<xl.getColumnCount("Sheet1");c++)
			{
				System.out.print(xl.getCellData("Sheet1", c, i)+"  ");
			}
			System.out.println();
		}

	}

}
