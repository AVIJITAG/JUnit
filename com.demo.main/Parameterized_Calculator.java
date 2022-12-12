package Com.demo.main;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import Com.demo.test.Calculator_Test;

public class Parameterized_Calculator {
	public static void main(String ...Args) {
		Result result=JUnitCore.runClasses(Calculator_Test.class);
			for(Failure fail:result.getFailures()) {
				System.out.println(fail.toString());
			}System.out.println(result.wasSuccessful());
		}
	

	}


