package testing;

public class singleton {
	
	static singleton s;
	
	static int i;
	
	private singleton()
	{
		
	}
	
	public static singleton getmethod()
	{
		if(s==null)
			s=new singleton();
		return s;
	}
	
	public void sum()
	{
		System.out.println("hello");
	}

}
