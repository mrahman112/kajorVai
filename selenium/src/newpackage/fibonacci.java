package newpackage;

public class fibonacci {

	public static void main(String[] args) {
		
		
		int a=0;
		int b=1;
		
		
		
		for(int i=1; i<20;i++)
		{
			
			int c=a+b;
		System.out.print(c+" ");
		a=b;//2  3
		b=c;//3 2
		c=a;//2
		}
		
	}

}
