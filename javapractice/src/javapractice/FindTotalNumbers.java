package javapractice;

public class FindTotalNumbers {

	public static void main(String[] args) {

     int [] a={2,2,4,5,6,6,8,9,9,9};
     
     int count=0;
     int selectedno=0;
     int totalno=0;
     
     for(int i=0;i<=a.length;i++)		
     {
    	 
    	selectedno=a[i];
    	
    	for(int j=0;j<=a.length;j++)
    	{
    		totalno=a[j];
    		
    		if(selectedno==totalno)
    		{
    			count=count+1;
    			
    		}
    		
    	}
    	 
    	count=0;
    	System.out.println("total no "+selectedno+"is "+count);
     }
    

	}

}
