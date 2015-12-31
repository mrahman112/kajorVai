package polymorphism;

public class point {
	
	
	int a;
	int b;

	public static void main(String[] args) {
		
		
		point p=new point();
		p.a=10;
		p.b=20;
		System.out.println(p.a+"   "+p.b);
		
		swap(p.a,p.b);
		System.out.println(p.a+"   "+p.b);
		
		swapval(p);
		System.out.println(p.a+"   "+p.b);
	}
	
	public static void swap(int x, int y)
	{
		int temp;
		temp=x;
		x=y;
		y=temp;
	}
	
	public static void swapval(point t)
	{
		int temp=t.a;
		t.a=t.b;
		t.b=temp;
	}
	
	
	

}
