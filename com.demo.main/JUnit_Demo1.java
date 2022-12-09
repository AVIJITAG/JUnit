package Com.demo.main;

public class JUnit_Demo1 {
	
	public static int max(int[]arr) {
		
		int max=0;
		for(int i=1; i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			} System.out.println("Max : "+max);
		}return max;
	} 

}
