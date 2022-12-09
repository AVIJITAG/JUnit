package Com.employee;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class Employee_TEST {
	
	Object [] objarr = new Object[5];
	
	@Before
	
	public void inITInputs() {
		objarr[0]=(new Employee("Akash",123,2000));
		objarr[1]=(new Employee("Akat",121,3000));
		objarr[2]=(new Employee("deb",175,4000));
		objarr[3]=(new Employee("Avijit",143,8000));
		objarr[4]=(new Employee("Atish",193,9000));
	}
    @Test
    public void compare() {
    	// we want to convert the list of object to array of objects
    	Object[]obj = Employee.getEmpList().toArray();
    	assertArrayEquals(objarr,obj);
    }
}
