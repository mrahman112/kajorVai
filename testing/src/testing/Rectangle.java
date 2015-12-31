package testing;

public class Rectangle {
	
	

	public static void main(String[] args) {

String a="Bangladesh";
String c[]=new String[a.length()];




for(int j=c.length-1;j>=0;j--)
{
	String b=a.substring(j, j+1);

	c[j]=b;
	String value=c[j];
System.out.print(value);

}


	}
}
