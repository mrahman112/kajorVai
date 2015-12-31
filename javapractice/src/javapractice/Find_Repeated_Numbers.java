package javapractice;

public class Find_Repeated_Numbers {

	public static void main(String[] args) {
		
		int times=0;
		
		
		int [] x={2,2,3,5,4,4,4,6};
		int []y=new y[x];
		for (int i = 0; i < x.length; i++) {

		    for (int j = i + 1; j < x.length; j++) {

		        if (x[i] == x[j]) {
		            y[i] =x[i];
		            times[i]++;
		        }

		    }

		}
		

	}

}
