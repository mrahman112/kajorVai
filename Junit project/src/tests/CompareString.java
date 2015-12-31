package tests;

public class CompareString {

	public static void main(String[] args) {


		String[] a={"sapon","mizan","ripa"};//value will come from DB
		String[] b={"sapon","mizan1","ripa"};//response will come from REST
		


		for(int i=0;i<a.length;i++)
		{


			
			if(a[i]==b[i])
			
				System.out.println("matched");
			
			else
				
				System.out.println("not matched");
		}
		

	}

}
