package rough;

public class honda {

	String name;
	static honda h;
	
	
	public honda()
	{
		
	}
	
	
	public static honda getInstance()
	{
		if(h==null)
			h=new honda();
		
		return h;
	}
	
}
