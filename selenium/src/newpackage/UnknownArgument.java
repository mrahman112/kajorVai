package newpackage;

public class UnknownArgument {

	public static void main(String[] args) {
		
		average(2,3,8,9,11);
		
	}
	
	
	public static void average(int...num)
	{
		int total=0;
		for(int i:num)
			total+=i;
		
		System.out.println(total);
	}

}
