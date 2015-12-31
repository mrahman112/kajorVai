package learningsel;

public class static_nonststic {
	
	int i;
	static int j;

	public static void main(String[] args) {
		
		
		static_nonststic t=new static_nonststic();
		t.i=100;
		t.j=200;
		j=300;
		

	}
	
	
	public void test1()
	{
		System.out.println("pass");
	}
	
	public static void test2()
	{
		System.out.println("pass1");
	}

}
