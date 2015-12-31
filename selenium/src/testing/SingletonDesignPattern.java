package testing;

public class SingletonDesignPattern {
	
	static SingletonDesignPattern s;
	
	public SingletonDesignPattern()
	{
		
		
		
	}
	
	
	public static SingletonDesignPattern getInstance()
	{
		if(s==null)
		{
			s=new SingletonDesignPattern();
		}
		
		return s;
	}

}
