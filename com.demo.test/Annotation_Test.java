package Com.demo.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Annotation_Test {

	
	    private ArrayList testList;
	    
// Using @BeforeClass , executed before all test cases
	    @BeforeClass
	    public static void onceExecutedBeforeAll() {
	        System.out.println("@BeforeClass: onceExecutedBeforeAll");
	    }
	    
// @ Repeated Test	    
	    @RepeatedTest(1)
	    public void R_T() {
	    	System.out.println("REPEATED TEST EXECUTED !!!!!!!!");
	    }
	    
	     @ParameterizedTest
	     @ValueSource(ints = {1,2,3,4,5,6})
	     public void ParameterizedTest(int num) {
	    	 if(num>3) {
	    		 System.out.println("Sucess*");
	    		 System.out.println(num);
	    	 }
	    	 else 
	    		 System.out.println("Fail");
	     }
	    
	    
	  
// Using @Before annotations, executed before each test cases	    
	    @Before
	    public void executedBeforeEach() {
	        testList = new ArrayList();
	        System.out.println("@Before: executed Before Each");
	    }
	    
	 
	    @AfterClass
	    public static void onceExecutedAfterAll() {
	        System.out.println("@AfterClass: onceExecutedAfterAll");
	    }
	    
// 	 Using @After, executed after each test cases
	    @After
	    public void executedAfterEach() {
	        testList.clear();
	        System.out.println("@After: executedAfterEach");
	    }
	 
	    @Test
	    public void EmptyCollection() {
	        assertTrue(testList.isEmpty());
	        System.out.println("@Test: EmptyArrayList");
	 
	    }
	 
	    @Test
	    public void OneItemCollection() {
	        testList.add("oneItem");
	        assertEquals(1, testList.size());
	        System.out.println("@Test: OneItemArrayList");
	    }
	 
	    @Ignore
	    public void executionIgnored() {
	 
	        System.out.println("@Ignore: This execution is ignored");
	    }
	    
// Using @Test(timeout),it can be used to enforce timeout in JUnit4 test case	    
	    @Test(timeout = 10)		
	    public void m7() {					
	        System.out.println("Using @Test(timeout),it can be used to enforce timeout in JUnit4 test case");					
	    }
	    
	}
