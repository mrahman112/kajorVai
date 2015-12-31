package javapractice;

public class secondlargestNo {

	public static void main(String[] args) {
		
		int[]a={2,65,85,45,47,90,99,115,117,557,899,890};
		int highestno=0;
		
		for(int i=0;i<=a.length-1;i++){
			int selectedno=a[i];
			
			if(selectedno >highestno)
			{
				highestno=selectedno;
			}
			
			
		}
		int firsthno=highestno;
		
		highestno=0;
		int secondhno=0;
		for(int i=0;i<=a.length-1;i++)
		{
			
			int selectedno=a[i];
			if(selectedno !=firsthno)
			{
				if(selectedno>highestno)
				{
					highestno=selectedno;
					
					secondhno=highestno;
				}
			}
		}
		
		System.out.println("first highest no is "+firsthno);
		System.out.println("second highest no is "+secondhno);

	}

}
