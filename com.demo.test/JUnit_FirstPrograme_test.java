package Com.demo.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import Com.demo.main.JUnit_FirstProgram;

public class JUnit_FirstPrograme_test {
	public static void main(String...argd) {
		Result result = JUnitCore.runClasses(JUnit_FirstProgram.class);
		 for(Failure faliure : result.getFailures()) {
			 System.out.println(faliure.toString());
		 }
		     System.out.println("Result == "+result.wasSuccessful());
	}

}
