package testing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class javatraining {
	
	static int i;
	static String k;

	public static void main(String[] args) {

     /* array
      * arrayList  List
      * hashset    Set
      * 
      * hashtable
      * hashmap
      * 
		
     


*/    
		
		ArrayList<String> m=new ArrayList<String>();
		m.add(0, "hello");
		m.add(1, "hello");
		m.add(2, "hoolo");
		
		System.out.println(m.size());
		System.out.println(m.get(1));
		
		HashSet<String> n=new HashSet<String>();
		n.add("hello");
		n.add("hello");
		n.add("hello1");
		
		System.out.println(n.size());

      Iterator it=n.iterator();
      while(it.hasNext())
      {
      System.out.println(it.next());
      }
		int [] a=new int[3];
		a[0]=0;
		a[1]=1;
		a[2]=0;
		
		int[] b={4,5,8};
		
		
		
		//int y=new int();
		String l=new String();
		
		
		
	}

}
