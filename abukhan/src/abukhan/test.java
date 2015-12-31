package abukhan;

public class test {

	public static void main(String[] args) {
		int[] a={1,2,4,97,6,8,47,40};
		int highno=0;
		int result=0;
		
		for(int i=0;i<a.length;i++)
		{
			
			if(highno>a[i])
			{
				a[i]=highno;
			}
			else
			{
				highno=a[i];
			}
		}
		System.out.println(highno);

	}

}
