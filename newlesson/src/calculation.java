
public class calculation {

	public static void main(String[] args) {
		calculation.sum(10, 30);
		calculation c = new calculation();
				c.multiply(10, 30);
				calculation.div(60, 5);
				calculation x =new calculation();
				x.addition(5, 15, 25);
	if (5>10)
	{
		System.out.println(true);
	}
				
				
				
	}
	
	
	public static void sum(int a, int b)
	{
		System.out.println(a+b);
		
		
	}
	
	public void multiply(int a, int b)
	{
		
	System.out.println(a*b);	
	}
	
public static void div(int a, int b)
{

	System.out.println(a/b);
	
}

public void addition(int a,int b, int c)
{
	System.out.println(a+b+c);
}

}
