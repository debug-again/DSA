package demo.practice.util;

import java.lang.reflect.Method;

public class RunWithTimeTrace {
	
	public static void run(Class<?> className, String methodName, Object... values){
		
		int l = values.length;
		Class[] parameterTypes = new Class[l];
		
		for(int i=0; i< l ; i++){
			parameterTypes[i] = values[i].getClass();
		}
		
		try {
			Object obj = className.newInstance();
			Method method = className.getMethod(methodName, parameterTypes);
			long s = System.currentTimeMillis();
			method.invoke(obj, values);
			long t = System.currentTimeMillis();
			System.out.println("Time Taken : " + (t - s) + " milli seconds");	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
