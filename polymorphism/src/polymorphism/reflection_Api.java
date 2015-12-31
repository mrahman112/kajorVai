package polymorphism;



import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.management.ReflectionException;

public class reflection_Api {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		String x="sampleTest";
		//String meth=read name from xls file
		Method method= ReflectionException.class.getMethod(x, String.class);
		method.invoke(method, "hello");
		
		
        System.out.println("end");
	}
	
	public static void sampleTest(String x){
		System.out.println("in sample test-- "+x);
	}

}
