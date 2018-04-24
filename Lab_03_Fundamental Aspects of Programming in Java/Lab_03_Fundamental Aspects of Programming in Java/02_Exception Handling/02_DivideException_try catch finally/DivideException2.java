

public class DivideException2 {

    public static void main(String[] args) {
    	int result  = division(100,10);        // Line 2
        System.out.println("result : "+result);
    }

    public static int division(int totalSum, int totalNumber) {
    	boolean state =true;
        int quotient=-1;
                
    	System.out.println("Computing Division.");
    	try{
    		quotient  = totalSum/totalNumber;

    	}
    	catch(Exception e){
            state=false;
    		System.out.println("Exception : "+ e.getMessage());
    	}
    	finally{
    		if(state){
    			System.out.println("Finally Block Executes");
    			System.out.println("Result : "+ quotient);
    		}else{
    			System.out.println("Finally Block Executes. Exception Occurred");
    			return quotient;
    		}

    	}
    	return ((state)?0:-1);
    }
}