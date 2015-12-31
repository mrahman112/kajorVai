package testing;

public class Recursion {

	public static void main(String[] args) {
		
		System.out.println(callMethodItself(4));
		

	}
	
	public static int callMethodItself(int i)
	{
		if(i==1)
			return 1;
		else
		{
			return i* callMethodItself(i-1);
		}
	}

}
