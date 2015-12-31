package newpackage;

public class UnknownVariableLength {

	public static void main(String[] args) {
		
		System.out.println("average of your numbers "+average(2,3,4,5,6,7,8));
		
		

	}
	
	
	public static int average(int...numbers)
	{
		int total=0;
		for(int i:numbers)
			total=total+i;
		
		return total/numbers.length;
	}

}
