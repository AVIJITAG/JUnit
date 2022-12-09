package Com.demo.main;

import java.util.Scanner;

public class PrimeORnot {
	
	public static boolean isPrime() {
		int num,i, count =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER number : ");
		
		num = sc.nextInt();
		if(num<2)
			return false;
		else {
			for(i=2; i<=num; i++) {
				if (num%1 ==0) {
					count ++;
					break;
				}
			}
			
			if(count ==0)
				return true;
			else
				
		return false;
	}}
	
}
