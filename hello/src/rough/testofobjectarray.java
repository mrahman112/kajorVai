package rough;

import util.Xls_Reader;
import util.utility;

public class testofobjectarray {

	public static void main(String[] args) {
		Xls_Reader xls=new Xls_Reader("C:\\Users\\Humaira.Jarjees\\Documents\\hybridexcelframework.xlsx");
        utility.getdata("LoginTest", xls);
        utility.getdata("CreateLeadTest", xls);
        utility.getdata("MenuTest", xls);
	}

}
