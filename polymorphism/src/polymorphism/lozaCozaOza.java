package polymorphism;

public class lozaCozaOza {

	public static void main(String[] args) {
	for(int i=1;i<=110;i++)
	{
		if(i%11!=0)
		{
			if(i%3==0)
			{
				
				System.out.print("loza"+" ");
			}
			else if(i%5==0)
			{
				System.out.print("coza"+" ");
			}
			else if (i%7==0)
			{
				System.out.print("woza"+" ");
			}
			else
			{
				System.out.print(i+" ");
			}
			
		}
		else
		{
			System.out.println(i+" ");
		}
	}

	}

}
