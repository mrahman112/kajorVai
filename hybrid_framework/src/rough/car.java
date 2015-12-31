package rough;




class car {
	String name;
	
	static car c;
	
	private car()
	{
		
	}

	
	public static car getinstance()
	{
		if(c==null)
			c=new car();
		
	
	return c;
	}
}
