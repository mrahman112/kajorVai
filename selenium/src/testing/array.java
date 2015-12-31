package testing;

public class array {

	public static void main(String[] args) {
		
		System.out.println("index\tvalue");
		
		int[] a={4,5,8,7,9,4};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(i+"\t"+a[i]);
		}
		
		System.out.println(recursion(5));
		
		
	}

	public static int recursion(int n)
	{
		if(n<=1)
		{
			return 1;
		}
		else
		{
			return n+recursion(n-1);
		}
	}
}
