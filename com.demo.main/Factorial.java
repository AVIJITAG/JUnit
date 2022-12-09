package Com.demo.main;

import java.util.Scanner;

public class Factorial {
    
	public static boolean fact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A number to find Factorial : ");
		int num =sc.nextInt();
		
		int fact = 1;
		int store = num;
		
		if (num>0) {
			while (num!=0) {
				fact = fact*num;
				num--;
			}
			
			System.out.println("the factorial of" + store + "is : " +fact);
			return true;
		}else {
			System.out.println("Input number must be greater than 0");
			return false;
		}
	}
}
