package testing;

public class testbasis {

	public static void main(String[] args) {

      singleton s=singleton.getmethod();
      singleton s1=singleton.getmethod();
      singleton s2=singleton.getmethod();
      singleton s3=singleton.getmethod();
      
      s.i=10;
      System.out.println(s3.i);
      


	}

}
