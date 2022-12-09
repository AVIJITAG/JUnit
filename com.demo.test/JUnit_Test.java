package Com.demo.test;
import Com.demo.main.JUnit_Demo1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnit_Test {
       @Test
       
       public void max() {
    	  assertEquals(8,JUnit_Demo1.max(new int[]{1,2,8,4,6}));
    	  assertEquals(1,JUnit_Demo1.max(new int []{-1,-2,8,4,-6}));
       }
}
