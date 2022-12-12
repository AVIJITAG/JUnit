package Com.demo.main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnit_FirstProgram {    // class create
	
	@Test // JUnit annotation @test
	
	public void setup() {         // method create
		String str = " This is my first JUnit Programe "; // print String type
        assertEquals(" This is my first JUnit Programe ",str);	// assertEquals method to use for verify the print statement
	    System.out.println("Done");
	}

}
