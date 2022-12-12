package Com.demo.test;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import Com.demo.main.Calculator;


@RunWith(Parameterized.class) // to specify its runner class name

public class Calculator_Test {
     
	private int firstnum, secondnum, result;
	
	private Calculator cal;
   
	public Calculator_Test(int firstnum, int secondnum,int result) {
	super();
	   this.firstnum = firstnum;
	   this.secondnum=secondnum;
	   this.result=result;
}        
          @Before
          public void initialize() {
        	  cal = new Calculator();
          }
          
      	@Parameterized.Parameters
		public static Collection generateData() {
			return Arrays.asList(new Object[][] {{1,2,3},{5,6,11},{3,7,10}});
		}
         
         @Test
         
         public void testing() {
        	 System.out.println("Sum of Numbers : "+result);
        	 assertEquals(result, cal.sum(firstnum, secondnum));
         }
	
	
}
