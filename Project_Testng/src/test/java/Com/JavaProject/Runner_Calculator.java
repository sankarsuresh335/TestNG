package Com.JavaProject;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Runner_Calculator {
	
	
	
	
	@Test(description = "to find the sum of thevalue",priority = 1,retryAnalyzer = Com.retryAnalaysier.CustomizeRetry_A.class)
	public void validateData() {
			
		Calculator_M cal = new Calculator_M(0, 0);
		int val=cal.add(25, 15);
		
		Assert.assertEquals(40, val);
		
		
		
		
		
		
		
	}
	
	
	

}
