package Com.JavaProject;

public class Calculator_M {
	
	
	private  int num1;
	
	private  int num2;

	public Calculator_M(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int add(int num1, int num2) {
		
		int addValue= num1+num2;
		
		return addValue;
		
	}
	
   public int sub(int num1, int num2) {
	   
	   int subValue= num1-num2;
		
		return subValue;		
	}
   
   
   public int mul(int num1, int num2) {
	   
	   int mulValue= num1-num2;
		
		return mulValue;
	   
		
	}



	
	
	

}
