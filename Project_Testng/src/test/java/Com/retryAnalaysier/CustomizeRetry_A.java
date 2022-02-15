package Com.retryAnalaysier;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class CustomizeRetry_A implements IRetryAnalyzer {
	
	int count= 1;

	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(count < 3) {
			
			count++;
			
			return true;
		}
				
		
		return false;
	}

}
