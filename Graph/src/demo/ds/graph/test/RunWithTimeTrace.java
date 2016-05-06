	package demo.ds.graph.test;
	
	import java.lang.reflect.Method;
	
	public class RunWithTimeTrace {
		
		public static void run(Class<?> classType, String methodName, Object... paramValues ){
			
			try{
				Object o = classType.newInstance();
				int n = paramValues.length;
				Class<?>[] arr = new Class[n];
				for(int i=0; i < n; i++){
					arr[i] = paramValues[i].getClass();
				}
							
				Method method = classType.getDeclaredMethod(methodName, arr);
				long s = System.currentTimeMillis();
				method.invoke(o, paramValues);
				long t = System.currentTimeMillis();
				System.out.println("Time Taken : " + (t - s) + " milli seconds");
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
	
	}
