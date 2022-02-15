package Com.retryAnalaysier;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import Com.Properties.Common_Properties;

public class CustomizeRetry_A implements IRetryAnalyzer {
	
	int count= 1;

	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		String retrycount=Common_Properties.propertiesFile("Retry");
		
		int retry= Integer.parseInt(retrycount);
		
		if(count < retry) {
			
			count++;
			
			return true;
		}
				
		
		return false;
	}

}
