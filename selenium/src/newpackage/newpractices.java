package newpackage;

public class newpractices {

	public static void main(String[] args) {



     
     unlimitsum(2,3,4,5,6,7);

	}
	
	public static void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	
	public static void unlimitsum(int...k)
	
	{
		int total=0;
		
		for(int i:k)
		{
			//total=total+i;
			total+=i;
		}
		
		System.out.println(total);
		
	}

}
