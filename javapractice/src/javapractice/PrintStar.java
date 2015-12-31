package javapractice;

public class PrintStar {

	public static void main(String[] args) {
		
		for(int j=1;j<=4;j++)
		{
		for(int i=1;i<=4;i++)
		{
			
			if(j==2|j==3)
			{
				System.out.print("*"+" "+"*");
			}
			else
			{
				System.out.print("*");
			}
		}
		System.out.println();
		}
	}

}
