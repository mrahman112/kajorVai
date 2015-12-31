import java.util.Arrays;


public class CountNumbersInArray {

	public static void main(String[] args) {
		
		  int[] a = {1, 2, 3,3, 4,4, 5, 1, 2,3, 5, 9, 8, 10,101, 
				  3, 1, 2,1,1, 15, 13, 19, 1};
		    Arrays.sort(a);
		    int temp=0;
		    
		    
		    for(int i=0; i<a.length; i++)
		    {
		    int count =0;
		    if (a[i]==temp)
	        {
	        continue ;
	        }
	    else    {
		            
		   
		        for(int j=0; j<a.length; j++)
		            {
		            if (a[i]==a[j])
		                {
		                ++count;
		                temp=a[i];
		                }
		            }
		        
		        
		   System.out.println(a[i]+" found "+count+" times");    
		            
		    }
		}

	}
		
		
	}

