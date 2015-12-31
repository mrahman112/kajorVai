package polymorphism;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



public class reflection {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String x="getmethod";
		
		Method method=reflection.class.getMethod(x, String.class);
		method.invoke(x, "hello");
		
	}
	
	
	public static void getmethod(String x)
	{
		System.out.println("printing method  "+ x);
	}

}
